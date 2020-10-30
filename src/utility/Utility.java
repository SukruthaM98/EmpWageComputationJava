package utility;

import utility.IComputeEmpWage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class Utility implements IComputeEmpWage {

    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;


    //Constructor
    public Utility() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourInMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHourInMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }

    public void computeEmpWage() {

        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }


    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    private int computeEmpWage(CompanyEmpWage computeEmpWage) {
        // Variable
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= computeEmpWage.maxHourInMonth && totalWorkingDays <= computeEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 2;
            int empCheck1 = (int) empCheck;

            switch (empCheck1) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Present");
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("PartTime");
                    break;
                default:
                    System.out.println("absent");
            }
            totalEmpHrs += empHrs;
            System.out.println("Day:" + totalWorkingDays + " Employee Working Hours:" + empHrs);
        }
        return totalEmpHrs * computeEmpWage.empRatePerHour;
    }
}
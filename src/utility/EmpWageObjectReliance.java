package utility;

public class EmpWageObjectReliance {

    private int WorkingDays;
    private int MaxHrsInMonth;
    private  int EmpRatePerHour;
    private String company;

    public EmpWageObjectReliance() {

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public int getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(int workingDays) {
        WorkingDays = workingDays;
    }

    public int getMaxHrsInMonth() {
        return MaxHrsInMonth;
    }

    public void setMaxHrsInMonth(int maxHrsInMonth) {
        MaxHrsInMonth = maxHrsInMonth;
    }

    public int getEmpRatePerHour() {
        return EmpRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        EmpRatePerHour = empRatePerHour;
    }
}

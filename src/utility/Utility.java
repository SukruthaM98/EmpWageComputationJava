package utility;

/** @author Sukrutha Manjunath
 * Create Date : 17th-october-2020
 * Functionality :This is utility file which contains logic
 *                of all codes of EmpWageComputationJava
 *                project
 */
public class Utility {
    int Is_present = 1;
    public double GenerateRandom() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        return empCheck;
    }
    /**
     *Functionality : This function contains logic for checking
     *                whether the employee is present or absent
     *
     */

    public int EmpAttendance() {
        double attendance = GenerateRandom();
        if (attendance == Is_present)
            return 1;
        else
            return 0;
    }
    public int DailyWage() {
        int empRatePerHr=20;
        int empHrs=8;
        int salary;
        double attend = GenerateRandom();
        if (attend == Is_present)
           return salary = empRatePerHr*empHrs;
        else
            return 0;
    }
}

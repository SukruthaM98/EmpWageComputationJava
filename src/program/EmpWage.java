package program;
import utility.Utility;
/**@author Sukrutha Manjunath
 * Create Date   : 17th-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Utility util=new Utility();
        double attendance = util.EmpAttendance();
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}

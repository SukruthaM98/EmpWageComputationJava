package program;
import utility.EmpWageObject;
import utility.Utility;
import java.util.ArrayList;

/**@author Sukrutha Manjunath
 * Create Date   : 17th-october-2020
 * Modified Date : 21st-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmpWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //storing daily wage along with total wage

        Utility empWageBuilder = new Utility() {
            @Override
            public int getTotalWage() {
                return 0;
            }
        };
        empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
        empWageBuilder.computeEmpWage();

    }
}

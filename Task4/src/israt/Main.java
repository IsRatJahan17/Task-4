package israt;

	import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.print("Please Enter a Number: ");
                int n = input.nextInt();
                MyCalculator calculator = new MyCalculator();

                System.out.println("Sum of the Divisor = " +calculator.divisorSum(n));

                System.out.println(n+ "! = " +calculator.findFactorial(n));

            }
        }
/*Name: Israt Jahan
 * ID: 2012020163
 * Section: D
 * Email: cse_2012020163@lus.ac.bd
 * Date: 16/10/2021
 */



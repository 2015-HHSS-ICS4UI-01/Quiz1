
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rayan4858
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        while (true) { // starts a loop 
            System.out.print("Enter in number to classify: "); //asks for a number
            int n = input.nextInt();//enters a number
            int nd = n * 2; //doubles the number waht was input so it can be used later 
            int divisors = 0; //int for storing divisors

            if (n == 0) {
                break;
            }

            //starts at 1 and gets the mod of the number to determine if it is a factor and adds it if it is a factor
            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {

                    divisors += i;

                }
            }

            if (divisors == nd) { 
                System.out.println(n + " is a perfect number");
            } else if (divisors > nd) {
                System.out.println(n + " is an abundant number");
            } else if (divisors < nd) {
                System.out.println(n + " is an deficient number");
            }

        }




    }
}

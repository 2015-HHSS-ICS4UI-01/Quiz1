
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
        while (true) {
            System.out.print("Enter in number to classify: ");
            int n = input.nextInt();
            int nd = n * 2;
            int divisors = 0;

            if (n == 0) {
                break;
            }


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

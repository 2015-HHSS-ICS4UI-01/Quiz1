
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, total = 0; //n becomes the entered number, total is sum of divisors
        while (true) {
            System.out.println("Enter in a number to classify");
            n = in.nextInt();
            if (n == 0) { 
                break; //exits while loop when 0 is entered
            }
            for (int i = 1; i <= n / 2; i++) { //i is first divisor, stops if i becomes more than half n
                for (int j = n; j >= i; j--) { //j is other divisor, stops if j is less than other divisor
                    if (i * j == n) { //if the divisors multiply to make n, add them to total
                        total = total + i + j;
                        if (i == j) { //if divisors match, subtract one of the divisors
                            total = total - j;
                        }
                        break; // break if found j divisor that matches i divisor
                    }
                }
            }
            //outputs what type of number n is
            if (total == n * 2) { 
                System.out.println(n + " is a perfect number");
            } else if (total > n * 2) {
                System.out.println(n + " is an abundant number");
            } else if (total < n * 2) {
                System.out.println(n + " is a deficient number");
            }
            total = 0; //resets total
        }
    }
}

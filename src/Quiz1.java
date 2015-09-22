
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vonhn0812
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);                  //scanner for input
       while(true){                                             //loop to run constantly 
        System.out.println("Enter in a number to classify");    //output asking for input
        int n = scan.nextInt();                                 //n = user input

        int div = 0;                                            //variable for divisors

        for (int i = n; i > 0; i--) {                           //for loop for adding the even divisiors of the number
            if (n % i == 0) {                                   //if n % a number = 0, n is divided evenly by the number
                div += i;                                       //add the divisors up
            }
        }

        if (div == (2 * n)) {
            System.out.println(n + " is a perfect number");     //if the divisors = 2 times the number its perfect
        }
        if (div < (2 * n)) {
            System.out.println(n + " is a deficient number");   //if the divisors are less than 2 times the number its deficient
        } else if (div > (2 * n)) {
            System.out.println(n + " is an abundant number");    //if the divisors are more than 2 times the number its abundant;
        }
       }

    }
}

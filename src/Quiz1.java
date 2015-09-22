
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter in a number to classify"); // asking for input

            int number = input.nextInt();
            int sum = 0; // integer that will hold the sum of the divisors

            if (number == 0) { // to test whether input was 0, in order to end the program
                break;
            } else { // if input is not 0

                for (int x = 1; x <= number; x++) { // in order to determine its divisors
                    if (number % x == 0) { //if the number is divisible by x
                        sum += x; //adding the divisors together
                    }
                }

                if (sum == number * 2) { // if the sum of the divisors is exactly double the value of the initial number
                    System.out.println(number + " is a perfect number");
                } else if (sum < number * 2) { // if the sum of the divisors is less than double the value of number
                    System.out.println(number + " is a deficient number");
                } else if (sum > number * 2) { // if the sum of the divisors is more than double the value of number
                    System.out.println(number + " is an abundant number");
                }
            }
        }
    }
}

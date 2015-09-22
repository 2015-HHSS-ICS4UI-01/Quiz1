
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author haidj9901
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //initalize the scanner
        while (true) { //continue looping until an if statement tells it to break
            System.out.println("Enter in a number to classify");
            int total = 0; //number used to store the total sum of the divisors of a number
            int number = input.nextInt(); //store the number inputted by the user
            if (number == 0) {
                break; //break if 0 is inputted
            }
            for (int x = 1; x <= number; x++) { //iterate from 1 until the number
                if (number % x == 0) { //if the remainder is 0, x wis a divsisor
                    total += x; //add x to the total
                }
            }
            if (total == number * 2) { //if the total is the same as twice the number
                System.out.println(number + " is a perfect number");
            } else if (total < number * 2) { //if the total is less than twice the number
                System.out.println(number + " is a deficient number");
            } else if (total > number * 2) { //if the total is more than twice the number
                System.out.println(number + " is an abundant number");
            }
        }
    }
}

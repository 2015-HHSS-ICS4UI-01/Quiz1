
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the scanner
        Scanner input = new Scanner(System.in);
        
        //initializes the number to be inputted as a variable
        int num = 1;
        
        //while user inputted number is not equal to 0
        while(num != 0)
        {
            //initializes the sum of all divisors of user's number as a variable equal to 0
            int sum = 0;
            
            //asks the user to input a number
            System.out.println("Enter in a number to classify.");
            //set varible num to the user's number
            num = input.nextInt();
            
            //if user number is less than 0
            if(num < 0)
            {
                //inform user of error, allow them to reenter their number
                System.out.println("ERROR: Number must be a positive integer.");
            //if user number is greater than 0
            }else if (num > 0){
                //find the divisors for the user's number
                for(int i = 1; i <= num; i++)
                {
                    //calculate the number of divisors for the user's number
                    //if remainder of user's number divided by i is 0
                    if(num % i == 0)
                    {
                        //add the quotient to the sum of all number's divisors
                        sum  = sum + (num / i);
                    }   
                }
                
                //if the sum of the numbers is equal to user's number * 2
                if(sum == (num*2))
                {
                    //inform user their number is perfect
                    System.out.println(num + " is a perfect number.");
                }
                
                //if the sum of the numbers is less than user's number * 2
                if(sum < (num*2))
                {   //inform user their number is deficient
                    System.out.println(num + " is a deficient number.");
                }
                
                //if the sum of the numbers is greater than user's number * 2
                if(sum > (num*2))
                {   //inform user their number is abundant
                    System.out.println(num + " is an abundant number.");
                }
             
            }
        }
    }
}

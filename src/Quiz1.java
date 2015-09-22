
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
          System.out.println("Enter in a number to classify");
          int num = input.nextInt(); // stores the inputted number as an integer
              
          if(num == 0) 
          {   //if the integer is 0, end the program
              return;
          }else
          {
              int twice = num * 2; //creates an integer that is twice the number
              int sum = 0; //creates the currently empty integer for the sum
              for(int i = 1; i <= num; i++)
              {    //checking if the number "i" is a divisor to the number
                   int div = num % i;
                   if(div == 0)
                   {
                       sum = sum + i; //add the divisor "i" to the sum total
                   }
              }
              if(sum > twice)
              {   //outputs when the sum of digits is greater than twice the number
                  System.out.println(num + " is an abundant number"); 
              }else if(sum == twice)
              {   //outputs when the sum of digits is equal to twice the number
                  System.out.println(num + " is a perfect number");      
              }else if(sum < twice)
              {   //outputs when the sum of digits is less than twice the number
                  System.out.println(num + " is a deficient number");
              }
          }
        }
          
    }
}

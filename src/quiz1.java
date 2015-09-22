
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //exit program 
      boolean exit = false;
      //repeat program until 0 is pressed
      while (exit == false)
      {
       System.out.println("Enter in a number to classify");
       // number is inputed number
       int number = input.nextInt();
       // sum is the sum of the divisers
       int sum = 0;
       //exit while loop
        if (number ==0)
        {
        exit = true;
        }
        //finding the divisers of i and adding them together
       for(int j = 1; number >= j; j++)
            {
               if (number%j ==0)
               {
                    sum = sum + j;
               }

            } 
       // if double number is the same as the sum of the divisers
       if (number*2 == sum && number>0)
       {
           System.out.println(number + " is a perfect number"); 
       }
       // if double number is the less than the sum of the divisers
       else if (number*2 > sum && number>0)
       {
           System.out.println(number + " is a deficient number");
       }
       // if double number is the greater than the sum of the divisers
       else if(number>0)
       {
           System.out.println(number + " is an abundant number");
       }
    }
    }
}

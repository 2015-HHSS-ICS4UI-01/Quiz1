
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //make a counter to keep count of all the divisors that work
        int count=0;
        
        //keep repeating when its able to
        while (true)
        { 
            //keep asking for a number
            System.out.println("enter a number to classify");
            int num = input.nextInt();
            //if the number is 0 break the loop and end the program
        if(num == 0)
        {
            break;
        }
        //make an int divider that is 1
        //while divider is greater than the number or equal to the number add 1 to the divider 
        for(int div =1; div <=num; div++)
        {
            //if the number divided by the divisor has a remainder of 0
            //add the divisor to the count
            if(num%div == 0)
            {
                count +=div;
            }
            
        }
        // if the counter equals the number inputed multiplied by 2
        //it is a perfect number
        if(count ==(num*2))
            {
                System.out.println(num+ "  is a perfect number");
            }
        // if the counter is less than the number inputed multiplied by 2
        // it is an abundant number
            else if(count >(num*2))
            {
                 System.out.println(num+ "  is an abundant number");
            }
            // if the counter is more than the number inputed multiplied by 2
            //it is a deficient number
            else if(count<(num*2))
            {
                System.out.println(num+ " is a deficient number");
            }
        
        } 


        
    }
}


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        while (exit == false)
        {
            System.out.println("Please enter in a number to classify");
            int number = input.nextInt();
            if (number == 0)
            {
                exit = true;
            }
            int total = 0;
            for (int i = 1; i<=number; i++)
            {
                int n = i;
                if (number%i==0)
                {  
                   total = total + n;
                }
            }
            
                    if (total == number*2)
                    {
                        System.out.println(number + " is a perfect number");
                    }
                    
                    if (total < number*2)
                    {
                        System.out.println(number + " is a deficient number");
                    }
                    
                    if (total > number *2)
                    {
                        System.out.println(number + " is an abundant number ");
                    }
                    
                }
        
        
        
        
            }
   }
        
    


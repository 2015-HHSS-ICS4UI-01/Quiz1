
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int factor = 0;
        int number = 0;
        
        boolean run = true;
        
            
            
        
        
        
        while(run)
        {
            
          System.out.println("Enter in a number to classify");
            number = input.nextInt();
        
        if ( (number % 2) == 0 )
            {
                 factor = factor + 2;     
            }
            
            if (number == 0)
            {
                run = false;
            }
            
            if ( factor > number && number != 0 )
            {
                System.out.println(number + " is an abundunt number");
            }
            else if ( factor < number )
            {
                System.out.println(number + " is a deficient number");
            }
            else if (factor == number && number != 0)
            {
                System.out.println(number + " is a perfect number");
            }
        }
        
        
        
    }
}

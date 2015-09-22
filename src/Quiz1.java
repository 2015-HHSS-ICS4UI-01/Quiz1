
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        boolean done = false;
        int n = 0;
        int sum = 0;
        int div = 0;
        
        //loop to continuously run until "0" is entered
        while(done != true)
        {
            //ask the user to input a number
            System.out.println("Enter a number to classify");
            n = input.nextInt();
            sum = 0;
            div = 0;

            //checks if the nuber is "0" and if it is the program ends
            if(n == 0)
            {
                done = true;
            }else
            {

                for(int i = n; i--)
                {
                    
                }                
                
                
                //determins what the number is classified as
                if(sum == 2*n)
                {
                    System.out.println(n + " is a perfect number");
                }else if(sum > 2*n)
                {
                    System.out.println(n + " is an abundant number");
                }else if(sum < 2*n)
                {
                    System.out.println(n + " is a deficient number");
                }  
            }     
        }        
    }
}

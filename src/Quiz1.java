
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murra9546
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        while(true)
        {
            //ask the user to input a number
        System.out.println("Input a number to classify");
        int n = input.nextInt();
        
        //declare variables
        int total = 0;
        //if the user input 0, end program
        if(n == 0)
        {
            break;
        }
        //cgo through every potential divisor
        for(int i = 1; i <= n; i++)
        {
            //if the remainder is 0, add it to total
            if(n%i == 0)
            {
                total += i;
            }
        }

            if((n * 2) == total)
            { //if the addition of the factors equal to twice the number
                System.out.println(n + " is a perfect number");
            }else if((n * 2) > total){ //if the addition of the factors is less than twice the number
                System.out.println(n + " is a deficient number");
            }else if((n * 2) < total){//if the addition of the factors is more than twice the number
                System.out.println(n + "is an abundant number");
            }
       
        }
        
    
}
}

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;                                           
            while(exit == false){                                       //When exit is false (when the number is not 0), run the program
                System.out.println("Enter in a number to classify");
                int num = input.nextInt();
                    if(num <= 0){                                       //If number entered is 0 or negative, do not output and exit
                        exit = true;
                    }
            else{                                                       //If number is positive and not 0
                int result = 0;                                         //Variable for the sum of the factors
                    for(int i = 1; i <= num; i++){
                        if(num%i == 0){                                 //While going through all the possible factors smaller than the entered number, if it is a factor, add that number to the variable result
                        result+=i;                                      
                        }
                    }
                if(result>(2*num)){                                     //If result is larger than 2 times the number, output abundant number
                    System.out.println(num + " is an abundant number");
                }
                else if(result<(2*num)){                                //if result is lower than 2 times the number, output deficient number
                    System.out.println(num + " is a deficient number");
                }
                else{                                                   //If result is equal to 2 times the number, output perfect number
                    System.out.println(num + " is a perfect number");
                }
                }
        }
        
        
    }
}

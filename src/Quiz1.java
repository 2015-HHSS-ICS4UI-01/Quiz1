
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author janaj4926
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        
        //answer
        int ans = 0;

        //dividing number
        int divi = 1;

        //keeps the system looping
        int[] run = new int[1];

        //running loop
        for (int n = 0; n < run.length; n++) {
            System.out.println("Enter in a number to classify");
            int num = in.nextInt();

            //exit statement
            if (num == 0) {
                break;

            } else {
                int out = 0;
                //while divisor is less than or equal to the number given
                while (divi < num+1) {
                    
                    //entering the product into the array
                    ans = num%divi;
                    if (ans==0){
                        out = out + num/divi;
                    }
                    divi++;
                    
                }
                //adding all the numbers in the array together
                
                
                //outputing
                if (out == num * 2) {
                    System.out.println(num + " is a perfect number");
                } else if (out < num * 2) {
                    System.out.println(num + " is a deficient number");
                } else if (out > num * 2) {
                    System.out.println(num + " is an abundant number");
                }
            }
        }
    }
}

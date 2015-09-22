
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to classify:");
        int n = scan.nextInt();
        int e = n * 2;
        int f = 0;

        while (true) {
            if (n == 0) { //if the person inputs 0 the while loop breaks
                break;
            }
            for (int i = n; i > 0; i--) { // will mod each number 
                    if (n%i == 0){
                        f += i;
                    } 
                }
                
               if (f == (2*n)){ // if f equals 2 X the number the person entered
                    System.out.println(n + " is a perfect number"); //outputs the number if it is perfect
                    break;
               } else if (f > (2*n)){//if f is greater than 2 X the number the person entered
                   System.out.println(n + " is an abundant number"); //outputs the number if it is abundant
                   break;
               } else if (f < (2*n)){//if f is less than 2 X the number the person entered
                   System.out.println(n + " is a deficient number"); //outputs the number if it is deficent
                   break;
               }
            
        }


    }
}

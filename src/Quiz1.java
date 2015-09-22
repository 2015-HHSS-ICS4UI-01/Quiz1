
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
            while(exit == false){
                System.out.println("Enter in a number to classify");
                int num = input.nextInt();
                    if(num <= 0){
                        exit = true;
                    }
            else{
                int result = 0;
                    for(int i = 1; i <= num; i++){
                        if(num%i == 0){
                        result+=i;
                        }
                    }
                if(result>(2*num)){
                    System.out.println(num + " is an abundant number");
                }
                else if(result<(2*num)){
                    System.out.println(num + " is a deficient number");
                }
                else{
                    System.out.println(num + " is a perfect number");
                }
                }
        }
        
        
    }
}

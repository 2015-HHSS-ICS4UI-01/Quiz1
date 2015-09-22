
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int input = -1;
        
        while (input != 0)
        {
            System.out.println("Enter in a number to classify");
            input = scanner.nextInt();
            if (input == 0) continue; // stop the program when the input is 0
            System.out.println(input + " is " + integerType(input) + " number");
        }
        
    }
    
    public static String integerType(int num) // returns the answer (abundant, deficient, perfect... ) + (a) or (an)
    {
        
        int sumOfFactors = 0;
        
        for (int i = 1; i <= num; i ++) // adds all factors to the sum
        {
            if (num % i == 0)
            {
                sumOfFactors += i;
            }
        }
        if (sumOfFactors == num*2)
        {
            return "a perfect";
        }
        if (sumOfFactors > 2*num)
        {
            return "an abundant";
        }
        return "a deficient";
    }
}

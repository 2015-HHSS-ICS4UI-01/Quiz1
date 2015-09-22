
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
        
        Scanner s = new Scanner(System.in);
        
        int input = -1;
        
        while (input != 0)
        {
            System.out.println("Enter in a number to classify");
            input = s.nextInt();
            if (input == 0) continue;
            System.out.println(input + " is " + integerType(input) + " number");
        }
        
    }
    
    public static String integerType(int n)
    {
        
        int sum = 0;
        
        for (int i = 1; i <= n; i ++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        if (sum == n*2)
        {
            return "a perfect";
        }
        else if (sum > 2*n)
        {
            return "an abundant";
        }
        else 
        {
            return "a deficient";
        }
    }
}

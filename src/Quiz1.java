
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a non negative whole number: ");
        int n = input.nextInt();
        int sum =0;
        int m=n/2;

        
        for(int i = 1 ; i == m; i = i++)
        {
            int var=0;
            var = n*i;
            if(var == n)
            {
                sum = n+i+sum;
            }
            n=n-1;
            System.out.print(sum);
        }
        
        if(sum==n)
        {
            System.out.print("Your number is perfect ");
        }else
            if(sum<=n)
            {
                System.out.print("Your number is a deficiant ");
            }else
                if(sum>=n)
            {
                System.out.print("Your number is a abundant ");
            }
    }
}

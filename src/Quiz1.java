
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
          System.out.println("Enter in a number to classify");
          int num = input.nextInt();
              
          if(num == 0)
          {
              return;
          }else
          {
              int twice = num * 2;
              int sum = 0;
              for(int i = 1; i <= num; i++)
              {
                   int temp = num % i;
                   if(temp == 0)
                   {
                       sum = sum + i;
                   }
              }
              if(sum > twice)
              {
                  System.out.println(num + " is an abundant number");
              }else if(sum == twice)
              {
                  System.out.println(num + " is a perfect number");      
              }else if(sum < twice)
              {
                  System.out.println(num + " is a deficient number");
              }
          }
        }
          
    }
}

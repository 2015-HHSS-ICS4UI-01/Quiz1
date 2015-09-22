
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean stop = false;
       
        while(stop == false){
        
        System.out.println("Please enter a number to classify");
        int num = input.nextInt();
        
         int total =0;
          for(int i = 1; i<=num;i++)
          {
              int n = i;
            
            if(num%i == 0)
            {
              total = total +n;
              
            }
          }
            
            if(total>num*2)
            {
                System.out.println(num + " is an abundant number");
            }
            if(total<num*2)
            {
                System.out.println(num + " is a deficient number");
            }
            if(total==num*2 && num != 0)
            {
                System.out.println(num + " is a perfect number");
            }
          if(num == 0)
        {
            stop = true;
        }
              
         
        
       
            
      }
        
        
        
      }
   }


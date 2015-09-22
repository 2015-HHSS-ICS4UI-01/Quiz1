/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author millg1278
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
          
         
        boolean stop = true;
        while (stop == true)
        {
           System.out.println("Enter in a number to classify");
           int n = input.nextInt();
           int f = 0;
           if(n == 0)
           {
               stop = false;
           }else
           {
               for(int i = 1; i <= n; i ++)
                   if(n%i == 0)
                
           
           if (f == n*2)
           {
              System.out.println(n + " is a perfect number");
           }else if (f > n*2)
           {
              System.out.println(n + " is an abundant number");
           }else if (f < n*2)
           {
              System.out.println(n + " is a deficient number");
           }
           }
        }
        
        
        
    }
}


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int tot = 0;
      while(true){
          
      
        
        System.out.println("Enter in a nymber to classify");
        int n = in.nextInt();
        while(n < 0)
        {
            System.out.println("enter a positive integer please");
            n = in.nextInt();
        }
       if( n > 0)
       {
        int l = n;
        int[] div = new int[l];
        for(int i=1; i <= l; i++)
        {
           if (n%i == 0)
           {
               tot+= +i + n/i;
           }
            if(tot == 2*n)
        {
            System.out.println("This is a perfect number");
        }
            if(tot > 2*n)
            {
                System.out.println("this is an abundant number");
            }
            if(tot < 2*n)
            {
                System.out.println("this is an deficent number");
            }
           
        }
       
         
        
      }
        
        
        
    }
}
}

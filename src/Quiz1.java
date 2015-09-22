
import java.util.Scanner;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Quiz1 
{
    public static void main(String[] args)
    {
        Scanner stuff = new Scanner(System.in);
        int state=0;
        int input;
        int output=0;
        int divisor=0;
        while(state==0)
        {
            System.out.println("Enter in a number to classify");
            input=stuff.nextInt();
            if (input == state)
                state = 1;
            else if(input>=1)
            {
                for (int i = 0; i < (input); i++)
                {
                    divisor=input/(i+1);
                    if (input%(i+1)==0)
                    {
                        output=output+divisor;
                    }
                }
                if ((2*input)==output)
                    System.out.println(input +" is a perfect number");
                else if((2*input)>output)
                    System.out.println(input +" is a deficient number");
                else if((2*input)<output)
                    System.out.println(input +" is a abundant number");
                output=0;
            }
        }
    }
}

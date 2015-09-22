
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
        //stating intiger to record whether to run the loop or not
        int state=0;
        //the inputed number is created, but not defined
        int input;
        //the output variable is created and set to 0
        int output=0;
        //the divisor variable is created, but not defiened 
        int divisor;
        
        //while the intiger state is 0 run the while loop
        while(state==0)
        {
            //output to the console 
            System.out.println("Enter in a number to classify");
            //input a intiger to the variable input using the scanner stuff
            input=stuff.nextInt();
            //if input is equal to state(0) than change the value of state to 1
            if (input == state)
                state = 1;
            //if input is not equal to state, then continue
            else if(input>=1)
            {
                //for loop running until i is equal to input
                for (int i = 0; i < input; i++)
                {
                    //divisor is equal to input divided to i+1
                    divisor=input/(i+1);
                    //if the remander of input devided by i+1 is equal to 0 then 
                    if (input%(i+1)==0)
                    {
                        //output is equal to output + divisor
                        output=output+divisor;
                    }
                }
                //if input multiplied by 2 is equals the output then the input is a perfect number
                if ((2*input)==output)
                    System.out.println(input +" is a perfect number");
                //if input multiplied by 2 is greater than the output then the input is a deficiet number
                else if((2*input)>output)
                    System.out.println(input +" is a deficiet number");
                //if input multiplied by 2is less than the output, than the input is a abundant number
                else if((2*input)<output)
                    System.out.println(input +" is a abundant number");
                output=0;
            }
        }
    }
}

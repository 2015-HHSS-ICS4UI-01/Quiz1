
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thomt9963
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter in a number to classify");
        while (flag == true) {
            int b = 0;
            int n = input.nextInt();
            for (int count = 1; n % count == 0; count++) {
                if (n % count == 0) {
                    b = b + count;
                }

                if (b + n == 2 * n) {
                    System.out.println(n + "Is a perfect number.");
                }

            }
            if (n == 0) {
                System.exit(0);
            }
        }
    }
}

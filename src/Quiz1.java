
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, total = 0;
        while (true) {
            System.out.println("Enter in a number to classify");
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            for (int i = 1; i < n / 2; i++) {
                for (int j = n; j >= i; j--) {
                    if (i * j == n) {
                        total = total + i + j;
                        if (i == j) {
                            total = total - j;
                        }
                        break;
                    }
                }
            }
            if (total == n * 2) {
                System.out.println(n + " is a perfect number");
            } else if (total > n * 2) {
                System.out.println(n + " is an abundant number");
            } else if (total < n * 2) {
                System.out.println(n + " is a deficient number");
            }
            total = 0;
        }
    }
}

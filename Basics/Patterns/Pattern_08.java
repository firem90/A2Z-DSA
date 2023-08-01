package Patterns;

import java.util.Scanner;

/*
Input: 5
Output:
*********
 *******
  *****
   ***
    *
*/
public class Pattern_08 {
    public static void pattern(int n) {
        int x = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * x - 1; k++) {
                System.out.print("*");
            }
            x--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        pattern(number);
        scanner.close();
    }

}

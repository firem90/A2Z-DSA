package Patterns;

import java.util.Scanner;

/*
Pattern:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
public class Pattern_20 {
    public static void pattern(int n) {
        int temp = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int k = temp; k >= 1; k--) {
                System.out.print(" ");
            }
            temp = temp - 2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int k = 1; k <= (n - i) * 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
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

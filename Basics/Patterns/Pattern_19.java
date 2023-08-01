package Patterns;

import java.util.Scanner;

/*
Pattern:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
********** 
*/
public class Pattern_19 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (2 * i - 2); k++) {
                System.out.print(" ");
            }
            for (int l = i; l <= n; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (2 * i - 2); k++) {
                System.out.print(" ");
            }
            for (int l = i; l <= n; l++) {
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

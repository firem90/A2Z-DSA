package Patterns;

import java.util.Scanner;

/*
Input: 5
Output:
* 
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
public class Pattern_10 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n; i > 1; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print("*" + " ");
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

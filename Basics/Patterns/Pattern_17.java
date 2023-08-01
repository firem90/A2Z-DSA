package Patterns;

import java.util.Scanner;

/*
Pattern: (n = 4)
   A
  ABA
 ABCBA
ABCDCBA
*/
public class Pattern_17 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int val_1 = 65;
            int val_2 = 65 + i - 2;
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for first triange
            for (int k = 1; k <= i; k++) {
                System.out.print((char) val_1);
                val_1++;
            }
            // for second triange
            for (int l = 2; l <= i; l++) {
                System.out.print((char) val_2);
                val_2--;
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

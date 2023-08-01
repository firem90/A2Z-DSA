package Patterns;

import java.util.Scanner;

/*
Pattern:
ABCDE
ABCD
ABC
AB
A 
*/
public class Pattern_15 {
    public static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            int val = 65;
            for (int j = 0; j != i; j++) {
                System.out.print((char) val);
                val++;

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

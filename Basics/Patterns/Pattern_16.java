package Patterns;

import java.util.Scanner;

/*
Pattern:
A
BB
CCC
DDDD
EEEEE 
*/
public class Pattern_16 {
    public static void pattern(int n) {
        int val = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j != i; j++) {
                System.out.print((char) val);
            }
            val++;
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

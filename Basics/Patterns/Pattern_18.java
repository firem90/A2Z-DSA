package Patterns;

import java.util.Scanner;

/*
Pattern:
E
E D
E D C
E D C B
E D C B A 
*/
public class Pattern_18 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int val = 65 + n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) val + " ");
                val--;
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

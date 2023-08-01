package Patterns;

import java.util.Scanner;

/*
 Pattern :
    *****
    *****
    *****
    *****
    *****
*/
public class Pattern_01 {
    public static void pattern(int n) {
        for (int i = 0; i != n; i++) { // rows
            for (int j = 0; j != n; j++) { // columns
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

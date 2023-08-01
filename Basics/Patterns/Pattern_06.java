package Patterns;

import java.util.Scanner;

/*
    Input: 5
    Output:
    1 2 3 4 5
    1 2 3 4
    1 2 3 
    1 2  
    1 
 */
public class Pattern_06 {
    public static void pattern(int n) {
        for (int i = 0; i != n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
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

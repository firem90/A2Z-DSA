package Patterns;

import java.util.Scanner;

/*
 Pattern:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15   
*/
public class Pattern_13 {
    public static void pattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j != i; j++) {
                System.out.print(Integer.toString(k) + " ");
                k++;
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

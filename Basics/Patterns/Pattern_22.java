package Patterns;

import java.util.Scanner;

/*
Pattern: (n=4)
4 4 4 4 4 4 4 
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


Hints:
2D Matrix - 
n = 4
row and col = 7 i.e., 2n-1
top = i
left = j
right = (2n-1) - 1 - j
bottom = (2n-1) - 1 - i
*/
public class Pattern_22 {
    public static void pattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 1) - 1 - j;
                int bottom = (2 * n - 1) - 1 - i;
                int value = n - Math.min(Math.min(top, left), Math.min(right, bottom));
                System.out.print(value + " ");
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

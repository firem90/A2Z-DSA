package Patterns;

import java.util.Scanner;

/*
 Pattern:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1    
*/
public class Pattern_11 {
    public static void pattern(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                k = 0;
            } else {
                k = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                if (k == 1) {
                    k = 0;
                } else {
                    k = 1;
                }
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

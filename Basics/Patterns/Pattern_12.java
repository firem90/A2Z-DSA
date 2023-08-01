package Patterns;

import java.util.Scanner;

/*
 Pattern:
*   
**  
*** 
****    
*/
public class Pattern_12 {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // loop for spaces -
            // Here mutiplied by 4 because e.g., n = 4 so spaces are like 12,8,...
            for (int k = 1; k <= (4 * (n - i)); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
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

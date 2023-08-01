import java.util.Scanner;

public class UserIO {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        if(c - 65 >= 0 && c - 65 <= 26) {
            System.out.println(1);
        } else if(c-97 >= 0 && c-97 <= 26) {
            System.out.println(0);
        } else 
            System.out.println(-1);

    }
}

import java.util.Scanner;

public class SumOfEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int even = 0;
		int odd = 0;

		while(n > 0) {
			int i = n % 10;
			if(i%2 == 0) even += i;
			else odd += i;

			n = n/10;
		}

		System.out.println(even + " " + odd);

	}
}

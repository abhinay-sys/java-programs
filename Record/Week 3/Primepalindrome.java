
import java.util.Scanner;
public class Primepalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;

		while (temp > 0) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (reverse == n && count == 2)
			System.out.println(n + " is a Prime Palindrome");
		else
			System.out.println(n + " is not a Prime Palindrome");

		sc.close();
	}
}

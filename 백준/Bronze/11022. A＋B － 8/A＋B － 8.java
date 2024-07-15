

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		n = n + 1;
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			// Case #1: 1 + 1 = 2
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
	}
}
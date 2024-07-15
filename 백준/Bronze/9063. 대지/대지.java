

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("0");
		} else {
			int minX = Integer.MAX_VALUE, maxX= Integer.MIN_VALUE, minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				minX = Math.min(minX, a);
				maxX = Math.max(maxX, a);
				minY = Math.min(minY, b);
				maxY = Math.max(maxY, b);
			}

			System.out.println((maxX - minX) * (maxY - minY));
		}
	}
}



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[][] arr = new boolean[101][101];

		int result = 0;
		for (int k = 0; k < n; k++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int i = a; i < a + 10; i++) {
				for (int j = b; j < b + 10; j++) {
					if (!arr[i][j]) {
						arr[i][j] = true;
						result++;
					}
				}
			}
		}

		System.out.println(result);
	}
}

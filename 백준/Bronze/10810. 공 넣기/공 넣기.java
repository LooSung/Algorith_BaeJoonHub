

import java.util.*;

public class Main {
	public static void main(String[] args) {
/*
5 4
1 2 3
3 4 4
1 4 1
2 2 2
*/

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			for (int j = a - 1; j < b; j++) {
				arr[j] = c;
			}
		}

		for (int j : arr) {
			System.out.print(j + " ");
		}
	}
}
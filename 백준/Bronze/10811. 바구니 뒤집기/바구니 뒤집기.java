

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			int lt = sc.nextInt() - 1;
			int rt = sc.nextInt() - 1;

			while (lt < rt) {
				int temp = arr[lt];
				arr[lt++] = arr[rt];
				arr[rt--] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}

		int[] base = {1, 1, 2, 2, 2, 8};

		for (int i = 0; i < 6; i++) {
			if (arr[i] == base[i]) {
				System.out.print(0 + " ");
			} else {
				System.out.print(base[i] -  arr[i] + " ");
			}
		}

	}
}
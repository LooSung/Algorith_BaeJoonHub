package code.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
*/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		int m = sc.nextInt();

		int[] result = new int[m];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int cnt = 0;

			for (Integer b : arr) {
				if (a == b) {
					cnt++;
					result[i] = cnt;
				}
			}
		}

		for (int j : result) {
			System.out.print(j + " ");
		}
	}
}



import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 10 5
		//1 10 4 9 2 3 8 5 7 6

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			if (a < m) {
				list.add(a);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
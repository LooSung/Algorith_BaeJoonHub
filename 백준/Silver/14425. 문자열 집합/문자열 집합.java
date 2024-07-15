

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<String> baseList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			baseList.add(sc.next());
		}

		int result = 0;
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			arr.add(sc.next());
		}

		for (String s : arr) {
			if (baseList.contains(s)) {
				result++;
			}
		}

		System.out.println(result);
	}
}

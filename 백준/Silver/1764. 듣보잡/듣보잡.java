

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<String> lis = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			lis.add(sc.next());
		}

		// lok을 HashSet으로 변환하여 contains 연산을 빠르게 수행
		HashSet<String> lokSet = new HashSet<>();
		for (int i = 0; i < m; i++) {
			lokSet.add(sc.next());
		}

		int resCnt = 0;
		ArrayList<String> res = new ArrayList<>();
		for (String item : lis) {
			if (lokSet.contains(item)) {
				resCnt++;
				res.add(item);
			}
		}

		Collections.sort(res);

		System.out.println(resCnt);
		for (String re : res) {
			System.out.println(re);
		}
	}
}

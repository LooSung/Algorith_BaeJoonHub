

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashSet<Integer> set1 = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set1.add(sc.nextInt());
		}

		HashSet<Integer> set2 = new HashSet<>();
		for (int i = 0; i < m; i++) {
			set2.add(sc.nextInt());
		}

		// 첫 번째 집합에서 두 번째 집합의 요소를 제거하여 차집합 계산
		HashSet<Integer> difference1 = new HashSet<>(set1);
		difference1.removeAll(set2);

		// 두 번째 집합에서 첫 번째 집합의 요소를 제거하여 차집합 계산
		HashSet<Integer> difference2 = new HashSet<>(set2);
		difference2.removeAll(set1);

		System.out.println(difference1.size() + difference2.size());
	}
}

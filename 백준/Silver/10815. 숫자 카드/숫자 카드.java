
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}

		int m = sc.nextInt();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			arr2.add(sc.nextInt());
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i : arr2) {
			if (set.contains(i)) {
				result.add(1);
			} else {
				result.add(0);
			}
		}

		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
	}
}

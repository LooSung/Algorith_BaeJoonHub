

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			char[] chars = s.toCharArray();

			String fst = String.valueOf(chars[0]);
			String end = String.valueOf(chars[chars.length - 1]);

			System.out.println(fst + end);
		}

	}
}
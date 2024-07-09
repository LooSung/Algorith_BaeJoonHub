

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		char[] chars = str.toCharArray();

		System.out.print(chars[n - 1]);

	}
}
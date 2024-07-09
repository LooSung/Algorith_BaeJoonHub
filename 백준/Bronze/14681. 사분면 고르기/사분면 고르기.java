

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int result = 0;
		if (n > 0 && m > 0) {
			result = 1;
		} else if (n < 0 && m > 0) {
			result = 2;
		} else if (n < 0 && m < 0) {
			result = 3;
		} else if (n > 0 && m < 0) {
			result = 4;
		}

		System.out.println(result);
	}
}
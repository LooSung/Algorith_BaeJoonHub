

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		while (n > 0) {
			list.add(n % 10);
			n /= 10;
		}

		list.sort(Collections.reverseOrder());

		for (Integer integer : list) {
			System.out.print(integer);
		}
	}
}

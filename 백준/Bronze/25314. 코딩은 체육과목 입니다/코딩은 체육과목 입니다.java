

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cal = n / 4;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cal; i++) {
			sb.append("long" + " ");
		}

		System.out.println(sb + "int");
	}
}
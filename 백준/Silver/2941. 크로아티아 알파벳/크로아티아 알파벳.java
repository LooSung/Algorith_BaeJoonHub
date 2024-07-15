

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for (String croatia : croatias) {
			if (str.contains(croatia)) {
				str = str.replace(croatia, "*");
			}
		}

		System.out.println(str.length());
	}
}


import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int len = str.length();

		boolean flag = true;

		for(int i = 0 ; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				flag = false;
				break;
			}
		}


		if (flag) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
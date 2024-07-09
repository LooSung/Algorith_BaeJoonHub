

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int nRevers = 0;
		int mRevers = 0;

		while(n != 0) {
			int tmp = n % 10;
			nRevers = nRevers * 10 + tmp;
			n /= 10;
		}

		while(m != 0) {
			int tmp = m % 10;
			mRevers = mRevers * 10 + tmp;
			m /= 10;
		}

		System.out.print(Math.max(nRevers, mRevers));
	}
}
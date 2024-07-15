

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			int n = sc.nextInt();

			if (n == -1) break;

			sb.append(n).append(" = 1");

			int sum = 1;
			for(int i = 2; i < n; i++){
				if(n%i == 0){
					sb.append(" + ").append(i);
					sum+=i;
				}
			}

			if (sum == n) {
				System.out.println(sb);
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}

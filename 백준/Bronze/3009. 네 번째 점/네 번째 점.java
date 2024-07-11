

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ax1 = {sc.nextInt(), sc.nextInt()};
		int[] ax2 = {sc.nextInt(), sc.nextInt()};
		int[] ax3 = {sc.nextInt(), sc.nextInt()};

		int x, y;

		if(ax1[0] == ax2[0]) x = ax3[0];
		else if(ax2[0] == ax3[0]) x = ax1[0];
		else x = ax2[0];

		if(ax1[1] == ax2[1]) y = ax3[1];
		else if(ax2[1] == ax3[1]) y = ax1[1];
		else y = ax2[1];

		System.out.println(x + " " + y);

	}
}

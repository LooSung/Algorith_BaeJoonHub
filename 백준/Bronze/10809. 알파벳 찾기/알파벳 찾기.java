

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int[] charArr = new int[26];
		Arrays.fill(charArr, -1);

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);

			if(charArr[c-97] == -1){
				charArr[c-97] = i;
			}
		}

		for (int index : charArr){
			System.out.print(index+" ");
		}

	}
}
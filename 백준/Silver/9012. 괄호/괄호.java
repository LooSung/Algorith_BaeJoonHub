import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n-- > 0) {
			String s = sc.next();
			boolean isValid = true;

			Stack<Character> stack = new Stack<>();
			for (char c : s.toCharArray()) {
				if (c == '(') {
					stack.push(c);
				} else {
					if (stack.empty()) {
						System.out.println("NO");
						isValid = false;
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (isValid) {
				if (stack.isEmpty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}

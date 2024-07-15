

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point obj) {
		// 두 Point 객체의 x 값이 동일한 경우
		/*if (this.x == obj.x) {
			// y 값을 기준으로 오름차순 정렬
			return this.y - obj.y;
		} else {
			// x 값을 기준으로 오름차순 정렬
			return this.x - obj.x;
		}*/

		// y 값이 같은 경우
		if (this.y == obj.y) {
			return this.x - obj.x; // x 값 기준 오름차순
		} else {
			return this.y - obj.y; // y 값 기준 오름차순
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Point> point = new ArrayList<Point>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			point.add(new Point(x, y));

		}

		Collections.sort(point);

		for (int i = 0; i < point.size(); i++) {
			System.out.println(point.get(i).x + " " + point.get(i).y);
		}
	}
}

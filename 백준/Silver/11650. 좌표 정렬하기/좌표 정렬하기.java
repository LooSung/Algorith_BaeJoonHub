

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
		if (this.x == obj.x) {
			return this.y - obj.y;
		} else {
			return this.x - obj.x;
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

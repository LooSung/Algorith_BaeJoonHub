

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int age;
	String name;
	int index; // index 변수를 추가하여 가입 순서를 유지.

	public Point(int age, String name, int index) {
		this.age = age;
		this.name = name;
		this.index = index;
	}

	@Override
	public int compareTo(Point obj) {
		// 나이가 같은 경우, 가입 순서(index)로 정렬
		if (this.age == obj.age) {
			return this.index - obj.index;
		} else {
			// 나이를 기준으로 오름차순 정렬
			return this.age - obj.age;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		int n = sc2.nextInt();

		ArrayList<Point> point = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int age = sc2.nextInt();
			String name = sc2.next();
			point.add(new Point(age, name, i));
		}

		Collections.sort(point);

		for (Point value : point) {
			System.out.println(value.age + " " + value.name);
		}
	}
}

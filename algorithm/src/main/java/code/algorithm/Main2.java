package code.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int value;
	int index;

	public Point(int value, int index) {
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(Point obj) {
		// 값을 기준으로 오름차순 정렬
		return Integer.compare(this.value, obj.value);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Point> points = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			points.add(new Point(value, i));
		}

		Collections.sort(points);

		// 압축된 좌표 값을 저장할 배열
		int[] compressed = new int[n];
		int rank = 0;
		HashMap<Integer, Integer> valueToRank = new HashMap<>();

		for (Point point : points) {
			if (!valueToRank.containsKey(point.value)) {
				valueToRank.put(point.value, rank);
				rank++;
			}
			compressed[point.index] = valueToRank.get(point.value);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(compressed[i] + " ");
		}
	}
}



import java.util.ArrayList;
import java.util.Scanner;

class Subject {
	public String sub;
	public double pnt; // 학점
	public String grd; // 등급

	Subject(String s, double p, String g) {
		this.sub = s;
		this.pnt = p;
		this.grd = g;
	}
}

public class Main {
	// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Subject> subjects = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			if (!sc.hasNextLine()) {
				break;
			}
			String line = sc.nextLine();
			String[] parts = line.split(" ");

			if (parts.length == 3) {
				String name = parts[0];
				double credits = Double.parseDouble(parts[1]);
				String grade = parts[2];
				subjects.add(new Subject(name, credits, grade));
			}
		}
		sc.close();

		double totalCredits = 0.0;
		double totalPoints = 0.0;
		for (Subject subject : subjects) {
			Double gradePoint = getGradePoint(subject.grd);
			if (gradePoint != null) {
				totalPoints += subject.pnt * gradePoint;
				totalCredits += subject.pnt;
			}
		}

		double gpa = totalPoints / totalCredits;
		System.out.printf("%.6f\n", gpa);
	}

	private static Double getGradePoint(String grade) {
		switch (grade) {
			case "A+":
				return 4.5;
			case "A0":
				return 4.0;
			case "B+":
				return 3.5;
			case "B0":
				return 3.0;
			case "C+":
				return 2.5;
			case "C0":
				return 2.0;
			case "D+":
				return 1.5;
			case "D0":
				return 1.0;
			case "F":
				return 0.0;
			case "P":
			default:
				return null;
			}
	}
}

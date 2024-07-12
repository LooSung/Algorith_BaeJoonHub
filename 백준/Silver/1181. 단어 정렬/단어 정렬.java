

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Word implements Comparable<Word> {
	String word;

	public Word(String word) {
		this.word = word;
	}

	@Override
	public int compareTo(Word obj) {
		// 문자열 길이를 기준으로 오름차순 정렬
		if (this.word.length() != obj.word.length()) {
			return this.word.length() - obj.word.length();
		}
		// 길이가 같은 경우 사전순으로 정렬
		return this.word.compareTo(obj.word);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		int n = sc2.nextInt();
		sc2.nextLine(); // 개행 문자 제거

		ArrayList<Word> words = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String word = sc2.nextLine();
			words.add(new Word(word));
		}

		Collections.sort(words);

		// 첫 번째 단어는 항상 출력
		if (!words.isEmpty()) {
			System.out.println(words.get(0).word);
		}

		// 나머지 단어들을 비교하여 중복 제거 후 출력
		for (int i = 1; i < words.size(); i++) {
			if (!words.get(i).word.equals(words.get(i - 1).word)) {
				System.out.println(words.get(i).word);
			}
		}
	}
}

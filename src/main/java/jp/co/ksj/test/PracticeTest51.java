package jp.co.ksj.test;

public class PracticeTest51 {
	public static void main(String[] args) {
		System.out.println();
		final int TOTAL = 9;

		for (int i = 1; i <= TOTAL; i = i + 1) {

			for (int j = 1; j <= TOTAL; j = j + 1) {
				int sum = i * j;
				System.out.print("");
				if (10 > sum)

					System.out.print("");
				System.out.print(" "+sum);

			}
			System.out.println();
		}

	}
}

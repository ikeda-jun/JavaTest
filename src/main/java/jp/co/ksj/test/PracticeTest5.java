package jp.co.ksj.test;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String[] args) {

		Random random = new Random();
		int fortune = random.nextInt(100);

		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("大凶です");
		}
		System.out.println(fortune);

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("７の倍数の総合計は" + sum);
	}
}

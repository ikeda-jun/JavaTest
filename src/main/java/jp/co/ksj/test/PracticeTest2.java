package jp.co.ksj.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String[] args) {
		int x = 10, y = 28;
		double z = 3.14;

		System.out.println(x * y);
		System.out.println(y / x);
		System.out.println(y % x);

		double number;
		number = y * z;
		System.out.println(number);

		number++;

		System.out.println(number);

		int age = 23;
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		if (age > randomNumber) {
			System.out.println("私の方が年上です");
		} else if (age < randomNumber) {
			System.out.println("私の方が年下です");
		} else if (age == randomNumber) {
			System.out.println("私と同い年です");
		}
		System.out.println(randomNumber);
	}
}

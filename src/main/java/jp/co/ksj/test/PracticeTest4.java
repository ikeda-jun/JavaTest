package jp.co.ksj.test;

import java.util.Arrays;

public class PracticeTest4 {
	public static void main(String[] args) {
		//1.②でコーディングするのが適切
		//①は==で比較しているが、これはint型で比較するのが正しい使い方
		//②のequalsはString型を比較する、つまり文字列を比較した正しいかを判断するため②が正しい。

		String[] animal = { "犬", "猫", "うさぎ", "へび" };
		String favorite = animal[0];

		if (Arrays.asList(animal).contains(favorite)) {
			System.out.println(favorite + "はリストに含まれています");
		} else {
			System.out.println(favorite + "はリストに含まれていません");
		}

		String[] month = { "１月:元日、成人の日", "２月:建国記念の日、天皇誕生日", "３月:春分の日", "４月:昭和の日", "５月:憲法記念日、みどりの日、こどもの日", "６月:",
				"７月:海の日、スポーツの日", "８月:山の日", "９月:敬老の日、秋分の日", "１０月:", "１１月:文化の日、勤労感謝の日", "１２月:" };

		int birthday = 1;

		switch (birthday) {
		case 1:
			System.out.println(month[0]);
			break;
		case 2:
			System.out.println(month[1]);
			break;
		case 3:
			System.out.println(month[2]);
			break;
		case 4:
			System.out.println(month[3]);
			break;
		case 5:
			System.out.println(month[4]);
			break;
		case 6:
			System.out.println(month[5]);
			break;
		case 7:
			System.out.println(month[6]);
			break;
		case 8:
			System.out.println(month[7]);
			break;
		case 9:
			System.out.println(month[8]);
			break;
		case 10:
			System.out.println(month[9]);
			break;
		case 11:
			System.out.println(month[10]);
			break;
		case 12:
			System.out.println(month[11]);
			break;

		}

	}
}
//何故if文ではなくswitch構文を使ったのか
//if文は真偽で返す為、今回のように複数の場合だとその都度条件式を定義しなければならないため、
//非常に手間がかかる。一方switch構文ではあればその条件式に該当する時だけ出力すれば良いので非常に楽。

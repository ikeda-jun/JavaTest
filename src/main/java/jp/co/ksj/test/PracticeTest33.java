package jp.co.ksj.test;

import java.util.ArrayList;

public class PracticeTest33 {
	public static void main(String[] args) {
		Subjectpoint person1 = new Subjectpoint();

		person1.setName1("国語");
		person1.setNumber(90);

		Subjectpoint person2 = new Subjectpoint();

		person2.setName1("数学");
		person2.setNumber(80);

		Subjectpoint person3 = new Subjectpoint();

		person3.setName1("英語");
		person3.setNumber(65);

		ArrayList<Subjectpoint> subjectpoints = new ArrayList<>();
		subjectpoints.add(person1);
		subjectpoints.add(person2);
		subjectpoints.add(person3);

		for (Subjectpoint subjectpoint : subjectpoints) {

			subjectpoint.showPoint();
		}
	}
}
//単純に他のListを知らなかったため、ArrayListを再利用した。
//調べてみるとSet構造というコレクションクラスが一番適していると感じた。
//Listは順番付けが出来るので、最初のような番号が振り分けられているデータに関しては適していると考えられる。

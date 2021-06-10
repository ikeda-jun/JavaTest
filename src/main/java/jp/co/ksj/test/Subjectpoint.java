package jp.co.ksj.test;

public class Subjectpoint {
	private String name1;
	private int number;

	void setName1(String name1) {
		this.name1 = name1;
	}

	void setNumber(int number) {
		this.number = number;
	}

	void showPoint() {
		System.out.println(this.name1 + ":" + this.number);
	}
}

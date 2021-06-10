package jp.co.ksj.test;

public class Employee3 {
	private  int number;
	private  String name;
	private  String gendar;
	private  int age;

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setNumber(int number) {
		this.number = number;
	}

	void setGendar(String gendar) {
		this.gendar = gendar;
	}
	 void showProfile() {
		System.out.println("番号は" + this.number + "、名前は" + this.name + "性別は" + this.gendar + "年齢は" + this.age + "です");
	}
}

package jp.co.ksj.test;

import java.util.ArrayList;

public class PracticeTest3 {

	public static void main(String[] args) {

		Employee1 employee1 = new Employee1();

		employee1.setName("田中太郎");
		employee1.setAge(27);
		employee1.setNumber(1);
		employee1.setGendar("男性");

		Employee2 employee2 = new Employee2();

		employee2.setName("佐藤花子");
		employee2.setAge(22);
		employee2.setNumber(2);
		employee2.setGendar("女性");

		Employee3 employee3 = new Employee3();

		employee3.setName("鈴木次郎");
		employee3.setAge(31);
		employee3.setNumber(3);
		employee3.setGendar("男性");

		ArrayList<Employee3> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		for (Employee3 employee : employees) {

			employee.showProfile();

		}

	}

}
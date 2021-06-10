package jp.co.ksj.test;

public class PracticeTest1 {
	private static final double TAX = 0.1;

	public static void main(String[] args) {
		int x = 480;
		int price = (int) (x * (1 + TAX));
		System.out.println("この商品の値段は" + price + "円です");
		String name = "池田順";
		System.out.println(name);
	}
}

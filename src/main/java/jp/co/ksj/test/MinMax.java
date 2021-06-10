package jp.co.ksj.test;

public class MinMax {
	int getMaxValue(int a, int b, int c) {
		int sum;
		sum = c;
		if (sum < a)
			sum = a;
		if (sum < b)
			sum = b;
		return sum;
	}

	int getMinValue(int a, int b, int c) {
		int summ;
		summ = b;
		if (summ > a)
			summ = a;
		if (summ > c)
			summ = c;
		return summ;
	}
}
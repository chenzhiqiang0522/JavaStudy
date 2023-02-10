package Answer;

import java.util.Date;

public class Demo {
	public static void main(String args[]) {
		Date date = new Date();
		long d1=date.getTime();
		double sum = 0, a = 1;
		int i = 1;
		while (i <= 20) {
			sum = sum + a;
			i = i + 1;
			a = a * (1.0 / i);
		}
		long d2 = date.getTime();
		System.out.println(d2-d1);
		System.out.println(sum);

	}
}

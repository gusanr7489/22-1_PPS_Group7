
public class A023_송다빈_22000372 {
	private int sum = 0;

	public int addDigits(int num) {
		while (num >= 10) {
			int digit = num % 10;
			int n = num / 10;
			num = digit + n;
		}

	return num;
}

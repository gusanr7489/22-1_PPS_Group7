
import java.math.BigInteger;

class A063 {
	public String addBinary(String a, String b) {
		BigInteger int_a = new BigInteger(a, 2);
		BigInteger int_b = new BigInteger(b, 2);
		BigInteger res = int_a.add(int_b);
		
		return res.toString(2);
	}
}

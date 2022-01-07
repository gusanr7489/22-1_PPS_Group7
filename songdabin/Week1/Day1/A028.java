
import java.util.*;
import java.math.*;

public class A028 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		BigInteger a = s.nextBigInteger();
		BigInteger b = s.nextBigInteger();
		
		BigInteger sum = a.add(b);
		
		System.out.println(sum);
	}
}

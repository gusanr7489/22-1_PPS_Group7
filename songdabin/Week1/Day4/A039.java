
public class A039 {
	public boolean isPerfectSquare(int num) {
		long i = 1;
		boolean rtn = false;
		
		if (num == 1) rtn = true;
		
		while (i*i < num) {
			i++;
			if (num == i*i) rtn = true;
		}
		
		return rtn;
		
	}
}

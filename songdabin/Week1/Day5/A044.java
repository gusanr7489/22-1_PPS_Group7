
public class A044 {
	public boolean checkRecord(String s) {
		int a = 0, l = 0;
		
		for (char c : s.toCharArray()) {
			if (c == 'A') a++;
			if (c != 'L') l = 0;
			if (l == 2 && c == 'L') return false;
			if (c == 'L') l++;
		}
		
		if (a >= 2) return false;
		return true;
		
	}
}

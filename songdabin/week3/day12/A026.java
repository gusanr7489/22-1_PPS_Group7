
public class A026 {

	public boolean solution(int x) {
		boolean answer = true;
		int cpy_x = x;
		int sum = 0;
		
		while (cpy_x != 0) {
			sum += cpy_x % 10;
			cpy_x /= 10;
		}
		
		if (x % sum != 0) answer = false;
		
		return answer;
	}

}

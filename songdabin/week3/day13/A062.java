
public class A062 {
	public String solution(int a, int b) {
		int sum = 0;
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		String answer = "";
		
		for (int i = 1; i < a; i++) {
			switch (i) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				sum += 31;
				break;
			case 4: case 6: case 9: case 11:
				sum += 30;
				break;
			case 2:
				sum += 29;
				break;
			}
		}
		
		sum = sum + b - 1;
		answer = day[sum % 7];
		
		return answer;
	}
}

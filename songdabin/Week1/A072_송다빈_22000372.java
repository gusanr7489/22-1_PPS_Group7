class Solution {
    
    public int dayOfYear(String date) {
        int sum = 0;
		
		String[] info = date.split("-");
		int year = Integer.parseInt(info[0]);
		int month = Integer.parseInt(info[1]);
		int day = Integer.parseInt(info[2]);
		
		sum = day;
		
		for (int i = 1; i < month; i++) {
			switch(i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					sum += 31;
					break;
				
				case 2:
					sum += year % 4 != 0 || year % 100 == 0 && year % 400 != 0 ? 28 : 29;
					break;
				
				case 4: case 6: case 9: case 11:
					sum += 30;
					break;
			}
		}
		
		return sum;
    }
}

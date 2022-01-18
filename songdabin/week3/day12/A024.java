
public class A024 {
	public boolean lemonadeChange(int[] bills) {
		int bill_5 = 0, bill_10 = 0;
		
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) bill_5++;
			
			else if (bills[i] == 10) {
				bill_10++;
				if (bill_5 > 0) bill_5--;
				else return false;
			}
			
			else if (bills[i] == 20) {
				if (bill_5 > 0 && bill_10 > 0) {
					bill_5--;
					bill_10--;
				}
				else if (bill_5 > 2) bill_5 -= 3;
				else return false;
			}
		}
		return true;
	}
}

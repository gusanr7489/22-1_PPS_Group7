
public class A055 {
	class Solution {
		public String removeOuterParentheses(String s) {
			int left_cnt = 0;
			String ans = "";
			
			for (char c : s.toCharArray()) {
				if (c == '(') {
					if (left_cnt++ != 0) ans += c; // left_cnt가 0이 아닌지 확인하고 cnt를 증가
				}
				else {
					if (--left_cnt != 0) ans += c; // left_cnt를 감소시키고 left_cnt가 0이 아닌지 확인
				}
			}
			
			return ans;
		}
	}
}

package week2;

import java.util.Stack;

public class A061_πË¿Á»£_20220110 {

	public static void main(String[] args) {
		System.out.println(solution(701));
	}
	public static String solution(int columnNumber) {
		String answer = "";
		Stack<Integer> st = new Stack<>();
		do {
            st.push(columnNumber%26);
            //System.out.println(columnNumber%26);
            columnNumber /= 26;
        }while(columnNumber>1);
		for(int i=0;i<st.size();i++) {
			answer += st.pop();
		}
		return answer;
	}
}

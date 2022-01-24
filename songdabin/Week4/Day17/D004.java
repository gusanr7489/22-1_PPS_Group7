import java.util.*;

public class D004 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for (int i = 0; i < N; i++) {
			char[] str = s.next().toCharArray();
			
			Stack<Character> stack1 = new Stack<Character>();
			Stack<Character> stack2 = new Stack<Character>();
			
			for (int j = 0; j < str.length; j++) {
				switch (str[j]) {
				case '<':
					if (!stack2.isEmpty())
						stack1.push(stack2.pop());
					break;
				case '>':
					if (!stack1.isEmpty())
						stack2.push(stack1.pop());
					break;
				case '-':
					if (!stack2.isEmpty())
						stack2.pop();
					break;
				default:
					if (str[j] != '<' && str[j] != '>' && str[j] != '-')
						stack2.push(str[j]);
					break;
				}
			}
			
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			
			StringBuilder sb = new StringBuilder();
			
			for (int j = 0; j < stack2.size(); j++) {
				sb.append(stack2.elementAt(j));
			}
			
			System.out.println(sb);
		}
	}
}

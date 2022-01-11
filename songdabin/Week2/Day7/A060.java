import java.util.Stack;

public class A060 {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		
		for (String s : ops) {
			if (s.equals("+")) {
				int second = stack.pop();
				int first = stack.peek();
				stack.push(second);
				stack.push(first + second);
			} else if (s.equals("D")) {
				int dou = stack.peek();
				stack.push(dou * 2);
			} else if (s.equals("C")) {
				stack.pop();
			} else {
				stack.push(Integer.valueOf(s));
			}
		}
		
		while (!stack.empty()) {
			sum += stack.pop();
		}
		
		return sum;
	}
}

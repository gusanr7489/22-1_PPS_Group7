import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class A069 {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int N = s.nextInt();
		int K = s.nextInt();
		
		for(int i = 1; i <= N; i++) queue.add(i);
		
		sb.append('<');
		
		while(queue.size() > 1) {
			for(int i = 0; i < K - 1; i++) {
				int val = queue.remove();
				queue.add(val);
			}
			sb.append(queue.remove()).append(", ");
		}
		
		sb.append(queue.remove()).append('>');
		System.out.println(sb);
	}
}

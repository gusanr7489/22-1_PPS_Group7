import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class A070 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			queue.add(i + 1);
		}
		
		while(queue.size() > 1) {
			queue.remove();
			queue.add(queue.remove());
		}
		
		System.out.println(queue.remove());
	}

}

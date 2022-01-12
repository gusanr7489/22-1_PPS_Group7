package week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A069_πË¿Á»£_20220112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		josephus(n,k);
	}
	public static void josephus(int n, int k) {
		int[] answer = new int[n];
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<n;i++) queue.offer(i+1);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<k-1;j++) queue.offer(queue.poll());
			answer[i] = queue.poll();
		}
		
		System.out.print("<");
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]);
			if(i<answer.length-1) System.out.print(", ");
			else System.out.print(">");
		}
	}
}

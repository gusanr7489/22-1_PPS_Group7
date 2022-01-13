package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class A070_배재호_20220113 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		num = card(num);
		bw.write(Integer.toString(num));
		br.close();
		bw.flush();
		bw.close();
	}
	public static int card(int num) {
		Queue<Integer> cards = new LinkedList<>();
		for(int i=0;i<num;i++) cards.offer(i+1);
		int answer=0;
		for(int i=0;i<num;i++) {
			answer = cards.poll();
			cards.offer(cards.poll());
		}
		
		return answer;
	}
}

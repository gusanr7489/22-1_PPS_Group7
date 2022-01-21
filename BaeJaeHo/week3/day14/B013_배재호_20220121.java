package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class B013_배재호_20220121 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		int b3 = Integer.parseInt(st.nextToken());
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(turnToZero(b3));			// b2에	0
		ts.add(turnToZero(b3-b2));		//		b2(full)
		ts.add(turnToZero(b3-b1));		//		b1
		ts.add(turnToZero(b3-(b2-b1)));	//		b2-b1
		ts.add(turnToZero(b1));			//		b3-b1
		for(int i : ts) System.out.print(i+" ");
	}
	public static int turnToZero(int b) {
		if(b<0) return 0;
		else return b;
	}
}

package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D002_πË¿Á»£_20220121 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rep = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] answer = new int[rep];
		for(int i=0;i<rep;i++) {
			st = new StringTokenizer(br.readLine());
			int height = Integer.parseInt(st.nextToken());
			st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			answer[i] = num/height+1 + (num%height)*100;
		}
		for(int i: answer) System.out.println(i);
		br.close();
	}

}

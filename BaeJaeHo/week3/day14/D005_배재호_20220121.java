package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D005_πË¿Á»£_20220121 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<String> unlisten = new ArrayList<String>();
		for(int i=0;i<n;i++) unlisten.add(br.readLine());
		
		ArrayList<String> unseem = new ArrayList<String>();
		for(int i=0;i<m;i++) unseem.add(br.readLine());
		
		ArrayList<String> answer = new ArrayList<String>();
		for(String s : unlisten) if(unseem.contains(s)) answer.add(s); 
		
		System.out.println(answer.size());
		for(String s:answer) System.out.println(s);
		br.close();
	}

}

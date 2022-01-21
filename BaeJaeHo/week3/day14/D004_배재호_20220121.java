package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class D004_πË¿Á»£_20220121 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rep = Integer.parseInt(br.readLine());
		String[] answer = new String[rep];
		for(int i=0;i<rep;i++) {
			char[] input = br.readLine().toCharArray();
			ArrayList<Character> pw = new ArrayList<>();
			int cnt=0;
			for(char c : input) {
	//			System.out.print(c);
				if(c=='-' && !pw.isEmpty()) pw.remove(--cnt);
				else if(c=='<' && !pw.isEmpty()) cnt--;
				else if(c=='>' && cnt!=pw.size()) cnt++;
				else if(c!='-' && c!='<' && c!='>') pw.add(cnt++, c);
				else continue;
			}
			for(char c : pw) {
		//		System.out.print(c);
				answer[i] += c;
			}
			//System.out.println();
		}
		for(String a : answer) System.out.println(a);
		br.close();
	}

}
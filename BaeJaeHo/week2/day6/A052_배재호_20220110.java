package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A052_πË¿Á»£_20220110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		int[] score= new int[rep];
		for(int i = 0;i<rep;i++) {
			String answers = br.readLine();
			int tmp=0;
			for(int j=0;j<answers.length();j++) {
				if(answers.charAt(j) == 'O') tmp+=1;
				else tmp=0;
				score[i] += tmp;
			}
			System.out.println(score[i]);
		}
		for(int s : score) bw.write(s);
		bw.flush();
		br.close();
		bw.close();
	}

}

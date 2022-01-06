package week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A033_πË¿Á»£_20220106 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int most=0;
        int[] score = new int[5];
        int answer = 0;
        for(int i=0;i<5;i++) {
	        String str = br.readLine();
	        StringTokenizer st = new StringTokenizer(str);
	        for(int j=0;j<4;j++) {
	        	score[i] += Integer.parseInt(st.nextToken());
	        }
	        if(most < score[i]) {
	        	answer = i+1;
	        	most = score[i];
	        }
        }
        bw.write(Integer.toString(answer)+" "+Integer.toString(most));
        bw.flush();
        br.close();
        bw.close();
	}

}

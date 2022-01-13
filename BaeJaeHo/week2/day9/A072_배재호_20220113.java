package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A072_πË¿Á»£_20220113 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		String[] dates = input.split("-");
		bw.write(Integer.toString(date(dates)));
		br.close();
		bw.flush();
		bw.close();
	}
	public static int date(String[] dates) {
		int answer = 0;
		int[] ymd = new int[3];
		for(int i=0;i<dates.length;i++) {
			ymd[i] = Integer.parseInt(dates[i]);
		}
		
		if(ymd[0]%4==0 && ymd[1]>2 && ymd[0]!=1900) answer++;
		switch(ymd[1]) {
		case 12: answer+=30;
		case 11: answer+=31;
		case 10: answer+=30;
		case 9: answer+=31;
		case 8: answer+=31;
		case 7: answer+=30;
		case 6: answer+=31;
		case 5: answer+=30;
		case 4: answer+=31;
		case 3: answer+=28;
		case 2: answer+=31;
		case 1: break;
		default:
			answer += 0;
			break;
		}
		answer += ymd[2];
		return answer;
	}
}

//31 28 31 30 31 30 31 31 30 31 30 31
//
//31	30*1+1	
//59	30*2-1	
//90	30*3	
//120	30*4	
//151	30*5+1
//181	30*6+1
//212	30*7+2
//243	30*8+3
//273	30*9+3
//304	30*10+4
//334	30*11+4
//365	30*12+5
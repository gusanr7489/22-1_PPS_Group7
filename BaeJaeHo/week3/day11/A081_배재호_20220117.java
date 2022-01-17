package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A081_πË¿Á»£_20220117 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		int[] answer = new int[rep];
		for(int i=0;i<rep;i++) {
			String input = br.readLine();
			String[] nums = input.split(" ");
			int[] numbers = new int[10];
			for(int j=0;j<10;j++) numbers[j] = Integer.parseInt(nums[j]);
			Arrays.sort(numbers);
			answer[i] = numbers[7];
		}
		for(int s: answer) bw.write(Integer.toString(s)+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}

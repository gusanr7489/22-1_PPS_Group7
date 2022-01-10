package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A047_배재호_20220110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int cnt=0;
		for(char c: str.toCharArray()) {
			bw.write(c);
			cnt++;
			if(cnt>=9) {
				bw.write("\n");
				cnt=0;
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}

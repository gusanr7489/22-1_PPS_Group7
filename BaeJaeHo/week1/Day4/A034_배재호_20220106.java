package week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class A034_πË¿Á»£_20220106 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			String numbers = br.readLine();
			set.add(Integer.parseInt(numbers)%42);
		}
		bw.write(Integer.toString(set.size()));
		bw.flush();
		br.close();
		bw.close();
	}

}

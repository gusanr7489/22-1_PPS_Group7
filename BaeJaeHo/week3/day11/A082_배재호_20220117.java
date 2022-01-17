package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class A082_πË¿Á»£_20220117 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int rep = Integer.parseInt(br.readLine());
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		
//		for(int i=0;i<rep;i++) {
//			String[] input = br.readLine().split(" ");
//			map.put(input[1], Integer.parseInt(input[0]));
//			Arrays.sort(map.keySet().toArray());
//		}
//		for(String name : map.keySet())
//			System.out.println(map.get(name)+" "+name);
//		br.close();
//	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int rep = s.nextInt();
		String[][] answer = new String[rep][2];
		
		for (int i=0;i<rep;i++) {
			answer[i][0] = s.next();
			answer[i][1] = s.next();
		}
		
		Arrays.sort(answer, new Comparator<String[]>() {
			@Override
			public int compare(String[] str1, String[] str2) {
				return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
			}
		});
		
		for (int i=0;i<rep;i++) {
			System.out.println(answer[i][0]+" "+answer[i][1]);
		}
	}

}

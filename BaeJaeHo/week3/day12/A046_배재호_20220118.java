package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class A046_πË¿Á»£_20220118 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rep = Integer.parseInt(br.readLine());
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<rep;i++) {
			char f_name = br.readLine().charAt(0);
			if(map.get(f_name) != null) map.put(f_name, map.get(f_name)+1);
			else map.put(f_name, 1);
			System.out.println(map);
		}
		int cnt=0;
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() >=5) {
				System.out.print(entry.getKey());
				cnt++;
			}
		}
		if(cnt==0) System.out.print("PREDAJA");
		br.close();
	}

}

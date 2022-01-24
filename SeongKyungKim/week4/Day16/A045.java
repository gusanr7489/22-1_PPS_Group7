import java.io.*;
import java.util.HashMap;

public class LevelA_45{
	public static void main(String args[]) throws IOException{
		char answer='?';
		HashMap<Character,Integer> maps = new HashMap<>();
		int max = 0;
		int count=0;
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		
		String newWord = word.toUpperCase();
		char[] array = newWord.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			if(maps.containsKey(array[i])) maps.replace(array[i], maps.get(array[i])+1);
			else maps.put(array[i], 1);
		}
		
		for(Character c : maps.keySet()) {
			if(max < maps.get(c)) {
				count=0;         //새로운 max값 생성되며 중복 초기화  
				max = maps.get(c);
			  answer = c;
			}
			
			else if(max == maps.get(c)) count++;  //중복처리  
		}
		
		if(count>0) {
			answer = '?';
		}
		
		bw.write(String.valueOf(answer));
	    bw.flush();
	    bw.close();
		
	}

}

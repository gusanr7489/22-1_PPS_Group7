import java.io.*;
import java.util.Stack;
import java.io.IOException;

public class LevelA_53 {
	public static void main(String args[]) throws IOException {
		int N;
		Stack<String> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			String s[] = str.split(" ");
			
			switch(s[0])
			{
			case "push":
				stack.push(s[1]);
				break;
			
			case "pop": 
				if(!stack.empty()) {
					String popNum = stack.pop();
					bw.write(popNum+"\n");
				}
				else bw.write(Integer.toString(-1)+"\n");
				break;
			
			case "size":
				bw.write(Integer.toString(stack.size())+"\n");
				break;
				
			case "empty":
				if(stack.empty())
					bw.write(String.valueOf(1)+"\n");
				else bw.write(Integer.toString(0)+"\n");
				break;
				
			case "top":
				if(!stack.empty())
					bw.write(stack.peek()+"\n");
				else bw.write(String.valueOf(-1)+"\n");
				break;
			}
			
		}
		bw.flush();
		bw.close();
		
	}
	

}

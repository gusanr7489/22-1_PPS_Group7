package week1;

import java.util.Stack;

public class A042_배재호_20220107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(backspaceCompare("ab#c", "ad#c"));
		System.out.println(backspaceCompare("ab##", "c#d#"));
		System.out.println(backspaceCompare("a#c", "b"));
	}
    public static boolean backspaceCompare(String s, String t) {
        // ArrayList<Character> s1 = new ArrayList<Character>();
        // ArrayList<Character> t1 = new ArrayList<Character>();
        // 앞에서부터 넣다가 #나오면 이전 것 제거   -> runtime에러
        // for(int j=0;j<s.length();j++){
        //     if(s.charAt(j) == '#'&& j!=0) s1.remove(j-1);
        //     else s1.add(s.charAt(j));
        // }
        // for(int j=0;j<t.length();j++){
        //     if(t.charAt(j) == '#'&&j!=0) t1.remove(j-1);
        //     else t1.add(t.charAt(j));
        // }
        // 뒤에서부터 넣다가 #나오면 건너뛰기  -> ##연달아 나오면 안됨..
        // for(int j=s.length()-1;j>=0;j--){
        //     if(s.charAt(j) == '#' &&j!=0) j--;
        //     else s1.add(s.charAt(j));
        // }
        // for(int j=t.length()-1;j>=0;j--){
        //     if(t.charAt(j) == '#' && j!=0) j--;
        //     else t1.add(t.charAt(j));
        // }
        // if(s1.size() != t1.size()) return false;
        // else{
        //     for(int i=0;i<s1.size();i++) if(s1.get(i) != t1.get(i)) return false;
        //     return true;
        // }
        // stack으로 넣다가 #를 만나면 pop한 stack결과값! how?
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for(char c :s.toCharArray()){
            if(c != '#') s1.push(c);
            else if(!s1.empty()) s1.pop();  // #이 맨 앞에 있을 때
        }
        for(char c :t.toCharArray()){
            if(c != '#') t1.push(c);
            else if(!t1.empty()) t1.pop();
        }
        
        while(!s1.empty()){
            // System.out.println(s1.peek() +", "+ t1.peek());
            if(t1.empty()) return false;    // 둘 중 하나가 먼저 빌 때 : 둘이 서로 다를 때...?
            else if(s1.pop() != t1.pop()) return false;
        }
        if(!t1.empty()) return false;
        return true;
    }
}

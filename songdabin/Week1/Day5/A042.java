import java.util.ArrayList;

public class A042 {

	public boolean backspaceCompare(String s, String t) {
		ArrayList<Character> s_arr = new ArrayList<>();
		ArrayList<Character> t_arr = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#' && s_arr.size() == 0) continue;
			else if (s.charAt(i) == '#') s_arr.remove(s_arr.size() - 1);
			else s_arr.add(s.charAt(i));
		}
		
		for (int j = 0; j < t.length(); j++) {
			if (t.charAt(j) == '#' && t_arr.size() == 0) continue;
			else if (t.charAt(j) == '#') t_arr.remove(t_arr.size() - 1);
			else t_arr.add(t.charAt(j));
		}
		
		if (s_arr.equals(t_arr)) return true;
		return false;
		
	}
}

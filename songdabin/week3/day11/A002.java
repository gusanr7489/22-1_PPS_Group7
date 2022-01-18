import java.util.ArrayList;
import java.util.List;

public class A002 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> priv = null; // 계산하고 있는 line의 이전 line
		
		for (int line = 1; line <= numRows; line++) {
			List<Integer> present = new ArrayList<>(); // 현재 계산하고 있는 line
			for (int idx = 1; idx <= line; idx++) {
				// 처음이랑 마지막에는 1이 기본 값
				if (idx == 1 || idx == line)
					present.add(1);
				else
					present.add(priv.get(idx - 2) + priv.get(idx - 1));
			}
			res.add(present);
			priv = present;
		}
		
		return res;
	}
}

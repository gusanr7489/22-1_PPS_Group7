package week1;

public class A044_����ȣ_20220107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkRecord("LALL"));
		System.out.println(checkRecord("PPALLP"));
		System.out.println(checkRecord("PPALLL"));
	}
    public static boolean checkRecord(String s) {
        int a_th = 0;   // �ἮȽ��
        int l_th = 0;   // ����Ƚ��
        for(char c : s.toCharArray()){
            if(c=='A') a_th++;
            if(c=='L') l_th++;
            else l_th=0;
            if(a_th>=2 || l_th>=3) return false;
        }
        return true;
    }
}

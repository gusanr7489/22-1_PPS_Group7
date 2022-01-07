package week1;

public class A039_πË¿Á»£_20220107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(14));
	}
    public static boolean isPerfectSquare(int num) {
        if(Math.pow((int)Math.sqrt(num), 2) == num) return true;
        return false;
    }
}

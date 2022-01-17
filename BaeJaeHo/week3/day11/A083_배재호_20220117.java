package week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A083_πË¿Á»£_20220117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<rep;i++) {
			h.add(sc.nextInt());
		}
		
		for(int i : h) System.out.print(i+" ");
		
	}

}

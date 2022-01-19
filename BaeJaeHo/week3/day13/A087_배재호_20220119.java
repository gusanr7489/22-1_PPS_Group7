package week3;

import java.util.Arrays;
import java.util.Comparator;

public class A087_πË¿Á»£_20220119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o2[1] - o1[1];
			}
        });
        int boxs = 0;
        int units = 0;
        int answer = 0;
        for(int i=0;i<boxTypes.length;i++) {
        	boxs+=boxTypes[i][0];
        	units = boxTypes[i][1];
        	answer += boxTypes[i][0]*units;
        	System.out.println(boxs+" "+units+" "+answer);
        	if(boxs > truckSize) {
                answer -= (boxs-truckSize)*units;
        		break;
        	}
        }
        return answer;
    }
}

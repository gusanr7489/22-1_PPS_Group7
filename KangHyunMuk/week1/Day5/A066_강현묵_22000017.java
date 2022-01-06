
import java.io.*;

public class Main {

    static class Pair {
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] nums = new int[10];

        for(int i=0; i<str.length();i++) {
            nums[Integer.parseInt(Character.toString(str.charAt(i)))] ++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--) {
            for(int j=0; j<nums[i]; j++)
                sb.append(i);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

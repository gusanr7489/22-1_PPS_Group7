
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            List<Integer> nums = new ArrayList<Integer>();
            for(int j=0; j<10; j++) {
              nums.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(nums);
            result[i] = nums.get(nums.size()-3);
        }
        for(int i=0; i<N; i++) {
            bw.write(Integer.toString(result[i]) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] num_cnt = new int[9];
        int set = 0;

        n = n.replace('9', '6');

        for (int i = 0; i < n.length() ; i++) {
            int num = (int)(n.charAt(i) - 48);
            num_cnt[num]++;
        }
        if (num_cnt[6] % 2 == 0) num_cnt[6] /= 2;
        else { num_cnt[6] = num_cnt[6] / 2 + 1; }

        for (int j : num_cnt) {
            set = Math.max(j, set);
        }
        bw.write(Integer.toString(set));
        bw.flush();
        bw.close();
        br.close();
    }
}

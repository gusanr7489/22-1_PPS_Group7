import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        for(int i=0; i<N; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] num = new int[n];

            for(int j=0; j<n; j++) {
                num[j] = j+1;
            }
            for(int j=0; j<k; j++) {
                for(int l=1; l<n; l++) {
                    num[l] += num[l-1];
                }
            }
            result[i] = num[n-1];
        }
        for(int i=0; i<N; i++)
            bw.write(Integer.toString(result[i])+ "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
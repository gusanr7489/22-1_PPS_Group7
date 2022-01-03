import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int Y = 0;
        int M = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            Y += num/30 * 10 + 10;
            M += num/60 * 15 + 15;
        }

        if(M>Y) {
            bw.write("Y " + Integer.toString(Y));
        }
        else if(Y>M){
            bw.write("M " + Integer.toString(M));
        }
        else {
            bw.write("Y M " + Integer.toString(M));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

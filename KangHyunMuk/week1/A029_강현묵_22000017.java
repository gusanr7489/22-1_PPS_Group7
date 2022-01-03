
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        int door = Integer.parseInt(br.readLine());
        if(N>6)
            bw.write("Love is open door");
        else {
            for(int i=1; i<N; i++) {
                if(door%2==0)
                    bw.write("1" + "\n");
                else
                    bw.write("0" + "\n");
                door++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

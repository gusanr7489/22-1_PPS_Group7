
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String[] numberString = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};
        List<String> result = new ArrayList<String>();
        for(int i=M; i<=N; i++) {
            if(i<10) {
                result.add(numberString[i]);
            }
            else {
                String tmp = numberString[i/10] + " " + numberString[i%10];
                result.add(tmp);
            }
        }

        Collections.sort(result);
        List<String> numberStr = Arrays.asList(numberString);
        int[] inNum = new int[N-M+1];
        for(int i=0; i<=N-M; i++) {
            if(result.get(i).contains(" ")) {
                st = new StringTokenizer(result.get(i));
                inNum[i] = numberStr.indexOf(st.nextToken()) * 10 + numberStr.indexOf(st.nextToken());
            }
            else {
                inNum[i] = numberStr.indexOf(result.get(i));
            }
        }
        int count=0;
        for(int num: inNum) {
            bw.write(Integer.toString(num) + " ");
            count++;
            if(count%10==0)
                bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

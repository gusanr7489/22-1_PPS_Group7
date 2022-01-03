
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        List<String> list = new ArrayList<String>();
        String tmp = str;

        for(int i=0; i<str.length(); i++) {
            list.add(tmp);
            tmp = tmp.replaceFirst(Character.toString(tmp.charAt(0)), "");
        }

        Collections.sort(list);

        for(String result: list) {
            bw.write(result + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

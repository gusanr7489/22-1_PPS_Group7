import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String s = br.readLine();

        boolean answer = true;
        if(s.length() != 4 && s.length() != 6)
            answer = false;
        for(int i=0; i<s.length(); i++) {
            if(!Character.isDigit(s.charAt(i)))
                answer = false;
        }
        if(answer)
            System.out.println("true");
        else
            System.out.println("false");
        br.close();
        bw.flush();
        bw.close();
    }
}

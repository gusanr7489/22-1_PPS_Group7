
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alpha = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String kysar = "D E F G H I J K L M N O P Q R S T U V W X Y Z A B C";
        Map<String,String> converter = new HashMap<String,String>();
        StringTokenizer st1 = new StringTokenizer(alpha);
        StringTokenizer st2 = new StringTokenizer(kysar);
        while (st1.hasMoreTokens()) {
            converter.put(st2.nextToken(), st1.nextToken());
        }
        String input = br.readLine();
        StringBuilder output = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
             output.append(converter.get(Character.toString(input.charAt(i))));
        }
        bw.write(output.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}

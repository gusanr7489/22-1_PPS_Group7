
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));;

        int N = Integer.parseInt(br.readLine());
        Map<Integer,ArrayList<String>> map = new TreeMap<>();
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int age = Integer.parseInt(st.nextToken());
            ArrayList<String> list = new ArrayList<>();
            if(!map.containsKey(age)) {
                list.add(st.nextToken());
                map.put(age, list);
            }
            else {
                map.get(age).add(st.nextToken());
            }
        }
        for(int k: map.keySet()) {
            for(int i=0; i<map.get(k).size(); i++){
                bw.write(Integer.toString(k) + " " + map.get(k).get(i) +"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

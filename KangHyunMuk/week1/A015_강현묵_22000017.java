package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int result=0;
        int num;
        for(int i=0; i<5; i++) {
            num = Integer.parseInt(st.nextToken());
            result += num * num;
        }
        result %= 10;
        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }
}

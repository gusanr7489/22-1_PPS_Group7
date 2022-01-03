package com.baekjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result=0;
        for(int i=0; i<N; i++) {
            result += Integer.parseInt(br.readLine());
        }
        result -= N-1;
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}

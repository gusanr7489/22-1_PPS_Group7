package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cut =0;
        if(N>=M){
            cut = N - 1;
            for(int i=0; i<M-1; i++) {
                cut+= N;
            }
        }
        else {
            cut = M - 1;
            for(int i=0; i<N-1; i++) {
                cut+= M;
            }
        }
        bw.write(Integer.toString(cut));
        bw.flush();
        br.close();
        bw.close();
    }
}

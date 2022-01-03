package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num = Integer.parseInt(st.nextToken());
        String result ="";
        if(num==1) {
            result = "ascending";
            for(int i=2; i<=8; i++) {
                num = Integer.parseInt(st.nextToken());
                if(num!=i) {
                    result = "mixed";
                    break;
                }
            }
        }
        else if(num==8) {
            result = "descending";
            for(int i=7; i>=1; i--) {
                num = Integer.parseInt(st.nextToken());
                if(num!=i) {
                    result = "mixed";
                    break;
                }
            }
        }
        else
            result = "mixed";
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}

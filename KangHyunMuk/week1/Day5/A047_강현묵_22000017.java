package com.baekjoon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String str2 = str;
        String tmp = str;
        if(str.length()>10) {
            for(int i=0; i<str.length()/10; i++) {
                tmp = tmp.substring(0,10);
                bw.write(tmp+"\n");
                str2 = str2.substring(10,str2.length());
                tmp = str2;
            }
        }

        bw.write(str2);

        bw.flush();
        bw.close();
        br.close();
    }
}


package com.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> A = new ArrayList<Integer>();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        for(int i=0; i<N; i++) {
           A.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(A);

        List<Integer> B = new ArrayList<Integer>();
        str = br.readLine();
        st = new StringTokenizer(str);
        for(int i=0; i<N; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(B);
        Collections.reverse(B);

        int result=0;
        for(int i=0; i<N; i++) {
            result += A.get(i) * B.get(i);
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}

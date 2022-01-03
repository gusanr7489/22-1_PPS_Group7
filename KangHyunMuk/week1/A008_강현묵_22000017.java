package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

// 평균은 넘겠지
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double[] result = new double[N];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int num = Integer.parseInt(st.nextToken());
            double total=0;
            double[] score = new double[num];
            for(int j=0; j<num; j++) {
                score[j] = Double.parseDouble(st.nextToken());
                total += score[j];
            }
            total /= num;
            int count=0;
            for(int j=0; j<num; j++) {
                if(score[j]>total)
                    count++;
            }
            result[i] = ((double) count/(double)num )* 100;
            result[i] = Math.round(result[i]*1000)/ 1000.0;
        }

        for(int i =0; i<N; i++) {
            bw.write(String.format("%.3f", result[i]) +"%" +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

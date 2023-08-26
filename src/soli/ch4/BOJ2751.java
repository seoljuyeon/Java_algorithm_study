package soli.ch4;

import java.io.*;
import java.util.Arrays;


public class BOJ2751 {

    public static void main(String[] args) throws IOException {
//        런타임 에러
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0 ; i < N ; i++) {
            bw.write(arr[i] + "\n");    // 한 줄씩 출력
        }
        bw.flush();
        bw.close();
    }
}

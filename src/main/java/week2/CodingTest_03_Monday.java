package week2;

import java.io.*;
import java.util.StringTokenizer;

public class CodingTest_03_Monday {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st;

        int t = Integer.parseInt(str.split(" ")[0]);
        int a, b;
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write((a+b) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }
}

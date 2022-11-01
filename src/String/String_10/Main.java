package String.String_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution(String s,char c) {
        int left_index = s.indexOf(c,0);
        int right_index = s.indexOf(c, left_index);

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) == c) {
            left_index = right_index;
            right_index = s.indexOf(c, left_index+1);
            arr[i] = 0;
            sb.append(0).append(" ");
            continue;
        }
        arr[i] = Math.min(Math.abs(i-left_index),Math.abs(i-right_index));
        sb.append(arr[i]).append(" ");
    }
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s = st.nextToken();
        char c = st.nextToken().charAt(0);
        solution(s,c);

        System.out.println(sb);
    }

    public static StringBuilder sb = new StringBuilder();
}

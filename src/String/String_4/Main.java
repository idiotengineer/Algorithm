package String.String_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solution(String s) {
     /*   StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(s).reverse());
    */
        char[] arr = new char[s.length()];
        for (int i = 0; i <= s.length() / 2; i++) {
            int j = s.length() - i - 1;
            arr[i] = s.charAt(j);
            arr[j] = s.charAt(i);
        }
        System.out.println(String.valueOf(arr));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            solution(br.readLine());
        }
    }
}

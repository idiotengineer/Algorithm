package String.String_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int MAX = Integer.MIN_VALUE;
    public static String return_value;
    public static String solution(String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > MAX) {
                MAX = s[i].length();
                return_value = s[i];
            }
        }
        return return_value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = st.countTokens();

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        System.out.println(solution(arr));
    }
}

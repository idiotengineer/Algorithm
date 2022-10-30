package String.String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        char c = br.readLine().toLowerCase().charAt(0);
        System.out.println(solution(s, c));
        br.close();
    }

    public static int solution(String str, char t) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                count++;
            }
        }
        return count;
    }
}

package String.String_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 1 ;

            for (int j = i+1 ; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }

            sb.append(s.charAt(i));
            if (count != 1) {
                sb.append(count);
            }

            i += count-1;
        }

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static StringBuilder sb = new StringBuilder();
}

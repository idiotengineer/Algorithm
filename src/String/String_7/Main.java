package String.String_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String end;
        String start = s.substring(0, s.length() / 2);
        if (s.length() % 2 == 0) {
            end = s.substring(s.length() / 2, s.length());
        } else {
            end = s.substring(s.length()/2+1,s.length());
        }

        String end_string = String.valueOf(end.charAt(end.length()-1));
        for (int i = 0; i < end.length()-1; i++) {
            int j = end.length()-2-i;
            end_string = end_string.concat(String.valueOf(end.charAt(j)));
        }

        if(end_string.equals(start))
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        System.out.println(solution(s));
    }
}

package String.String_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String s) {
        int[] alphabet = new int[26];
        char[] new_string = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (alphabet[s.charAt(i)-97] == 0) {
                    alphabet[s.charAt(i)-97]++;
                    new_string[i] = s.charAt(i);
                }
            }
        }

        String return_string = String.valueOf(new_string[0]);

        for (int i = 1; i < s.length(); i++) {
            if (new_string[i] >= 97 && new_string[i] <= 122) {
                return_string= return_string.concat(String.valueOf(new_string[i]));
            }
        }

        return return_string;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        System.out.println(solution(s));
    }
}

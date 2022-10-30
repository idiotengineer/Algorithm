package String.String_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solution(String s) {
        int length = s.length();
        char []arr = new char[length];

        for (int i = 0; i< length; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                arr[i] = Character.toUpperCase(s.charAt(i));
            } else {
                arr[i] = Character.toLowerCase(s.charAt(i));
            }
        }
        return String.copyValueOf(arr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }
}

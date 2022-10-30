package String.String_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean solution(String s) {
        boolean Yes_or_No = true;
        int len = s.length();

        char[] arr = new char[len / 2];
        char[] reverse = new char[len / 2];

        for (int i = 0; i < len/2; i++) {
            for (int j = i; j < len; j++) {
                if (Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j))) {
                    arr[i] = s.charAt(j);
                    break;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            int j = len - i - 1;
            if (Character.isAlphabetic(s.charAt(j)) || Character.isDigit(s.charAt(j))) {
                reverse[i] = s.charAt(j);
            } else {
                continue;
            }
        }

        for (int i = 0; i < len / 2; i++)
            if (arr[i] != reverse[i]) {
                return false;
            }
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        if (solution(s))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

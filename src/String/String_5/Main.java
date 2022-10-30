package String.String_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solution(String s) {
        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length()/2; i++){
            int j = s.length()-i-1;

            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))) {
                arr[i] = s.charAt(j);
                arr[j] = s.charAt(i);
            } else {
                arr[i] = s.charAt(i);
                arr[j] = s.charAt(j);
            }
        }

        if (s.length() % 2 != 0) {
            arr[s.length()/2] = s.charAt(s.length()/2);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr).reverse();
        System.out.println(sb);
        System.out.println(String.valueOf(arr));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}

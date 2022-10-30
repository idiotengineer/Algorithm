package String.String_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static void solution(String s, char c) {
        int left_c_index = 0;
        int right_c_index = s.indexOf(c);
        int arr[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                arr[i] = right_c_index-i;
                left_c_index = right_c_index;
                right_c_index = s.indexOf('c',left_c_index+1);
            } else if (i==s.length()-1) {
                arr[i] = right_c_index-i;
            } else {
                right_c_index = s.indexOf('c',left_c_index+1);
                arr[i] = Math.min(Math.abs(left_c_index - i), Math.abs(right_c_index - i));
                left_c_index = right_c_index;
            }
        }
        System.out.println(arr);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s = st.nextToken();
        char c = st.nextToken().charAt(0);

        solution(s,c);
        }
}

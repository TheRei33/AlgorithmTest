package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();
        StringTokenizer st;

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                result.append(sb.reverse()+" ");
            }
            result.append('\n');
        }
        System.out.println(result);
    }
}

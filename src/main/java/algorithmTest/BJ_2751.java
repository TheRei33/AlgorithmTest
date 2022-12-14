package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2000001];
        // 범위 -1000000 ~ 1000000

        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i=0; i< arr.length;i++) {
            if(arr[i]) {
                sb.append(i-1000000).append('\n');
            }
        }

        System.out.println(sb);
    }
}

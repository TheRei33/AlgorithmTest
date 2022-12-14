package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    counting이라는 새로울 배열를 만들어서 정렬
    단점: 큰 숫자를 정렬할 시 비효율
 */
public class Bj_2750_CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2001];
        // 범위 -1000 ~ 1000, 0은 index[1000]

        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        for(int i=0; i< 2001;i++) {
            if(arr[i]) {
                sb.append(i-1000).append('\n');
            }
        }

        System.out.println(sb);
    }
}

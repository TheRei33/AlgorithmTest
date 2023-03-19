package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleArrayOfNumbers {
    public int[] solution(int[] arr, int divisor) {

        int cnt =0;
        ArrayList<Integer> list = new ArrayList();

        for(int i=0; i<arr.length;i++) {
            if(arr[i]%divisor == 0) {
                cnt++;
                list.add(arr[i]);
            }
        }

        if(cnt==0) {
            list.add(-1);
            cnt++;
        }

        int[] answer = new int[cnt];

        for(int i=0;i<cnt;i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}

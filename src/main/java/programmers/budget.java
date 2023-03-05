package programmers;

import java.util.Arrays;

public class budget {
    public static void main(String[] args) {
        int[] d = {1,2,3,4,5};
        int budget = 9;
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i =0; i< d.length;i++) {
            budget -= d[i];

            if(budget < 0)
                break;

            answer++;
        }

        return answer;
    }
}

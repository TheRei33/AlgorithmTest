package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class fruiterer {
    public static void main(String[] args) {
        System.out.println(5%2); // 나머지 값
        System.out.println(5/2); //
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());

        for(int i = 1; i <= score.length/m ;i++) {
            answer += score[i*m-1]*m;

        }

        return answer;
    }
}

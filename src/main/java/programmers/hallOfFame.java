package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class hallOfFame {

    /*
     *1. k 배열 생성 , list 생성
     *2. k보다 작을 경우 list 포함
     *3. k보다 클 경우 0번째 배열 비교 후 0번 배열에 넣기
     *4. 리스트 정렬
     *5. 0번째 배열 answer배열에 담기
     *6. PrioirtyQueue 방법도 있음
     */


    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length;i++) {
            if(i<k) {
                list.add(score[i]);
            } else {
                if(list.get(0) < score[i]) {
                    list.set(0, score[i]);
                }
            }

            Collections.sort(list);

            answer[i] = list.get(0);
        }
        return answer;
    }
}

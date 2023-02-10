package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class leastRectangle {
    /*
    세로의 길이를 클 경우 가로 길이로 변경
    가로 배열 내림차순 정렬
    세로 배열 내림차순 정렬
    마지막 가로[0] * 세로[0]
     */

    public int solution(int[][] sizes) {

        ArrayList<Integer> wlist = new ArrayList<Integer>();
        ArrayList<Integer> hlist = new ArrayList<Integer>();


        for(int i=0; i< sizes.length;i++) {
            int temp;
            if(sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            wlist.add(sizes[i][0]);
            hlist.add(sizes[i][1]);


        }

        Collections.sort(wlist, Collections.reverseOrder());
        Collections.sort(hlist, Collections.reverseOrder());

        int answer = wlist.get(0) * hlist.get(0);

        return answer;
    }    
}

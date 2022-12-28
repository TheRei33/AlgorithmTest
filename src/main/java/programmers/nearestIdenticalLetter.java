package programmers;

import java.util.Arrays;

public class nearestIdenticalLetter {
    static String a = "banana";

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(a)));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1;

        for(int i=1; i<s.length();i++) {
            int x = s.lastIndexOf(s.substring(i,i+1),i-1);

            if(x == -1) {  // -1은 단어를 찾지 못했을 경우
                answer[i] = x;
            } else {
                answer[i] = i-x;
            }
        }

        return answer;
    }
}

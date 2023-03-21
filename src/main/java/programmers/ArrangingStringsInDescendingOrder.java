package programmers;

import java.util.Arrays;
import java.util.Collections;

public class ArrangingStringsInDescendingOrder {
    public static void main(String[] args) {
        String s = "ZbcdefgD";
        String[] str = s.split("");

        System.out.println(Arrays.toString(str));

        Arrays.sort(str);

        System.out.println(Arrays.toString(str));

        Arrays.sort(str, Collections.reverseOrder());

        System.out.println(Arrays.toString(str));
    }

    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String st : str)
            answer += st;

        return answer;
    }
}

package programmers;

import java.util.Arrays;

public class ArrangeInDescendingIntegerOrder {

    public static void main(String[] args) {
        long n = 123422;

        char[] c = (String.valueOf(n)).toCharArray();

        Arrays.sort(c);

        StringBuilder sb = new StringBuilder();
        sb.append(c).reverse();

        String s = sb.toString();
        long answer = Long.parseLong(s);

        System.out.println(c);
        System.out.println(c.length);
        System.out.println(sb);
        System.out.println(answer);
    }

    public long solution(long n) {
        char[] c = (String.valueOf(n)).toCharArray();
        Arrays.sort(c);

        StringBuilder sb = new StringBuilder();
        sb.append(c).reverse();

        String s = sb.toString();

        long answer = Long.parseLong(s);
        return answer;
    }
}

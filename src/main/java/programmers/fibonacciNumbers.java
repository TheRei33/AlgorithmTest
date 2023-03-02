package programmers;

import java.util.ArrayList;

public class fibonacciNumbers {
    public static int solution(int n) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);

        for(int i = 0; i < n-1; i++) {
            list.add((list.get(i)+list.get(i+1))%1234567);
        }

        return list.get(n)%1234567;
    }
}

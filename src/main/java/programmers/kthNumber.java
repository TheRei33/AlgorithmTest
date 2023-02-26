package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class kthNumber {
    public static void main(String[] args) {
        int[][] a = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] b = {1, 5, 2, 6, 3, 7, 4};
        int[] c = a[0];

        System.out.println(solution(b,a).toString());
        System.out.println(Arrays.toString(solution(b,a)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i < commands.length;i++) {
            answer[i] = num(array,commands[i]);
        }

        return answer;
    }

    private static int num(int[] arr1, int[] arr2) {
        int start = arr2[0]-1;
        int end = arr2[1]-1;
        ArrayList list = new ArrayList();

        for(int i =start; i<=end;i++) {
            list.add(arr1[i]);
        }

        Collections.sort(list);

        return (int) list.get(arr2[2]-1);
    }
}

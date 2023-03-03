package programmers;

import java.util.Arrays;

public class mapSecret {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] starr = new String[5];

        for(int i =0; i <n;i++) {
            starr[i] = Integer.toBinaryString(arr[i] | arr2[i]);
        }

        System.out.println(Arrays.toString(starr));

        for(int i=0;i<n;i++) {
            starr[i] = String.format("%" + n + "s", starr[i]); // n은 자리수 설정, s는 문자열
        }

        System.out.println(Arrays.toString(starr));

        for(int i=0;i<n;i++) {
            starr[i] = starr[i].replaceAll("1", "#");
            starr[i] = starr[i].replaceAll("0", " ");

        }

        System.out.println(Arrays.toString(starr));

        String binaryString = Integer.toBinaryString(9);
        System.out.println(binaryString);
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i =0; i <n;i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for(int i=0;i<n;i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        return answer;
    }
}


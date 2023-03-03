package programmers;

import java.util.Arrays;

public class dartGame {
    public static void main(String[] args) {
        String a = "1S2D*3T";

        System.out.println(solution(a));
        System.out.println(sol(a));

    }

    public static int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        int index = -1; // arrIndex

        String[] str = dartResult.split("");

        for(int i = 0; i< dartResult.length();i++) {
            char c = dartResult.charAt(i);

            if(c >= '0' && c <='9') {
                index++;
                arr[index] = Integer.parseInt(String.valueOf(c));

                if(str[i+1].matches("[0~9]")) {
                    arr[index] *= 10;
                    i++;
                }
            }

            switch(c) {
                case 'D':
                    arr[index] = (int)Math.pow(arr[index], 2);
                    break;
                case 'T' :
                    arr[index] = (int)Math.pow(arr[index], 3);
                    break;
                case '*' :
                    arr[index] *= 2;
                    if(index - 1 >= 0) arr[index-1] *= 2;
                    break;
                case '#' :
                    arr[index] *= -1;
                    break;
            }

        }
        for(int a : arr) {
            answer += a;
        }

        return answer;
    }

    public static String sol(String dartResult) {
        int[] arr = new int[3];
        int index = -1; // arrIndex

        for(int i = 0; i< dartResult.length();i++) {
            char c = dartResult.charAt(i);

            if(c >= '0' && c <='9') {
                index++;
                arr[index] = Integer.parseInt(String.valueOf(c));
            }

            switch(c) {
                case 'D':
                    arr[index] = (int)Math.pow(arr[index], 2);
                    break;
                case 'T' :
                    arr[index] = (int)Math.pow(arr[index], 3);
                    break;
                case '*' :
                    arr[index] *= 2;
                    break;
                case '#' :
                    arr[index] *= -1;
                    break;
            }

        }

        return Arrays.toString(arr);
    }


}


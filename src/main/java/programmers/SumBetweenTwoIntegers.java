package programmers;

public class SumBetweenTwoIntegers {
    public long solution(int a, int b) {
        long answer = 0L;

        int A = a;
        int B = b;
        int temp = 0;

        if(B<A) {
            temp = A;
            A = B;
            B = temp;
        }


        for(int i=A;i<=B;i++) {
            answer += i;
        }

        return answer;
    }
}

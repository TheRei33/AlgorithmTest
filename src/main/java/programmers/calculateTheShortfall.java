package programmers;


public class calculateTheShortfall {
    public long solution(int price, int money, int count) {

        long csum =0;

        for(long i=1;i<=count;i++) {
            csum += i;
        }

        long answer = price*csum-money;

        if(answer < 0) {
            answer =0;
        }

        return answer;
    }
}

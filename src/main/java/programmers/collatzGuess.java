package programmers;

public class collatzGuess {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};

        System.out.println(4%2);
        System.out.println(4/2);


        System.out.println(solution(626331));
    }

    public static int solution(long num) {
        int answer = 0;

        long n =  num; // 오버 플로우 방지
        while(n != 1) {
            if(n%2 == 0){
                n = n/2;
            } else{
                n = n*3+1;
            }
            answer++;

            if(answer >= 500){
                return -1;
            }
        }

        return answer;
    }
}

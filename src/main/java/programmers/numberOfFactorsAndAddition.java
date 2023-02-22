package programmers;

public class numberOfFactorsAndAddition {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(run(16));

        System.out.println(10/2);
        System.out.println(10%2);
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right;i++) {
            if(run(i)%2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public static int run(int num) {
        int cnt =0;
        for(int i=1; i <= num;i++) {
            if(num%i == 0) {
                cnt++;
            }
        }
        return cnt;
    }

}


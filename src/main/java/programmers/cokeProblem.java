package programmers;

public class cokeProblem {
    public static void main(String[] args) {
        System.out.println(5%2);
        System.out.println(5/2);


        System.out.println(solution(2,1,20));
    }

    public static int solution(int a, int b, int n) {
        int answer =0;
        while(true) {

            if(n<a)
                break;

            int i;
            i = n/a;
            answer += i*b;
            n = (i*b) +(n%a);
        }

        return answer;
    }
}

package programmers;

public class templarWeapon {
    /*
     * 1. 약수 메서드 구하가
     * 2. 구한 약수 값을 조건에 맞으면 answer에 더하기
     */
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i =1; i <= number;i++) {
            int result = getNum(i);

            if(result <= limit) {
                answer += result;
            } else {
                answer += power;
            }
        }

        return answer;
    }

    static int getNum(int n) {
        int cnt =0;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) cnt++;
            else if (n % i == 0) cnt += 2;
        }
        return cnt;
    }
}

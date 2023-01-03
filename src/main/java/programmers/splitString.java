package programmers;

public class splitString {
    public static String a = "abracadabra";

    /*
     * 1. 첫번째 단어 출력
     * 2. 첫번째 단어가 얼마나 나오는 지 카운트
     * 3. 다른 숫자가 나오면 숫자 카운트
     * 4. 카운트된 숫자가 같은 경우에 단어를 짜르고 다시 for문
     */

    public static void main(String[] args) {
        System.out.println(solution(a));
    }

    public static int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int charCnt = 0;
        int difCnt = 0;

        for(int i=0; i<s.length();i++) {
            if(charCnt == difCnt) {
                answer++;
                first = s.charAt(i);
            }

            if(first == s.charAt(i)) {
                charCnt++;
            } else {
                difCnt++;
            }

        }


        return answer;
    }
}

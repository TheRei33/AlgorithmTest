package programmers;

public class smallSubstring {
    public static int solution(String A, String B) {
        int answer=0;
        int len = A.length() - B.length();
        for(int i=0;i < len+1;i++) {
            long a = Long.parseLong(A.substring(i, i + B.length()));
            long b = Long.parseLong(B);
            if(a <= b) {
                answer++;
            }

        }

        return answer;
    }
}

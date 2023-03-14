package programmers;

public class CaesarCipher {
    public static String solution(String s, int n) {
        String answer = "";

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if(c==' ') {
                answer += c;
                continue;
            }

            if(c>=65 && c<=90) {
                if(c+n > 90) {
                    c -= 26;
                }
                c += n;
            } else if (c>=97 && c<=122) {
                if(c+n > 122) {
                    c -= 26;
                }
                c += n;
            }
            answer += c;
        }

        return answer;
    }
}

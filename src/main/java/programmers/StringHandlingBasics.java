package programmers;

public class StringHandlingBasics {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length()!=4 && s.length()!=6) answer = false;

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if((c>=65&&c<=90) ||(c>=97 && c<=122)) {
                answer = false;
            }
        }

        return answer;
    }
}

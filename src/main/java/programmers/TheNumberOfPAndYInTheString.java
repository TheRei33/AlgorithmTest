package programmers;

public class TheNumberOfPAndYInTheString {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0;
        int ycnt = 0;

        for(int i =0 ;i<s.length();i++) {
            char c = s.charAt(i);

            if(c=='p' || c=='P'){
                pcnt++;
            } else if(c=='y' || c=='Y') {
                ycnt++;
            }
        }

        if(pcnt != ycnt)
            answer = false;

        return answer;
    }
}

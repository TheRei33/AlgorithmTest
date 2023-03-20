package programmers;

public class GetMiddleLetter {
    public static void main(String[] args) {
        System.out.println(6%2);
        System.out.println(6/2);

        String s = "abcde";
        String S = "awer";

        System.out.println(S.substring(S.length()/2-1,S.length()/2+1));
        System.out.println(s.substring(s.length()/2,s.length()/2+1));

    }

    public static String solution(String s) {
        String answer = "";

        if(s.length()%2 == 0){
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }

        return answer;
    }

}

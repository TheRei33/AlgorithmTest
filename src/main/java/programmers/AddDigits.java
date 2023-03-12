package programmers;

public class AddDigits {
    public static void main(String[] args) {
        int a = 333;
        String b = String.valueOf(a);
        System.out.println(b);
        System.out.println(b.length());
//
//		for(int i=0;i<b.length();i++) {
//			System.out.println(Integer.parseInt(b.substring(i, 1)));
//		}
//
        System.out.println(solution(a));
    }

    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        for(int i=0; i<str.length();i++) {
            answer += Integer.parseInt(str.substring(i, i+1));
        }

        return answer;
    }
}

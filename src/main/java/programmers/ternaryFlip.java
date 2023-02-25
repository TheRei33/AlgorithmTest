package programmers;

public class ternaryFlip {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(Integer.toString(45,3)); // 10진법 -> 3진법
        String a = sb.append(Integer.toString(45,3)).reverse().toString();
        System.out.println(a);
        System.out.println(Integer.parseInt(Integer.toString(45,3),3)); // 3진법 -> 10진법
        System.out.println(Integer.parseInt(a,3));

    }

    public int solution(int n) {
        String ans = "";
        while(n != 0) {
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans, 3);
    }
}

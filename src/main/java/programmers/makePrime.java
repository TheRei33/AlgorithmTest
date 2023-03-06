package programmers;

public class makePrime {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};

        System.out.println(solution(num));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }

    private static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}

package programmers;

public class twoPassword {
    class Solution {
        public String solution(String s, String skip, int index) {
            char[] arr = s.toCharArray();

            for(int i = 0; i < arr.length;i++) {
                for(int j =0; j < index; j++) {
                    do {
                        arr[i]++;
                        if(arr[i] > 'z') {
                            arr[i] -= 26;
                        }

                    }while(skip.contains(String.valueOf(arr[i]))); // contains t/f, valueOf는 null값을 null로 출력 tos는 nullpointexception
                }
            }

            String answer = String.valueOf(arr);
            return answer;
        }

    }
}

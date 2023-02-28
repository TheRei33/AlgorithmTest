package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class athletesWhoDidNotFinish {
    public static void main(String[] args) {
        String[] a = {"leo", "kiki", "eden"};
        String[] b = {"eden", "kiki"};

        System.out.println(solution(a,b));

        HashMap<String, Integer> map = new HashMap<>();

        for(String A: a) {
            map.put(A, map.getOrDefault(A, 0)+1);
        }

        System.out.println(map);

        for(String B: b) {
            map.put(B, map.get(B) -1);
        }

        System.out.println(map);
    }

    // 배열 제거


    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String p: participant) {
            map.put(p, map.getOrDefault(p, 0)+1);
        }

        for(String c: completion) {
            map.put(c, map.get(c) -1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
/*
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        	for(int i =0; i <completion.length; i++) {
        		if(!participant[i].equals(completion[i])) {
        			answer = participant[i];
        			break;
        		}
        		if(i == completion.length-1)
        					answer = participant[i+1];
        	}

        return answer;
    }
*/
}

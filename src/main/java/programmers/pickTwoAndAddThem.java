package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class pickTwoAndAddThem {
    public static void main(String[] args) {
/*		List<String> originList = new ArrayList<String>();
		originList.add("1");
		originList.add("1");
		originList.add("가나다");
		originList.add("가나다");
		originList.add("ABC");
		originList.add("ABC");

		List<String> resultList = new ArrayList<String>();

		resultList = originList.stream().distinct().collect(Collectors.toList());

		System.out.println("getDistinctStream : originList " + originList);
		System.out.println("getDistinctStream : resultList " + resultList);
*/
        int[] arr = {2,1,3,4,1};
        System.out.println(solution(arr));
    }

    public static int[] solution(int[] numbers) {
        ArrayList list = new ArrayList();

        int i =0;
        while(true) {
            if(i==numbers.length-1) {
                break;
            }

            for(int j = i+1; j< numbers.length;j++) {
                list.add(numbers[i]+numbers[j]);
            }
            i++;

        }

        Collections.sort(list);
        list = (ArrayList) list.stream().distinct().collect(Collectors.toList());

        int[] answer = new int[list.size()];

        for(int k=0; k< list.size();k++) {
            answer[k] = (int) list.get(k);
        }

        return answer;
    }
}

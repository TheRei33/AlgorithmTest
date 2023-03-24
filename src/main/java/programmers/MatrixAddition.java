package programmers;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3},{2,3}};

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1[0].length;j++)
                answer[i][j] = arr1[i][j] + arr2[i][j];
        }

        return answer;
    }
}

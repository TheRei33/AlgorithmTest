package algorithmTest;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] data, int start, int end) {
        if(start >= end) { // 원소가 한 개인 경우
            return;
        }

        int pivot = start; // 첫번째 원소
        int i = start + 1;
        int j = end;

        while(i <= j) { // 엇갈릴 때 까지 반복
            while (i <= end && data[i] <= data[pivot]) {  // 키 값보다 큰 값 을 만날 때까지 오른쪽으로 이동
                i++;
            }
            while (j > start && data[j] >= data[pivot]) {  // 키 값보다 작은 값을 만날 때까지 반복
                j--;
            }

            if (i > j) {
                swap(data, pivot, j);
            } else {
                swap(data, i, j);
            }
        }

        quickSort(data, start, j-1);
        quickSort(data, j+1, end);
    }

    public static void  swap (int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        quickSort(data, 0, data.length -1);
        System.out.println("data = " + Arrays.toString(data));
    }
}

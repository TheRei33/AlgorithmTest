package algorithmTest;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int k, temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(int i =0; i<9;i++){
            k = i;
            while(array[k] > array[k+1]) {
                temp = array[k];
                array[k] = array[k+1];
                array[k+1] = temp;
                k--;
            }
        }

        System.out.println("array = " + Arrays.toString(array));
    }
}

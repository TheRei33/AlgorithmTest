package algorithmTest;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int min, index = 0, temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(int i =0; i < 10; i++) {
            min = 9999;
            for(int j =i; j < 10; j++) {
                if(min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        System.out.println("array = " + Arrays.toString(array));
    }
}

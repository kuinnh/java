package cn.kuinn.university;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {18, 23, 12, 34, 56, 78, 90, 11, 33, 44, 45, 59, 22, 4, 6, 42};


        for (int i = 0; i < array.length - 1; i++) {
            int n = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    n++;
                }
            }
            if (n == 0) {
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
package cn.kuinn.university;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {18, 23, 12, 34, 56, 78, 90, 11, 33, 44, 45, 59, 22, 4, 6, 42};
        int num = 6;

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
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();

        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while(left <=  right){
            int mid =left + (right - left)/2;
            System.out.printf("%d %d %d\n", left, mid, right);
            if(num > array[mid]){
                left = mid + 1;
            }else if(num < array[mid]){
                right = mid - 1;
            }else {
                index = mid;
                break;
            }
        }

        System.out.println(index);

    }
}






































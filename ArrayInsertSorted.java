package cn.kuinn.university;

public class ArrayInsertSorted {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        int num = 23;

        arr = insert(arr, num);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] insert(int[] arr, int num) {
        int[] arr1 = new int[arr.length + 1];
        int index = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (i < index) {
                arr1[i] = arr[i];
            }else if (i == index) {
                arr1[i] = num;
            }else{
                arr1[i] = arr[i -1];
            }
        }
        return arr1;
    }
}

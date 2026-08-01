package cn.kuinn.university;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        char choice = 'Y';


        while (choice == 'Y' || choice == 'y') {
            System.out.println("请输入添加的数:");
            int num = scanner.nextInt();

            int[] array1 = new int[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array1[array1.length-1] = num;
            array = array1;


            System.out.println("是否要继续添加: y/n");
            choice = scanner.next().charAt(0);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

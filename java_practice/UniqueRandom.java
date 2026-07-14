package cn.kuinn.chihehe;

import java.util.Random;
import java.util.Scanner;


public class UniqueRandom {
    public static void main(String[] _arg) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[10];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = true;
            while(duplicate){
                num = random.nextInt(1,101);
                duplicate = false;
                for(int j = 0; j < i; j++){
                    if(num == arr[j]){
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate){
                    arr[i] = num;
                }
            }

        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}




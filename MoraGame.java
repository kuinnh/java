package cn.kuinn.university;

import java.util.Scanner;
import java.util.Random;

public class MoraGame {
    public static void main(String[] args) {
        Tom tom = new Tom();
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== 猜拳游戏开始 ======");
        System.out.println("规则说明：0-石头 | 1-剪刀 | 2-布 | -1-退出");

        while(true){
            int me = scanner.nextInt();
            if(me>=0 && me<=2) {
                tom.play(me);
            }else if(me == -1){
                System.out.println("退出");
                break;
            }else if(me > 2 || me < 0){
                System.out.println("输入错误");
            }

        }
        tom.showResults();

    }

}
class Tom{
    int winCount;
    int count;
    String[] records;

    public Tom(){
        winCount = 0;
        count = 0;
        records = new String[0];
    }
    //机器人出拳
    public int robot(){
        return new Random().nextInt(3);
    }
    //数组扩容
    public String[] expansion(){
        String[] arr = new String[records.length + 1];
        for (int i = 0; i < records.length; i++) {
            arr[i] = records[i];
        }
        return arr;
    }
    //猜拳
    public void play(int me){
        int num = this.robot();
        String result = "";
        this.records = this.expansion();
        if(num == me){
            this.records[this.count++] = "平局";
            result = "平局";
        }else if((num == 0 && me == 2) ||
                (num == 1 && me == 0) ||
                (num == 2 && me == 1)){
            this.records[this.count++] = "赢了";
            this.winCount++;
            result = "Tom赢了";
        }else{
            this.records[this.count++] = "输了";
            result = "Tom输了";
        }
        String detail = "第 " + count + " 局 | Tom出: " + getGesture(me)
                + " | 电脑出: " + getGesture(num)
                + " | 结果: " + result;
        System.out.println(detail);

    }
    // 辅助转换：把数字映射为拳势名称
    public String getGesture(int num){
        switch(num){
            case 0: return "石头";
            case 1: return "剪刀";
            case 2: return "布";
            default: return "未知";
        }

    }

    public void showResults(){
        System.out.println("\n========== Tom 对局清单 ==========");
        for (int i = 0; i < this.records.length; i++) {
            System.out.println("第"+ (i+1) +"局 "+ this.records[i]);
        }
        System.out.println("=================================");
        System.out.println("总局数: " + this.count + " 局 | Tom 胜场: " + this.winCount + " 局");
    }

}
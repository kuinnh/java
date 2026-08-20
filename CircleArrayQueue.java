package cn.kuinn.dataStructures;

import java.util.Scanner;

public class CircleArrayQueue {
    public static void main(String[] args) {
        ArrayQueueDemo queue = new ArrayQueueDemo(3);
        Scanner scanner = new Scanner(System.in);

        char key = ' ';
        boolean loop = true;
        // 菜单
        while(loop) {
            System.out.println("\n--- 队列操作菜单 ---");
            System.out.println("s(show): 显示队列");
            System.out.println("a(add):  添加数据");
            System.out.println("g(get):  取出数据");
            System.out.println("h(head): 查看队头");
            System.out.println("e(exit): 退出程序");
            System.out.print("请输入指令: ");
            key = scanner.next().charAt(0);

            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入要添加的数: ");
                    queue.addQueue(scanner.nextInt());
                    break;
                case 'g':
                    try {
                        System.out.println("取出的数据是: " + queue.getQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    queue.showHead();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }


    }
}
class ArrayQueueDemo {
    private Integer[] array;
    private int front;
    private int rear;
    private int maxSize;

    public ArrayQueueDemo(int maxSize){
        this.maxSize = maxSize;
        array = new Integer[maxSize];
    }
    // 判断队列是否满
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }
    // 判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }
    // 添加数据到队列
    public void addQueue(int n){
        if(isFull()) {
            System.out.println("队列已满，无法添加数据");
        }else{
            array[rear] = n;
            rear = (rear + 1) % maxSize;
        }

    }
    // 获取队列数据
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，无法获取数据");
        }
        int value = array[front];
        front = (front + 1) % maxSize;
        return value;
    }
    // 显示队头数据
    public void showHead(){
        if(isEmpty()){
            System.out.println("队列为空");
        }else{
            System.out.println("队头数据是: " + array[front]);
        }
    }
    // 显示队列个数
    public int size(){
        return (maxSize + rear - front) % maxSize;
    }


    //打印数组
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
        }else {
            for (int i = front; i < front + size(); i++) {
                System.out.println(array[i % maxSize]);
            }
        }
    }

}

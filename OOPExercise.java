package cn.kuinn.university;

public class OOPExercise{
    public static void main(String[] args) {

    }

}
class Person {

    public Double max(double[] arry){
        if(arry != null || arry.length == 0){
            return null;
        }
        double num = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if(arry[i] > num){
                num = arry[i];
            }
        }
        return num;
    }


    public int find(String[] arry, String num){
        for (int i = 0; i < arry.length; i++) {
            if(num.equals(arry[i])){
                return i;
            }
        }
        return -1;
    }

}

class Book{
    int number;
    public void updatePrice(){
        if(this.number > 150){
            this.number = 150;
        }else if(this.number > 100){
            this.number = 100;
        }
    }
}

class A03{
    public int[] copyArr(int[] arr){
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        return arr1;
    }
}

//class Circle{
//    public double getArea(double radius){
//        return 3.14 * radius * radius;
//    }
//
//    public double getPerimeter(double radius){
//        return 2 * 3.14 * radius;
//    }
//}

class Cale{
    double num1;
    double num2;

    public Cale(){}
    public Cale(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1 + num2;
    }

    public double minus(){
        return num1 - num2;
    }

    public double ride(){
        return num1 * num2;
    }
    public Double divide(){
        if(num2 == 0) {
            System.out.println("除数不能为0");
            return null;
        }
        return num1 / num2;
    }

}

//7
class Dog{
    String name;
    String color;
    int age;

    public Dog(){}
    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.println("Name: " + name + ", Color: " + color
                            + ", Age: " + age);
    }
}

//8  10,9,10


//9

class Music{
    String name;
    int times;

    public Music(){}
    public Music(String name, int times){
        this.name = name;
        this.times = times;
    }

    public void play(){
        System.out.println("playing");
    }
    public void getInfo(){
        System.out.println("name: " + name + ", times: " + times);
    }
}

//10 101,100,101,101


//11
class Me{
    public double method(double... number){
        double max = number[0];
        for (int i = 1; i < number.length; i++) {
            if(number[i]> max){
                max = number[i];
            }
        }
        return max;
    }
}


//12
class Employee{
    String name;
    String gender;
    String position;
    int age;
    double salary;

    public Employee(String name,String gender,int age, String position,double salary){
        this(name, gender, age);
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position,double salary){
        this.position = position;
        this.salary = salary;
    }

}

//13
class Circle{
    double radius;
    public double findArea(){
        return Math.PI * radius * radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printAreas(Circle c, int times){
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println("radius：" + i + "\tArea" + c.findArea());
        }
    }
}

































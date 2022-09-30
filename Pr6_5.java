public class Pr6_5 {
    public static void main(String[] args) {
        MyThread1 obj1=new MyThread1();
        MyThread2 obj2=new MyThread2(obj1," World");
        MyThread2 obj3=new MyThread2(obj1," Everyone");
        obj2.start();
        obj3.start();
        System.out.println("21CE151_Bhautik");
    }
}
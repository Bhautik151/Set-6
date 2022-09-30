public class Pr6_1 {
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        RunnableDemo1 rd1=new RunnableDemo1();
        RunnableDemo2 rd2=new RunnableDemo2();
        Thread t3 = new Thread(rd1);
        Thread t4 = new Thread(rd2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("21CE151_Bhautik");
    }
}
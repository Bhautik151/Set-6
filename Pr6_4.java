public class Pr6_4 {
    public static void main(String[] args) {
        Test4 t1=new Test4();
        Test4 t2=new Test4();
        Test4 t3=new Test4();
        t1.setPriority(3);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("21CE151_Bhautik");
    }
}
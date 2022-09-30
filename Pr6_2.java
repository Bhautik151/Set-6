import java.util.Random;

public class Pr6_2 {
    public static void main(String[] args) {
        int a[] = new int[15];
        Random r = new Random();
        for (int i = 0; i < 15; i++)
            a[i] = r.nextInt(100);
        EvenThread t1 = new EvenThread(a);
        OddThread t2 = new OddThread(a);
        t1.start();
        t2.start();
        System.out.println("21CE151_Bhautik");
    }
}
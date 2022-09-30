//21CE151_Bhautik
class Test extends Thread {
    public void run() {
        int a = 1;
        try{
            a++;
            Thread.sleep(1000);
            System.out.println("After sleep method is executed Value of a " +a);
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
    }
}
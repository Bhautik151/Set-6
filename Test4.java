//21CE151_Bhautik
class Test4 extends Thread {
    public void run() {
        System.out.println("Running thread name is "+Thread.currentThread().getName());
                System.out.println("Running thread priority is "+Thread.currentThread().getPriority());
    }
}
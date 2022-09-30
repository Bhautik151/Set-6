//21CE151_Bhautik
class Thread1 extends Thread {   //extends Thread class
    public void run() {
        System.out.println("Hello World!");
    }
}
class Thread2 extends Thread {     //extends Thread class
    public void run() {
        System.out.println("Hello World!");
    }
}
class RunnableDemo1 implements Runnable {      //implements Runnable interface
    @Override
    public void run() {
        System.out.println("Thread1");
    }
}
class RunnableDemo2 implements Runnable {       //implements Runnable interface
    @Override
    public void run() {
        System.out.println("Thread1");
    }
}
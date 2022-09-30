class MyThread1 {
    public synchronized void display(String name){
        for (int i=0;i<3;i++){
            System.out.print("Hello");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(name);
        }
    }
}

class MyThread2 extends Thread{
    MyThread1 obj=new MyThread1();
    String name;

    MyThread2(MyThread1 obj,String name){
        this.obj=obj;
        this.name=name;
    }
    public void run(){
        obj.display(name);
    }
}
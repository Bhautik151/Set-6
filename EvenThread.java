//21CE151_Bhautik
class EvenThread extends Thread {
    int arr[]=new int[15];
    EvenThread(int a[]){
        this.arr=a;
    }
    public void run() {
        for(int i=0;i<15;i++) {
            if(arr[i]%2==0)
                System.out.println("This is an Even element: "+arr[i]);
        }
    }
}
class OddThread extends Thread {
    int arr[]=new int[15];
    OddThread(int a[]) {
        this.arr=a;
    }
    public void run() {
        for(int i=0;i<15;i++) {
            if(arr[i]%2!=0)
                System.out.println("This is an Odd element: "+arr[i]);
        }
    }
}
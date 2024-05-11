class MyRunnable implements Runnable{
    public void run(){
        try{
            System.out.println("Thread"+Thread.currentThread().getName()+"is runnable");
            Thread.sleep(1500);
            System.out.println("Thread"+Thread.currentThread().getName()+"has completed");
        }
        catch(InterruptedException e){
            System.out.println("Thread"+Thread.currentThread().getName()+"is interrupted");
        }
    }
}

public class Thread2 {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Thread th= new Thread(new MyRunnable());
            th.setName("Thread-"+(i+1));
            th.start();
        }
    }
    
}
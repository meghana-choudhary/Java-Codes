//package Threads(20&21);

class Multithreading extends Thread{
    public void run(){
        try{
            System.out.println("Thread is created with thread id-"+Thread.currentThread().getId());
        }
        catch(Exception e){
            System.out.println("Exception caught!!");
        }
    }
}

public class Thread1 {
    public static void main(String[] args){
        for(int i=0;i<20;i++){
            Multithreading ob = new Multithreading();
            ob.start();
        }
    }
    
}

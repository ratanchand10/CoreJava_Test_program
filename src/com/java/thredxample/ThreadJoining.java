package com.java.thredxample;

public class ThreadJoining implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread--->"+Thread.currentThread().getName());

            } catch (InterruptedException ie) {
                System.out.println("Exception in Theand main Class - Current Thread--->");
            }
          //  System.out.println("value of i--> " + i);
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadJoining() );
        Thread t2 = new Thread(new ThreadJoining() );
        Thread t3 = new Thread(new ThreadJoining() );

        t1.start();
        try{
            System.out.println("Current Thread--->"+Thread.currentThread().getName());
            t1.join();
        }catch (InterruptedException ie){
            System.out.println("Exception in Theand t1 block - Current Thread--->");
        }

        t2.start();
        try{
            System.out.println("Current Thread--->"+Thread.currentThread().getName());
            t2.join();
        }catch (InterruptedException ie){
            System.out.println("Exception in Theand t2 block - Current Thread--->");
        }

        t3.start();
        try{
            System.out.println("Current Thread--->"+Thread.currentThread().getName());
            t3.join();
        }catch (InterruptedException ie){
            System.out.println("Exception in Theand t3 block - Current Thread--->");
        }

    }
}

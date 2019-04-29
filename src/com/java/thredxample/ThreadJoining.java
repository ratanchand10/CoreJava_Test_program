package com.java.thredxample;



/*
 Joining Threads in Java
java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes its execution. If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period. However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.
There are three overloaded join functions.

join(): It will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.
Syntax:
public final void join()
join(long millis) :It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds).
Syntax:
public final synchronized void join(long millis)
join(long millis, int nanos): It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).
Syntax:
public final synchronized void join(long millis, int nanos)
 */

public class ThreadJoining implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Main Thread--->"+Thread.currentThread().getName());

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
            System.out.println("Current Thread t1 --->"+Thread.currentThread().getName());
            t1.join();
        }catch (InterruptedException ie){
            System.out.println("Exception in Theand t1 block - Current Thread--->");
        }

        t2.start();
        try{
            System.out.println("Current Thread t2 --->"+Thread.currentThread().getName());
            t2.join();
        }catch (InterruptedException ie){
            System.out.println("Exception in Theand t2 block - Current Thread--->");
        }

        t3.start();
        try{
            System.out.println("Current Thread t3 --->"+Thread.currentThread().getName());
            t3.join();
        }catch (InterruptedException ie){
            System.out.println("Exception in Theand t3 block - Current Thread--->");
        }

    }
}

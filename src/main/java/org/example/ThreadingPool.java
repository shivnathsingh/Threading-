package org.example;

import java.security.PublicKey;

// this class to show ThreadPool concept where
// we will create threadPoll using executors
public class ThreadingPool implements Runnable{

    private int num;
    public ThreadingPool(int num)
    {
        this.num=num;
    }

    public void printNum()
    {
        System.out.println(Thread.currentThread().getName()+" Num "+this.num);
    }
    @Override
    public void run() {
        printNum();
    }
}

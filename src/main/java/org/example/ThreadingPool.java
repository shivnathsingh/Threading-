package org.example;

import java.security.PublicKey;
import java.util.concurrent.Callable;

// this class to show ThreadPool concept where
// we will create threadPoll using executors
//public class ThreadingPool implements Runnable{

// Callable is calling now
public class ThreadingPool implements Callable<Integer> {
    private int num;
    public ThreadingPool(int num)
    {
        this.num=num;
    }

    public Integer printNum()
    {
        System.out.println(Thread.currentThread().getName());
        return this.num;
    }
    @Override
    public Integer call() {
        return printNum();
    }
}

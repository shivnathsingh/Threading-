package org.example;

import java.util.concurrent.Callable;

/*

This class is just to define unit of task for thread
this will be called from MergeSortUsingThread to submit task
 */
public class ThreadTask implements Callable<Void> {

    private MergeSortUsingThread mergeSortUsingThread;
    int l;
    int r;
    ThreadTask(MergeSortUsingThread ms,int l, int r)
    {
        this.mergeSortUsingThread =ms;
        this.l=l;
        this.r=r;
    }


    @Override
    public Void call() throws Exception {
        mergeSortUsingThread.mergeSortUsingThread(l,r);
        // business logic method call here
        return null;
    }
}

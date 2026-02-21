package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Thread t1= new Thread(new Threading());
//        t1.start();

//        Thread t2= new Thread(new Threading());
//        t2.start();

//        for(int i=0;i<1000;i++)
//        {
//            Thread t= new Thread(new Threading(i));
//            t.start();
//        }



/* here ThreadPoll Code using Execuotrs

 */

// Fixed thread poll
//ExecutorService es= Executors.newFixedThreadPool(5);
//
//for(int i=0;i<1000;i++)
//{
//    ThreadingPool t1=new ThreadingPool(i);
//    es.submit(t1);
//}


// Cached Thread Pool
ExecutorService es= Executors.newCachedThreadPool();

for(int i=0;i<1000;i++)
{
    ThreadingPool t1=new ThreadingPool(i);
    es.submit(t1);
}



    }
}
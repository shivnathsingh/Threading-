package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

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
//ExecutorService es= Executors.newCachedThreadPool();
//
//for(int i=0;i<1000;i++)
//{
//    ThreadingPool t1=new ThreadingPool(i);
//    es.submit(t1);
//}

/*
ExecutorService es= Executors.newFixedThreadPool(5);

Future<Integer> fsa[]=new Future[1001];

for(int i=0;i<1000;i++)
{
    ThreadingPool t1=new ThreadingPool(i);
    Future<Integer>fs = es.submit(t1);
    fsa[i]=fs;
}

for(int i=0;i<1000;i++)
{
    System.out.println(fsa[i].get());
}

es.shutdown();


 */

//int array[]={6,4,3,2,1,3,4,5,6,4,3,2,1,3,4,56,4,3,2,1,3,4,5,6,4,3,2,1,3,4,5,6,4,3,2,1,3,4,5};
int []array=new Random().ints(10000,0,200).toArray();
//System.out.print(Arrays.toString(array));
MergeSort ms=new MergeSort(array);
long start=System.nanoTime();
ms.mergeSort(0,array.length-1);
long end=System.nanoTime();
System.out.println();
System.out.println("/nSingle-thread MergeSort time: " + (end - start) / 1_000_000 + " ms");
//System.out.println(Arrays.toString(array));

int [] array2=new Random().ints(10000,0,200).toArray();
//System.out.println(Arrays.toString(array2));
ExecutorService es=Executors.newCachedThreadPool();
MergeSortUsingThread mst=new MergeSortUsingThread(array2,es);
start=System.nanoTime();
mst.sort();
end=System.nanoTime();
es.shutdown();
System.out.println();
System.out.println("/nMultiThreaded -thread MergeSort time: " + (end - start) / 1_000_000 + " ms");
//System.out.println(Arrays.toString(array2));




    }
}


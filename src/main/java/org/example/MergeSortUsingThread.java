package org.example;

/*
This class is created to implement merger sort using threading

 */


import java.util.concurrent.*;

public class MergeSortUsingThread  {

    int [] array;
    int [] temp;
    ExecutorService es;
    MergeSortUsingThread(int [] array,ExecutorService es)
    {
        this.array=array;
        this.temp=new int[array.length];
        this.es=es;
    }

    public void sort() throws ExecutionException, InterruptedException {
        mergeSortUsingThread(0,array.length-1);
    }

    public void mergeSortUsingThread(int l ,int r) throws ExecutionException, InterruptedException {
        if(l>=r) return;
        int mid=(l+r)/2;
        ThreadTask lefttask=new ThreadTask(this,l,mid);
        ThreadTask righttask=new ThreadTask(this,mid+1,r);
        Future<Void> left=es.submit(lefttask);
        Future<Void> right=es.submit(righttask);
        left.get();
        right.get();
        merge(l,mid,r);
    }

    private void merge(int l, int mid,int r)
    {

        int k=l;
        int i=l;
        int left=l;
        int right=mid+1;
        while(left<=mid && right <=r)
        {
            temp[k++]=(array[left]<=array[right]?array[left++]:array[right++]);
        }
        while(left<=mid)
        {
            temp[k++]=array[left++];
        }
        while ((right<=r))
        {
            temp[k++]=array[right++];
        }
        while(i<=r)
        {
            array[i]=temp[i];
            i++;
        }
        return;
    }


}

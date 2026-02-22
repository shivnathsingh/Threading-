package org.example;

import java.util.Arrays;

// merger Sort without threading
public class MergeSort
{
    int []array;
    int [] copyArray;

    public MergeSort(int []array)
    {
        this.array=array;
        this.copyArray=new int[array.length];
    }
    public void mergeSort(int l,int r)
    {
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(l,mid);
        mergeSort(mid+1,r);
        merge(l,mid,r);
    }
    public void merge(int l,int mid, int r)
    {

        int k=l;
        int r1=mid+1;
        int i=l;
        while(l<=mid && r1<=r)
        {
            copyArray[k++]=(array[l]<=array[r1])?array[l++]:array[r1++];
        }
        while(l<=mid)
        {
            copyArray[k++]=array[l++];
        }
        while (r1<=r)
        {
            copyArray[k++]=array[r1++];
        }
        while(i<=r)
        {
            array[i]=copyArray[i];
            i++;
        }
    }
}

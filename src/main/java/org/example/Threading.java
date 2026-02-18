package org.example;

public class Threading implements Runnable {

    public int num_to_print;
    public Threading(int num)
    {
        this.num_to_print=num;
    }
    public Threading()
    {}

    public void printVal()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
    }

    public void print_num() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(num_to_print);
    }

    @Override
    public void run() {
        try {
            print_num();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


//    @Override
//    public void run() {
//        printVal();
//    }
}

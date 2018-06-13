package com.example.coludserver;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Liuh
 * @date 2018/6/13 10:57
 */
public class ThreadTest   {
    private Lock lock=new ReentrantLock();
    public void service(){
        System.out.println(Thread.currentThread().getName()
                +"=============================================");
        try {
            Thread.sleep(1000L);
        }catch (Exception e){

        }

        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}

 class MyThread extends Thread{
    private ThreadTest myService;
    public MyThread(ThreadTest myService) {
        super();
        this.myService = myService;
    }
    @Override
    public void run() {
        myService.service();
    }
}

 class Test {
    public static void main(String[] args) {
        ThreadTest myService=new ThreadTest();
        MyThread mt1=new MyThread(myService);
        MyThread mt2=new MyThread(myService);
        MyThread mt3=new MyThread(myService);
        MyThread mt4=new MyThread(myService);
        MyThread mt5=new MyThread(myService);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}

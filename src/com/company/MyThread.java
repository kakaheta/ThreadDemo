package com.company;

/**
 * Created by jh on 2016/10/12.
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        for (Integer i=0; i<100000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

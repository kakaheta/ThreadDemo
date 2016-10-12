package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread thread4 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

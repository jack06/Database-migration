package com.nf147.hello.web;

public class ThreadDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("我是 t1");
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("我是 t2");
                try {
                    t1.start();
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t2.start();


    }
}

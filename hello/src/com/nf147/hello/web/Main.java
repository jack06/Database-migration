package com.nf147.hello.web;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始");

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("请您快点！");
            }
        };
        t1.start();
        t1.getState();

        System.out.println("继续");
    }
}

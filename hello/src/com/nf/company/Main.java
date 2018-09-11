package com.nf.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService ex=Executors.newCachedThreadPool();
        for (int i = 0; i <10 ; i++) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Boss.getInstance());
                }
            });
        }

    }
}

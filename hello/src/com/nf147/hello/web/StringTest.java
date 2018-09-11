package com.nf147.hello.web;

import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        long n = 50000;
        List<Thread> threads = new ArrayList<Thread>();

        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                Thread t = new Thread(() -> {
                    sb.append(".");
                });
                threads.add(t);
                t.start();
            }
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("len1: " + sb.length());
        }
        // ==========
        {
            StringBuffer sb = new StringBuffer();
            threads = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Thread t = new Thread(() -> {
                    sb.append(".");
                });
                threads.add(t);
                t.start();
            }
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("len2: " + sb.length());
        }
        // =================
        {
//            String origin = "";
//            long startTime = System.currentTimeMillis();
//            for (int i = 0; i < n; i++) {
//                origin += ".";
//            }
//            long endTime = System.currentTimeMillis();
//            System.out.println("花费的时间为: " + (endTime - startTime)/1000.0 + "S");
        }

    }
}

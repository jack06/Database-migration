package com.nf.company;

class TestThread extends Thread {
    volatile boolean flag = true;
    int i = 0;

    @Override
    public void run() {
        while (flag) {
            i++;
        }
    }

    public void setFlagFalse () {
        this.flag = false;
    }

    public int getI() {
        return i;
    }
}

public class VTest {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread();
        thread.start();
        Thread.sleep(3000);
        thread.setFlagFalse();
        System.out.println("over." + thread.getI());
    }
}

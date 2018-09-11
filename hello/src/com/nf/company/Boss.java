package com.nf.company;

public class Boss {

    static StringBuffer name;

    private Boss() {
    }

    static class Lazy {
        private static Boss instance = new Boss();
    }

    public static Boss getInstance() {
        return Lazy.instance;
    }
}


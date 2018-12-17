package com.design.model.single;

public class UtilSingleton {

    private UtilSingleton() {

    }

    public static class InnerSingleton {
        private static UtilSingleton INSTANCE = new UtilSingleton();
    }

    public static UtilSingleton getSingleton() {
        return InnerSingleton.INSTANCE;
    }
}

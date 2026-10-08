package com.inventory.reservation;

public final class App {

    private App() {
    }

    public static String greeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello";
        }
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "";
        System.out.println(greeting(name));
    }
}

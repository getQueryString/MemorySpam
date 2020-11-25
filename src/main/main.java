package main;

import java.util.ArrayList;

public class main extends Thread {

    static ArrayList<String> SPAMLOL = new ArrayList<>();

    public static void main(String[] args) {
        SPAMLOL.add("SPAM");
        new main().start();
    }

    @Override
    public void run() {
        while (true) {
            SPAMLOL.add("SPAM");
            new main().start();
        }

    }
}

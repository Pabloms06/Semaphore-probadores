package com.company;

public class Main {


    public static void main(String[] args) {
        Probador p = new Probador();
        for (int i = 0; i < 10; i++){
            Cliente t = new Cliente(p);
            t.setName("Cliente " + i);
            t.start();
        }
    }
}

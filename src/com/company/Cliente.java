package com.company;

import java.util.Random;

public class Cliente extends Thread{

    Probador probador;

    public Cliente(Probador probador1){
        this.probador = probador1;
    }

    @Override
    public void run(){
        try{
            probador.entrarprobador(this);
            System.out.println("El "+getName()+" se esta probando la ropa");
            sleep(2000);
            System.out.println(""+getName()+" ha terminado de probarse la ropa");
            boolean ganador = new Random().nextBoolean();
            if (ganador==true){
                System.out.println(getName()+" le gusta como le queda la ropa");
            }
            else
                System.out.println(getName()+" no le gusta como le queda la ropa");
            probador.salirprobador();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

package com.company;

import java.util.concurrent.Semaphore;

public class Probador extends Thread{

    private static final int MAXIMOCLIENTES= 3;

    private final Semaphore available = new Semaphore(MAXIMOCLIENTES,false);

    public void entrarprobador(Cliente cliente) throws InterruptedException{
        available.acquire();  //3 clientes
    }

    public void salirprobador(){
        available.release(); //Salga el cliente que se ha probado la ropa
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author santi
 */
public class Mesa extends Thread {

    static Semaphore produccion = new Semaphore(0, true);
    static Semaphore consumo = new Semaphore(1);
    
    static final int CANTIDAD = 2;
    static final int TARROS = 2;
    
    static int cantidad = CANTIDAD;
    static int tarros = 0;
    
    static Oso oso = new Oso();
    static Abeja[] abejas = new Abeja[7];

    public void nombrarEmpezarAbejas() {
        int i = 0;
        for (Abeja a : abejas) {
            i++;
            a = new Abeja();
            a.setName(Integer.toString(i));
            a.start();
        }
    }

    @Override
    public void run() {

        oso.start();
        nombrarEmpezarAbejas();
        
    }
  
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        mesa.start();
    }
}

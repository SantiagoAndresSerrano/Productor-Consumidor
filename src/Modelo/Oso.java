/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class Oso extends Thread {

    static Semaphore consumo = Mesa.consumo;

    @Override
    public void run() {

        while (Mesa.tarros < Mesa.TARROS) {

            try {

                if (Mesa.cantidad <= Mesa.CANTIDAD && Mesa.cantidad > 0) {
                    
                    Thread.sleep(800);
                    if(Mesa.tarros == Mesa.TARROS)
                    {
                        
                    this.stop();
                    }
                        
                    System.out.println("Consumo miel..." + Mesa.cantidad);
                    Mesa.cantidad--;

                }
                if (Mesa.cantidad == 0) {
                    System.out.println("===***=================================****=======");
                    System.out.println("Espero a que produzcan tarros de miel...");
                    System.out.println("===***=================================****=======");
                    while (true) {
                        if (Mesa.cantidad >= (Mesa.CANTIDAD - 1)) {

                            break;
                        }
                        Thread.sleep(400);
                        Mesa.produccion.release();
                        Thread.sleep(400);

                    }
                    consumo.acquire();
                    Thread.sleep(600);

                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

}

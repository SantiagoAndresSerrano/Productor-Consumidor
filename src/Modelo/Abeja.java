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
public class Abeja extends Thread {

    Semaphore productor = Mesa.produccion;
    int produccion = 1;

    @Override
    public void run() {

        while (Mesa.tarros < Mesa.TARROS) {
            try {

                if (Mesa.cantidad <= Mesa.CANTIDAD) {

                    productor.acquire();
                    Thread.sleep(500);

                    System.out.println("Abeja " + this.getName()
                            + " produjo= " + produccion + " cantidad de miel"
                    );
                    Thread.sleep(500);
                    Mesa.cantidad += produccion;

                }

                if (Mesa.cantidad >= Mesa.CANTIDAD) {
                    Thread.sleep(500);
                    System.out.println("===***=================================****=======");
                    Mesa.tarros++;
                    System.out.println("***Se ha llenado un tarro***");
                    System.out.println("TARROS ACTUALES: " + Mesa.tarros);
                    System.out.println("===***=================================****=======");
                    Mesa.consumo.release();
                    productor.acquire();

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Abeja.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}

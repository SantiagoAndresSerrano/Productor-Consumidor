/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author santi
 */
public class Oso extends Thread {

    static Semaphore consumo = Mesa.consumo;
    JLabel Oso;

    public Oso(JLabel Oso) {
        this.Oso = Oso;
    }

    @Override
    public void run() {
        int aux = 0;
        while (Mesa.tarros < Mesa.TARROS) {

            try {

                if (Mesa.cantidad > 0) {

                    Thread.sleep(800);
                    if (Mesa.tarros == Mesa.TARROS) {

                        this.stop();
                    }

                    moverAlTarro();

                    System.out.println("Consumo miel..." + Mesa.cantidad);

                    Mesa.cantidad--;
                    VistaMesa.cantidadMiel.setText(""+Mesa.cantidad);
                    
                    if (Mesa.cantidad == Mesa.CANTIDAD / 2) { // se comio la mitad
                        VistaMesa.tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_medioLLeno - copia.png")));
                    }
                    Thread.sleep(30);
                    if (Mesa.cantidad == (Mesa.CANTIDAD/2)-1) {
                        VistaMesa.tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_medioLLeno.png")));

                    }
                    
                    if (Mesa.cantidad - 1 == 0) {
                        VistaMesa.tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_vacio.png")));

                    }

                }
                if (Mesa.cantidad == 0) {
                      aux++;
                    VistaMesa.tarrosConsumidos.setText(""+aux);
                    moverAlTronco();
                    System.out.println("===***=================================****=======");
                    System.out.println("Espero a que produzcan tarros de miel...");
                    System.out.println("===***=================================****=======");
                    Thread.sleep(400);

                    while (true) {
                        if (Mesa.cantidad >= (Mesa.CANTIDAD-2)) {
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

    private void moverAlTarro() {
        while (Oso.getX() < VistaMesa.limite.getX()) {
            try {
                Thread.sleep(10);
                Oso.setLocation(Oso.getX() + ((int) (Math.random() * 5)), Oso.getY());
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Oso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void moverAlTronco() {
        while (Oso.getX() > VistaMesa.oso1.getX()) {
            try {
                Thread.sleep(10);
                Oso.setLocation(Oso.getX() - ((int) (Math.random() * 5)), Oso.getY());
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Oso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

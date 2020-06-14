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
public class Abeja extends Thread {

    JLabel abeja;
    int tPosX, tPosY; //Posicion del tarro en "X" y "Y"
    Boolean movimiento = true; //me permite dar movimiento a las abejas
    Semaphore productor = Mesa.produccion;
    int produccion = 1;

    public Abeja(JLabel abeja, int tPosX, int tPosy) {
        this.abeja = abeja;
        this.tPosX = tPosX;
        this.tPosY = tPosy;
    }

    public void movimientoAleatorio() {
        
    while(movimiento){
        
    int posicionXRandom = (int) (Math.random() * abeja.getX());
        int posicionYRandom = (int) (Math.random() * abeja.getY());
        
        abeja.getLocation().y+=posicionYRandom;
        abeja.getLocation().x+=posicionXRandom;
    }    
        
    }
    
    @Override
    public void run() {

        while (Mesa.tarros < Mesa.TARROS) {
            try {
                
                productor.acquire();
                Thread.sleep(500);
                int x = (int)(Math.random()*95);
                int y = (int)(Math.random()*94);
                this.abeja.setLocation(tPosX+x, tPosY+y);
                
               
                
                System.out.println("Abeja " + this.getName()
                        + " produjo= " + produccion + " cantidad de miel"
                );
                Thread.sleep(2000);
                volverAlPanal();
                Mesa.cantidad += produccion;
                VistaMesa.cantidadMiel.setText(""+Mesa.cantidad);
                
                 if(Mesa.cantidad==1){
                  VistaMesa.tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_medioLLeno.png")));
                }
                
                if(Mesa.cantidad==3){
                  VistaMesa.tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_medioLLeno - copia.png")));
                }
                
                if(Mesa.cantidad==Mesa.CANTIDAD){
                    
                  VistaMesa.tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_medioLLeno - copia - copia.png")));
                }
               
                

                if (Mesa.cantidad == Mesa.CANTIDAD) {
                    
                    Thread.sleep(500);
                    System.out.println("===***=================================****=======");
                    Mesa.tarros++; 
                    VistaMesa.tarrosConsumidos1.setText(""+Mesa.tarros);
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
    
    
    
    public void volverAlPanal(){
    
    int aleatorio = (int)(Math.random()*90);
            
            int x=VistaMesa.jLabel3.getX();
            int y=VistaMesa.jLabel3.getY();
            
            abeja.setLocation(x+aleatorio, y+aleatorio);
    }
}

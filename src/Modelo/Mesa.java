/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.concurrent.Semaphore;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author santi
 */
public class Mesa extends Thread {

    static Semaphore produccion = new Semaphore(0, true);
    static Semaphore consumo = new Semaphore(1);
    public JLabel tarro;
    static int CANTIDAD = 20;
    static int TARROS = 5;

    static int cantidad = CANTIDAD;
    static int tarros = 0;

    static Oso oso = new Oso(VistaMesa.oso);
    public static Abeja[] abejas = new Abeja[10];
    JPanel panel;

    public Mesa(JLabel tarro, JPanel panel) {
        this.panel = panel;
        this.tarro = tarro;
    }

    public void nombrarEmpezarAbejas() {
        int i = 0;
        for (Abeja a : abejas) {
            i++;
            ImageIcon abejaIcono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abeja.png"));
            JLabel abeja = new JLabel();

            abeja.setName("");
            abeja.setIcon(abejaIcono);
            abeja.setSize(50, 60);

            int aleatorio = (int) (Math.random() * 90);

            int x = VistaMesa.jLabel3.getX();
            int y = VistaMesa.jLabel3.getY();

            abeja.setLocation(x + aleatorio, y + aleatorio);

            a = new Abeja(abeja, tarro.getX(), tarro.getY());
            a.setName(Integer.toString(i));
            abeja.setVisible(true);
            panel.add(abeja);
            a.start();
        }
    }

    @Override
    public void run() {

        oso.start();
        nombrarEmpezarAbejas();

    }

}

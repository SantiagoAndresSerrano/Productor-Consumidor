/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author santi
 */
public class VistaMesa extends javax.swing.JFrame {
      
    /**
     * Creates new form VistaMesa
     */
    public VistaMesa() {
        
        initComponents();   
        this.jPanel4.setVisible(false);
        setSize(1200, 700);
         Mesa mesa = new Mesa(tarro, this.jPanel1);
        VistaMesa.cantidadMiel.setText(""+mesa.cantidad);
        VistaMesa.tarrosConsumidos.setText(""+mesa.tarros);
        mesa.start();
        this.setLocationRelativeTo(null);

    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abeja = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tarro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        oso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        limite = new javax.swing.JLabel();
        oso1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidadMiel = new javax.swing.JLabel();
        tarrosConsumidos = new javax.swing.JLabel();
        tarrosConsumidos1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        abejas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        miel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tarros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        abeja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abeja.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/560dd0453534c8c3d23ef9f54aca79e0.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, -10, 210, 240);

        tarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarro_medioLLeno - copia - copia.png"))); // NOI18N
        tarro.setText("jLabel5");
        jPanel1.add(tarro);
        tarro.setBounds(410, 0, 260, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 160, 306, 282);

        oso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oso.png"))); // NOI18N
        jPanel1.add(oso);
        oso.setBounds(0, 70, 290, 310);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(830, 140, 50, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tree_Stump_PNG_Clip_Art_Image.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 290, 210, 180);
        jPanel1.add(limite);
        limite.setBounds(270, 200, 10, 120);
        jPanel1.add(oso1);
        oso1.setBounds(-10, 90, 290, 310);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 10, 10);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad Miel:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 40, 150, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Tarros Consumidos por Oso:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 70, 260, 40);

        cantidadMiel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel3.add(cantidadMiel);
        cantidadMiel.setBounds(160, 40, 70, 40);

        tarrosConsumidos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel3.add(tarrosConsumidos);
        tarrosConsumidos.setBounds(270, 80, 70, 20);

        tarrosConsumidos1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel3.add(tarrosConsumidos1);
        tarrosConsumidos1.setBounds(280, 110, 70, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Tarros Producidos por Abejas:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 100, 270, 40);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Informacion:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 10, 160, 32);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(790, 350, 330, 200);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad de Abejas");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 60, 160, 24);
        jPanel4.add(abejas);
        abejas.setBounds(180, 60, 130, 30);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("Cantidad de miel");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 90, 160, 24);
        jPanel4.add(miel);
        miel.setBounds(180, 90, 130, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Cantidad de Tarros");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 120, 160, 24);
        jPanel4.add(tarros);
        tarros.setBounds(180, 120, 130, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(180, 180, 130, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Sistema Abejas");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 10, 190, 32);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 430, 350, 260);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 1170, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                int cantidadAbejas = Integer.parseInt(this.abejas.getText());
        int cantidadM = Integer.parseInt(this.miel.getText());
        int cantidadTarros = Integer.parseInt(this.tarros.getText());

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abeja;
    private javax.swing.JTextField abejas;
    static javax.swing.JLabel cantidadMiel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    static javax.swing.JLabel limite;
    private javax.swing.JTextField miel;
    static javax.swing.JLabel oso;
    static javax.swing.JLabel oso1;
    static javax.swing.JLabel tarro;
    private javax.swing.JTextField tarros;
    static javax.swing.JLabel tarrosConsumidos;
    static javax.swing.JLabel tarrosConsumidos1;
    // End of variables declaration//GEN-END:variables

    private void llevarAlPanal(Abeja[] abejas) {

        for (Abeja a : abejas) {
            int xAleatorio = (int) (Math.random() * 8);
            int yAleatorio = (int) (Math.random() * 4);

//              a.abeja.getLocation().x = this.jLabel3.getX()+xAleatorio;
            //    a.abeja.getLocation().y = this.jLabel3.getY()+yAleatorio;
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocarros;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VistaJugar extends javax.swing.JFrame {

    /**
     * Creates new form VistaJugar
     */
    public VistaJugar() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblMostrarDado.setVisible(false);

    }
    Ingreso ObjIngreso1 = new Ingreso();
    Juego ObjJuego = ObjIngreso1.objJuego;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMostrarDado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LbInfoJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        jButton1.setText("Parar Dado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" Tirar Dado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Rapidos y furiosos");

        lblMostrarDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NumerosDados.gif"))); // NOI18N
        lblMostrarDado.setText(".");

        LbInfoJugador.setBackground(new java.awt.Color(51, 51, 255));
        LbInfoJugador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMostrarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(550, 550, 550))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LbInfoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(441, 441, 441))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(170, 170, 170)
                .addComponent(LbInfoJugador)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblMostrarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(71, 71, 71))
        );

        lblMostrarDado.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int sw = 0;
    static int sw2 = 0;
    static int contadorJugador;
    List<Jugador> ListaJugadores = ObjJuego.getLista();
    int pos;

    int NroJugadores = ListaJugadores.size();
    List Distancias = new LinkedList();
    List<Jugador> ListaGanadores = new ArrayList<Jugador>();
    double Meta = ObjJuego.getObjPista().getDistancia() * 1000;

// Tirar dado

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        generarnumeros objDado = new generarnumeros();

        lblMostrarDado.setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed
    //Parar Dado
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int num1;
        if (sw2 == 0) {
            contadorJugador = 0;
           
            generarnumeros objDado = new generarnumeros();
            pos = contadorJugador;
            num1 = objDado.calcularnumero();
            
            Distancias.add(Calculardistancia(num1));
            
            sw2 = 1;
        } else if (sw2 == 1) {
              if(pos==NroJugadores-1){
                contadorJugador=0;                
            }else{
            contadorJugador = contadorJugador + 1;
              }
            lblMostrarDado.setVisible(false);
            generarnumeros objDado = new generarnumeros();
            pos = contadorJugador;
            num1 = objDado.calcularnumero();
            txtResultado.setText(Float.toString(num1));
            Distancias.add(Calculardistancia(num1));
             JOptionPane.showMessageDialog(null, "tengo" + Distancias.get(pos) + " nro jugado: " + pos);
          
            

        }else
        {
            contadorJugador = contadorJugador + 1;
            lblMostrarDado.setVisible(false);
            generarnumeros objDado = new generarnumeros();
            pos = contadorJugador;
            num1 = objDado.calcularnumero();
            txtResultado.setText(Float.toString(num1));
           
            if(pos==NroJugadores){
                contadorJugador=0;                
            }
            
            
            double ProximaDistancia = (double) Distancias.get(pos) + num1;
            JOptionPane.showMessageDialog(null, "tengo" + ProximaDistancia + " nro jugado: " + pos);
            if (ProximaDistancia >= Meta) {
                ListaGanadores.add(ListaJugadores.get(pos));
                 JOptionPane.showMessageDialog(null, "Gane" + ListaGanadores.get(pos) + " nro jugado: " + pos);
                BuscarGanadores();

            } else {
                Distancias.add(pos, ProximaDistancia);
            }

       
        }

//        AsignarDistancia(sw, Calculardistancia(num1),pos);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

//    public void ComenzarJugar(Juego ObJuego, int NroDado) {
//
//    }
    public double Calculardistancia(int nro) {
        double Distancia = nro * 1000;
        return Distancia;
    }
//    public void AsignarDistancia(int sw, double valor,int pos) {
//        if (sw == 0) {
//              
//            Distancias.add(pos , valor);
//            JOptionPane.showMessageDialog(null, "tengo");
//        } else {
//            //int aux = NroJugador()-1;
//            double ProximaDistancia = (double) Distancias.get(pos) + valor;
//            JOptionPane.showMessageDialog(null, "tengo" + ProximaDistancia + " nro jugado: " + pos);
//            if (ProximaDistancia >= Meta) {
//                ListaGanadores.add(ListaJugadores.get(pos));
//                BuscarGanadores();
//
//            } else {
//                Distancias.add(pos, ProximaDistancia);
//            }
//
//        }
//    }
//    public void NroJugador() {
//        if (contadorJugador == NroJugadores) {
//            contadorJugador = 1;
//            sw = 1;//cambie el sw para saber que tengo empezar a prenguntar si ya gano alguien 
//
//        }
//        return contadorJugador;
//    }
    public void BuscarGanadores() {

    }

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
            java.util.logging.Logger.getLogger(VistaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbInfoJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMostrarDado;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}

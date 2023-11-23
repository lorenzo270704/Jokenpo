/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//arquivo atualizado
package jogo_jokenpo;
//arquivo 

import java.util.Random;


public class JFjokenpo extends javax.swing.JFrame {

       int jogador =0;
       String escolhacomputador = "";
    public JFjokenpo() {
        initComponents();
    
        
        switch(jogador){
            case 1:
                jBpedra.isSelected();
                break;
            
            case 2:
                jBpapel.isSelected();
                break;
                
            case 3:
                jBtesoura.isSelected();
        }
        
        int computador =(int) (Math.random()* 3 + 1);
        
        switch(computador){
            case 1:
                escolhacomputador = "Pedra";
                break;
                
            case 2:
                escolhacomputador = "Papel";
                break;
                
            case 3:
                escolhacomputador ="Tesoura";
                break;
        }
        jLcomput.setText(escolhacomputador);
        
        if (jogador == computador) {
            System.out.println("empate");
        
        } else {
            if((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
                System.out.println("você ganhou");
        } else {
                System.out.println("computador ganhou"); 
                }
    }
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBpedra = new javax.swing.JButton();
        jBpapel = new javax.swing.JButton();
        jBtesoura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLcomput = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jBpedra.setText("Pedra");
        jBpedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpedraActionPerformed(evt);
            }
        });

        jBpapel.setText("Papel");
        jBpapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpapelActionPerformed(evt);
            }
        });

        jBtesoura.setText("Tesoura");
        jBtesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtesouraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wide Latin", 2, 18)); // NOI18N
        jLabel1.setText("JOKENPÔ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jBpedra)
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBpapel)
                            .addComponent(jLcomput, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addComponent(jBtesoura)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLcomput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpedra)
                    .addComponent(jBpapel)
                    .addComponent(jBtesoura))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBpapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpapelActionPerformed
        jogador =2;
    }//GEN-LAST:event_jBpapelActionPerformed

    private void jBpedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpedraActionPerformed
        jogador = 1;
    }//GEN-LAST:event_jBpedraActionPerformed

    private void jBtesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtesouraActionPerformed
        jogador = 3;
    }//GEN-LAST:event_jBtesouraActionPerformed

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
            java.util.logging.Logger.getLogger(JFjokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFjokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFjokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFjokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFjokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBpapel;
    private javax.swing.JButton jBpedra;
    private javax.swing.JButton jBtesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLcomput;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

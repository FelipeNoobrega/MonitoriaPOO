/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.espetaculo;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class shows extends javax.swing.JFrame {
    ArrayList<Espetaculo> espetaculos = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    /**
     * Creates new form shows
     */
    public shows() {
        initComponents();
        diretoNoCodigo();
    }
    
    public void diretoNoCodigo(){
        
        clientes.add(new Cliente("123.321-12", "Felipe","(63) 565456"));
        clientes.add(new Cliente("456.654-65", "Paulo","(63) 321123"));
        clientes.add(new Cliente("789.987-98", "João","(63) 951159"));
        clientes.add(new Cliente("123.159-59", "Pedro","(63) 987789"));
        clientes.add(new Cliente("456.159-95", "Gio","(63) 321159"));
        clientes.add(new Cliente("123.753.75", "Carlos","(63) 123753"));
        clientes.add(new Cliente("456.753.75", "Marco","(63) 456159"));
        clientes.add(new Cliente("789.987.95", "Ana","(63) 456753"));
        
        espetaculos.add(new Espetaculo(1010, "Palmas-taquaralto", "22/04/23", clientes.get(0)));
        espetaculos.add(new Espetaculo(1020, "Palmas-taquari", "13/01/23", clientes.get(4)));
        espetaculos.add(new EspetaculoEspecial(3,1030, "Palmas-centro", "18/04/23", clientes.get(1)));
        espetaculos.add(new EspetaculoEspecial(2, 1040, "Palmas-norte", "23/04/23", clientes.get(2)));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JToggleButton();
        tfTaxaTransporte = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JToggleButton();
        rbEspetaculo = new javax.swing.JRadioButton();
        rbEspetaculoE = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cbxResultados = new javax.swing.JComboBox<>();
        btnFiltro = new javax.swing.JToggleButton();
        tfFiltro = new javax.swing.JTextField();
        btnImprime = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("taxa de transp.");

        btnVer.setText("ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEspetaculo);
        rbEspetaculo.setText("Espetaculo");
        rbEspetaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspetaculoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEspetaculoE);
        rbEspetaculoE.setText("Espetaculo Esp.");

        buttonGroup1.add(rbTodos);
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        cbxResultados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        btnFiltro.setText("Filtrar");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        btnImprime.setText("Imprimir");
        btnImprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimeActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        taSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));
        jScrollPane1.setViewportView(taSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxResultados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFiltro)
                                .addGap(18, 18, 18)
                                .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnImprime))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbTodos)
                                        .addComponent(rbEspetaculoE)
                                        .addComponent(rbEspetaculo)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVer)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfTaxaTransporte)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfTaxaTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVer)
                            .addComponent(btnAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEspetaculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEspetaculoE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltro))
                        .addGap(18, 18, 18)
                        .addComponent(cbxResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprime)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
         taSaida.setText(Espetaculo.getTaxaTransporte()+" R$");
         
        
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       taSaida.setText("");
        if(tfTaxaTransporte.getText().isBlank()){
            taSaida.setText("Preencha o campo para alterar!!");
        }else{
            Espetaculo.setTaxaTransporte(Integer.parseInt(tfTaxaTransporte.getText()));
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbEspetaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspetaculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEspetaculoActionPerformed

    private void btnImprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimeActionPerformed
        taSaida.setText("entrou");
        String codigo1 = (String) cbxResultados.getSelectedItem();
        
        if(codigo1.equalsIgnoreCase("...")){ 
            for (int i = 1; i <= cbxResultados.getItemCount(); i++) {
                String recebeItem = (String) cbxResultados.getItemAt(i);
                int itemViraInt = Integer.parseInt(recebeItem);
                for (Espetaculo e : espetaculos) {
                    if (e.getCod() == itemViraInt) {
                        taSaida.append("Data: " + e.getData() + "\nCliente: " + e.getCliente().getNome()
                                + "\n valor do espetaculo: R$ " + e.valor() + "\n\n");     
                    }   
                }
            }  
        }
        else{
               
            for(Espetaculo e : espetaculos){
                int codigo = Integer.parseInt(cbxResultados.getSelectedItem().toString()) ;
                if(e.getCod() == codigo){
                    taSaida.append("Data: "+e.getData()+"\nCliente: "+e.getCliente().getNome()+"\n valor do espetaculo: R$ "+e.valor()+"\n\n");
                }
                
            }
        }
    }//GEN-LAST:event_btnImprimeActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        
        cbxResultados.removeAllItems();
        
        if(tfFiltro.getText().isBlank()){
            cbxResultados.addItem("...");
            
            if (rbTodos.isSelected()){   
                for(Espetaculo e : espetaculos){
                    cbxResultados.addItem(Integer.toString(e.getCod()));
                }
            }
            else if (rbEspetaculo.isSelected()){
                for(Espetaculo e : espetaculos){
                    if((!(e instanceof EspetaculoEspecial))){
                        cbxResultados.addItem(Integer.toString(e.getCod()));
                    }
                }  
            }
            else {
                for(Espetaculo e : espetaculos){
                     if((e instanceof EspetaculoEspecial)){
                        cbxResultados.addItem(Integer.toString(e.getCod()));
                    }
                }
            }
        }
        else{
            for (Espetaculo e : espetaculos) {
                int filtro = Integer.parseInt(tfFiltro.getText());
                if (e.getCod() == filtro) {
                    cbxResultados.addItem(Integer.toString(e.getCod()));
                }
            }
        }
        
    }//GEN-LAST:event_btnFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(shows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAtualizar;
    private javax.swing.JToggleButton btnFiltro;
    private javax.swing.JButton btnImprime;
    private javax.swing.JToggleButton btnVer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbEspetaculo;
    private javax.swing.JRadioButton rbEspetaculoE;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfFiltro;
    private javax.swing.JTextField tfTaxaTransporte;
    // End of variables declaration//GEN-END:variables
}

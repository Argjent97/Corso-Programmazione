/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestionescuola;

import com.mycompany.gestionescuola.entity.Anagrafica;
import com.mycompany.gestionescuola.entity.Corso;
import com.mycompany.gestionescuola.services.AnagraficaService;
import com.mycompany.gestionescuola.services.CorsoService;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tss
 */
public class WinGestione extends javax.swing.JFrame {

    static List<Corso> listacorsi = new ArrayList<>();
    static List<Anagrafica> listaAnagrafiche = new ArrayList<>();
    AnagraficaService anagraficaService = new AnagraficaService();
    CorsoService corsoService = new CorsoService();
    int idcorso = -1;

    /**
     * Creates new form WinGestione
     */
    public WinGestione() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        listaAnagrafiche = anagraficaService.all();
        listacorsi = corsoService.all();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitolo = new javax.swing.JLabel();
        btnGestioneCorso = new javax.swing.JButton();
        btnGestAnagrafica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCorsi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblTitolo.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Gestione scuola");

        btnGestioneCorso.setText("Gestione Corsi");
        btnGestioneCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioneCorsoActionPerformed(evt);
            }
        });

        btnGestAnagrafica.setText("Anagrafica");
        btnGestAnagrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestAnagraficaActionPerformed(evt);
            }
        });

        tblCorsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Corso", "Durata ore", "Data inizio", "N. Iscritti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCorsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCorsi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGestAnagrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(btnGestioneCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitolo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestioneCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestAnagrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestioneCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneCorsoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnGestioneCorsoActionPerformed

    private void btnGestAnagraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestAnagraficaActionPerformed
        // TODO add your handling code here:
        // apertua finestra dialogo per caricamento e gestione anagrafica
       
    }//GEN-LAST:event_btnGestAnagraficaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        refreshTable();
    }//GEN-LAST:event_formWindowActivated

    private void tblCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCorsiMouseClicked
        // TODO add your handling code here:
        int index = tblCorsi.getSelectedRow();
        JOptionPane.showMessageDialog(null, listacorsi.get(index).getTitolo());
        
    }//GEN-LAST:event_tblCorsiMouseClicked

    private void refreshTable() {
        // recuperare la struttura dati della mia tabella come model
        DefaultTableModel model = (DefaultTableModel) tblCorsi.getModel();
        //pulire la tabella dai dati precedenti settando la dimensione row a 0
        model.setRowCount(0);
        int ncol = model.getColumnCount();
        Object[] rowData = new Object[ncol];
        for (Corso c : listacorsi) {
            //assegno ai 3 elementi dell'array il contenuto equivalente di colona
            rowData[0] = c.getTitolo();
            rowData[1] = c.getDurata();
            DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
            rowData[2] = c.getCreatoIl().format(ddmmaa);
            //rowData[3] = c.getRegistro().size();
            model.addRow(rowData);
        }

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
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGestione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestAnagrafica;
    private javax.swing.JButton btnGestioneCorso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JTable tblCorsi;
    // End of variables declaration//GEN-END:variables

}

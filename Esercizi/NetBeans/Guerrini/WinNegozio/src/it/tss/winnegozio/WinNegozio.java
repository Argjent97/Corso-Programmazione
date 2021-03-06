/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.tss.winnegozio;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tss
 */
public class WinNegozio extends javax.swing.JFrame {

    static ArrayList<Prodotto> listaprodotti = new ArrayList<>();
    static ArrayList<Vendita> listavendite = new ArrayList<>();
    static int index;

    /**
     * Creates new form WinNegozio
     */
    public WinNegozio() {
        initComponents();
        this.setLocationRelativeTo(null);
        caricaProdotti();
        refreshTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdotti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnGestioneProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblTitolo.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Negozio");

        tblProdotti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Prezzo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdotti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdottiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProdotti);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elenco prodotti");

        btnGestioneProd.setText("Gestione Prodotto");
        btnGestioneProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioneProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnGestioneProd, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestioneProd)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestioneProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneProdActionPerformed
        // TODO add your handling code here:
        new WinDialogGestioneProdotto(this, true).setVisible(true);
    }//GEN-LAST:event_btnGestioneProdActionPerformed

    private void tblProdottiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdottiMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()== 2){
        index = tblProdotti.getSelectedRow();
        new WinDialogSells(this, true).setVisible(true);
        }
    }//GEN-LAST:event_tblProdottiMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(WinNegozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinNegozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinNegozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinNegozio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinNegozio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestioneProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JTable tblProdotti;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {

        DefaultTableModel model = (DefaultTableModel) tblProdotti.getModel();
        model.setRowCount(0);
        int ncol = model.getColumnCount();
        Object[] rowData = new Object[ncol];
        for (Prodotto pr : listaprodotti) {
            //assegno ai 3 elementi dell'array il contenuto equivalente di colona
            rowData[0] = pr.getIdprod();
            rowData[1] = pr.getNomeprod();
            rowData[2] = pr.getPrezzo();
            model.addRow(rowData);
        }

    }

    private void caricaProdotti() {
        try {
            //aprire il file /tss/Scuola/dati.csv
            File filecsv = new File("/home/tss/Negozio/prodotti.csv");
            //creo scanner per leggere una riga per volta
            Scanner lettore = new Scanner(filecsv);
            //estrarre una riga per volta
            boolean primariga = true;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (!primariga) {
                    String[] dati = riga.split(";");
                    int id = Integer.parseInt(dati[0]);
                    String np = dati[1];
                    float cost = Float.parseFloat(dati[2]);
                    Prodotto pr = new Prodotto(id, np, cost);
                    WinNegozio.listaprodotti.add(pr);
                }
                primariga = false;
            }

        } catch (Exception e) {

        }

    }
}

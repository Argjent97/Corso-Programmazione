/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.gestionescuola;

import static com.mycompany.gestionescuola.WinGestione.listacorsi;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class WinDialogCorso extends javax.swing.JDialog {

    /**
     * Creates new form WinDialogCorsi
     */
    public WinDialogCorso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        refreshLista();
        refreshListaA();
        spDurata.setValue(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txDescrizione = new javax.swing.JTextArea();
        spDurata = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTitolo = new javax.swing.JLabel();
        btnPrepNewCorso = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCorsi = new javax.swing.JList<>();
        txDataInizio = new javax.swing.JFormattedTextField();
        txLinkCorso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreaCorso = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txNomeCorso = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstRegistro = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAnagrafica = new javax.swing.JList<>();
        btnIscrivi = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txDescrizione.setColumns(20);
        txDescrizione.setRows(5);
        jScrollPane1.setViewportView(txDescrizione);

        spDurata.setRequestFocusEnabled(false);
        spDurata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spDurataKeyReleased(evt);
            }
        });

        jLabel3.setText("Durata ore:");

        jLabel4.setText("Data inizio:");

        lblTitolo.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Gestione Corso");

        btnPrepNewCorso.setText("Crea nuovo corso");
        btnPrepNewCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepNewCorsoActionPerformed(evt);
            }
        });

        lstCorsi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCorsi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCorsiValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstCorsi);

        txDataInizio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txDataInizio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txDataInizioKeyReleased(evt);
            }
        });

        jLabel5.setText("Link corso:");

        btnCreaCorso.setText("Conferma dati");
        btnCreaCorso.setEnabled(false);
        btnCreaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaCorsoActionPerformed(evt);
            }
        });

        lblMsg.setForeground(java.awt.Color.red);

        jLabel6.setText("es. 31/01/22");

        jLabel1.setText("Nome Corso:");

        jLabel2.setText("Descrizione:");

        jLabel7.setText("Lista corsi");

        txNomeCorso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomeCorsoKeyReleased(evt);
            }
        });

        btnClose.setText("Chiudi");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lstRegistro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstRegistro);

        lstAnagrafica.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstAnagrafica);

        btnIscrivi.setText("Iscrivi");
        btnIscrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIscriviActionPerformed(evt);
            }
        });

        btnRemove.setText("Elimina Corso");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnPrepNewCorso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreaCorso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(19, 19, 19)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txLinkCorso)
                            .addComponent(txNomeCorso)
                            .addComponent(jScrollPane1)
                            .addComponent(spDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNomeCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spDurata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txLinkCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreaCorso)
                            .addComponent(btnPrepNewCorso)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIscrivi)
                    .addComponent(btnClose))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spDurataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spDurataKeyReleased
        // TODO add your handling code here:
        btnCreaCorso.setEnabled(validaCorso());
    }//GEN-LAST:event_spDurataKeyReleased

    private void btnPrepNewCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepNewCorsoActionPerformed
        // semplicemente pulisco tutti i campi
        lblMsg.setText("Inserisci i dati del corso");
        txNomeCorso.setText("");
        txDescrizione.setText("");
        txDataInizio.setText("");
        txLinkCorso.setText("");
        spDurata.setValue(1);
        btnCreaCorso.setEnabled(false);
        lstCorsi.clearSelection();
    }//GEN-LAST:event_btnPrepNewCorsoActionPerformed

    private void lstCorsiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCorsiValueChanged
        // TODO add your handling code here:
        int index = lstCorsi.getSelectedIndex();

        btnCreaCorso.setEnabled(false);
        Corso c = WinGestione.listacorsi.get(index);
        lblMsg.setText("Corso selezionato correttamente!");
        txNomeCorso.setText(c.getNomecorso());
        txDescrizione.setText(c.getDescrizione());
        //data complicata
        DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataok = c.getDatainizio().format(ddmmaa);

        txDataInizio.setText(dataok);
        txLinkCorso.setText(c.getLink());
        spDurata.setValue(c.getDurataore());
        btnCreaCorso.setEnabled(validaCorso());
        refreshListRegistro();
    }//GEN-LAST:event_lstCorsiValueChanged

    private void txDataInizioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDataInizioKeyReleased
        // TODO add your handling code here:
        btnCreaCorso.setEnabled(validaCorso());
    }//GEN-LAST:event_txDataInizioKeyReleased

    private void btnCreaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaCorsoActionPerformed
        // TODO add your handling code here:
        //Recuperiamo i dati da interfaccia
        String nc = txNomeCorso.getText();
        String des = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int y = Integer.parseInt(ardata[2]) + 2000;
        String link = txLinkCorso.getText();
        int durata = (int) spDurata.getValue();
        Corso newcorso = new Corso(nc, durata, y, m, d);
        newcorso.setDescrizione(des);
        newcorso.setLink(link);
        if (lstCorsi.getSelectedIndex() == -1) { //nessuna selezione, non sono in modifica
            WinGestione.listacorsi.add(newcorso);
            lblMsg.setText("Corso creato correttamente!");
        } else { //lista selezionata sono in modifica dell'iesimo elemento
            WinGestione.listacorsi.set(lstCorsi.getSelectedIndex(), newcorso);
            lblMsg.setText("Corso aggiornato correttamente!");
        }
        txNomeCorso.setText("");
        txDescrizione.setText("");
        txDataInizio.setText("");
        txLinkCorso.setText("");
        spDurata.setValue(1);
        lstCorsi.setSelectedIndex(-1);
        refreshLista();
        //mostra elenco aggiornato in display di listacorsi
        salvaCorsi();
        salvaCorsiCSV();
        validaCorso();
    }//GEN-LAST:event_btnCreaCorsoActionPerformed

    private void txNomeCorsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeCorsoKeyReleased
        // TODO add your handling code here:
        btnCreaCorso.setEnabled(validaCorso());
    }//GEN-LAST:event_txNomeCorsoKeyReleased

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnIscriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIscriviActionPerformed
        // TODO add your handling code here:
        int indexA = lstAnagrafica.getSelectedIndex();
        if (indexA == -1) {
            return;
        }
        int indexC = lstCorsi.getSelectedIndex();
        if (indexC == -1) {
            return;
        }

        Anagrafica daIscrivere = WinGestione.listaAnagrafiche.get(indexA);
        boolean ok = WinGestione.listacorsi.get(indexC).insertAlunno(daIscrivere);
        if (!ok) {
            JOptionPane.showMessageDialog(null, "Utente gi?? presente");
        } else {
            refreshListRegistro();
            salvaCorsiCSV();
        }

    }//GEN-LAST:event_btnIscriviActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int index = lstCorsi.getSelectedIndex();
        if (index == -1) { //niente di selezionato
            return;
        }
        int input = JOptionPane.showConfirmDialog(null,
                "Confermi l'eliminazione?", "ELIMINA Anagrafica", JOptionPane.OK_CANCEL_OPTION);
        if (input == 0) {
            WinGestione.listacorsi.remove(index);
            salvaCorsiCSV();
            refreshLista();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinDialogCorso dialog = new WinDialogCorso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreaCorso;
    private javax.swing.JButton btnIscrivi;
    private javax.swing.JButton btnPrepNewCorso;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JList<String> lstAnagrafica;
    private javax.swing.JList<String> lstCorsi;
    private javax.swing.JList<String> lstRegistro;
    private javax.swing.JSpinner spDurata;
    private javax.swing.JFormattedTextField txDataInizio;
    private javax.swing.JTextArea txDescrizione;
    private javax.swing.JTextField txLinkCorso;
    private javax.swing.JTextField txNomeCorso;
    // End of variables declaration//GEN-END:variables
    private boolean validaCorso() {
        boolean ret = false;
        int val = (int) spDurata.getValue();
        boolean okNome = !txNomeCorso.getText().equals("");
        boolean okData = !txDataInizio.getText().equals("");
        boolean okValore = (val > 0);
        if (okNome && okData && okValore) {
            ret = true;
        }
        return ret;
    }

    private void salvaCorsi() {
        // recupero un corso per volta
        // estraggo info tipo String
        // aggiungo info a un testo generico che poi setto in display
        String testoDisplay = "";
        for (int i = 0; i < WinGestione.listacorsi.size(); i++) {
            // recupero un corso per volta
            Corso c = WinGestione.listacorsi.get(i); //get(i) sarebbe listacorsi[i] in un array normale;
            String info = c.getInfo();
            testoDisplay += info;
        }
        try {
            // creo file corsi.txt
            FileWriter myWriter = new FileWriter("/home/tss/Scuola/corsi.txt");
            myWriter.write(testoDisplay);
            // ci scrivo dentro testoDisplay
            // lo chiudo se no si blocca
            myWriter.close();
        } catch (Exception e) {
            lblMsg.setText("Errore di scrittura file corsi.txt");
        }
    }

    private void salvaCorsiCSV() {
        // recupero un corso per volta
        // estraggo info tipo String
        // aggiungo info a un testo generico che poi setto in display
        String testoDisplay = "nomeccorso;durata;descrizione;datainizio;link; lista id alunni\n";
        for (int i = 0; i < listacorsi.size(); i++) {
            // recupero un corso per volta
            Corso c = listacorsi.get(i); //get(i) sarebbe listacorsi[i] in un array normale;
            String info = c.getCSVInfo();
            testoDisplay += info;
        }
        try {
            // creo file corsi.txt
            FileWriter myWriter = new FileWriter("/home/tss/Scuola/corsi.csv");
            myWriter.write(testoDisplay);
            // ci scrivo dentro testoDisplay
            // lo chiudo se no si blocca
            myWriter.close();
        } catch (Exception e) {
            lblMsg.setText("Errore di scrittura file corsi.csv");
        }
    }

    private void refreshLista() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < WinGestione.listacorsi.size(); i++) {
            String nc = WinGestione.listacorsi.get(i).getNomecorso();
            model.addElement(nc);
        }
        lstCorsi.setModel(model);
    }

    private void refreshListaA() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < WinGestione.listaAnagrafiche.size(); i++) {
            Anagrafica al = WinGestione.listaAnagrafiche.get(i);
            String nc = al.getId_anagrafica() + ") "
                    + al.getCognome() + " " + al.getNome();
            model.addElement(nc);
        }
        lstAnagrafica.setModel(model);
    }

    private void refreshListRegistro() {
        int idxcorso = lstCorsi.getSelectedIndex();
        if (idxcorso == -1) {
            return;
        }

        Corso c = WinGestione.listacorsi.get(idxcorso);

        DefaultListModel model = new DefaultListModel();
        for (Anagrafica al : c.getRegistro()) {
            String nc = al.getCognome() + " " + al.getNome();
            model.addElement(nc);
        }
        lstRegistro.setModel(model);
    }



}





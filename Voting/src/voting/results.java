package voting;

import javax.swing.table.DefaultTableModel;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;

public class results extends javax.swing.JDialog {
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    public results(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);   
        initComponents();
        model1 = (DefaultTableModel) jTable1.getModel();
        model2 = (DefaultTableModel) jTable2.getModel();
        model3 = (DefaultTableModel) jTable3.getModel();
        model4 = (DefaultTableModel) jTable4.getModel();
        loadvoterschair();
        loadvoterstrea();
        loadvoterssec();
        loadvotekagawad();
    }
    private void loadvoterschair(){
        model1.setRowCount(0);
        String[] candidatesvote = {
            "voter/Carlos.txt", "voter/Maria.txt"};
        List<String[]> data = new ArrayList<>();
        for(String filename : candidatesvote){
            try{
                if (!Files.exists(Paths.get(filename))) continue;
                
                String line = Files.readString(Paths.get(filename)).trim();
                if(line.isEmpty()) continue;
                
                String[] data1 = line.split(",");
                if (data1.length == 2){
                    String name = data1[0].trim();
                    int votes = Integer.parseInt(data1[1].trim());
                    
                    data.add(new String[]{name, String.valueOf(votes)});
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        data.sort((a,b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        for(String[] datass : data){
            model1.addRow(datass);
        }
    }
    private void loadvoterstrea(){
        model2.setRowCount(0);
        String[] candidatesvote = {
            "voter/Mark.txt", "voter/Romeo.txt"};
        List<String[]> data = new ArrayList<>();
        for(String filename : candidatesvote){
            try{
                if (!Files.exists(Paths.get(filename))) continue;
                
                String line = Files.readString(Paths.get(filename)).trim();
                if(line.isEmpty()) continue;
                
                String[] data1 = line.split(",");
                if (data1.length == 2){
                    String name = data1[0].trim();
                    int votes = Integer.parseInt(data1[1].trim());
                    
                    data.add(new String[]{name, String.valueOf(votes)});
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        data.sort((a,b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        for(String[] datass : data){
            model2.addRow(datass);
        }
    }
    private void loadvoterssec(){
        model3.setRowCount(0);
        String[] candidatesvote = {
            "voter/Kristine.txt", "voter/Michaela.txt"};
        List<String[]> data = new ArrayList<>();
        for(String filename : candidatesvote){
            try{
                if (!Files.exists(Paths.get(filename))) continue;
                
                String line = Files.readString(Paths.get(filename)).trim();
                if(line.isEmpty()) continue;
                
                String[] data1 = line.split(",");
                if (data1.length == 2){
                    String name = data1[0].trim();
                    int votes = Integer.parseInt(data1[1].trim());
                    
                    data.add(new String[]{name, String.valueOf(votes)});
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        data.sort((a,b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        for(String[] datass : data){
            model3.addRow(datass);
        }
    }
    private void loadvotekagawad(){
        model4.setRowCount(0);
        String[] candidatesvote = {
            "voter/Miguel.txt", "voter/Jomar.txt", "voter/Paulo.txt", "voter/Rina.txt", "voter/Gabriel.txt", "voter/Marco.txt", 
            "voter/Daniela.txt", "voter/Patricia.txt", "voter/Rafael.txt", "voter/Liza.txt", "voter/Jericho.txt", "voter/Leah.txt", "voter/Althea.txt", "voter/Carlo.txt"};
        List<String[]> data = new ArrayList<>();
        for(String filename : candidatesvote){
            try{
                if (!Files.exists(Paths.get(filename))) continue;
                
                String line = Files.readString(Paths.get(filename)).trim();
                if(line.isEmpty()) continue;
                
                String[] data1 = line.split(",");
                if (data1.length == 2){
                    String name = data1[0].trim();
                    int votes = Integer.parseInt(data1[1].trim());
                    
                    data.add(new String[]{name, String.valueOf(votes)});
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        data.sort((a,b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        for(String[] datass : data){
            model4.addRow(datass);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Vote"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(350);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(350);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(350);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("for Chairperson");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("for Treasurer");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Vote"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(350);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(350);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(350);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("for Secretary");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Vote"
            }
        ));
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(350);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(350);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(350);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("for Kagawad");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Vote"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(350);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(350);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(350);
        }

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\anime dl\\anime\\New folder\\Voting-main\\Voting\\image_2025-11-24_220753951-removebg-preview (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jButton1)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
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
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                results dialog = new results(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static datastructureassignment2.DataStructureAssignment20.searchh;
/**
 *
 * @author DELL
 */
public class Frame_SearchSpecification extends javax.swing.JFrame {

    String deviceID;
    String processor;
    String ram;
    String os;
    String version;

    public Frame_SearchSpecification() {
        initComponents();
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
        computertbl = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        showbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spectxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        computertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Computer Laboratory", "Computer ID", "Processor", "RAM", "Operating System"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        computertbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(computertbl);

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel6.setText("Search Specification");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel5.setText("Lab&Computer Searching Engine");

        showbtn.setText("Show");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Specification");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6)))
                .addGap(413, 413, 413))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(spectxt, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                    .addComponent(backbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spectxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Frame_Student fc = new Frame_Student();
        fc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        long startTime = System.nanoTime();

        int flagg = 0;
        String data = spectxt.getText();
        String str = searchh.search(data);
        String count = searchh.count(data);

        long stopTime = System.nanoTime();
        long totalTime = stopTime - startTime;

        try {
            for (int a = 0; a < Integer.parseInt(count); a++) {
                String[] labbs = str.split(",");

                String roomID = labbs[4 + a * 8];
                deviceID = labbs[0 + a * 8];
                processor = labbs[1 + a * 8];
                ram = labbs[2 + a * 8];
                os = labbs[3 + a * 8];
                if (data.matches(processor) || data.matches(ram) || data.matches(os)) { //correct spec
                    flagg = 1;
                    break;
                } else if (specialChar(data)) { //special char
                    flagg = 3;
                    break;
                } else {
                    flagg = 2;
                }

            }

            switch (flagg) {
                case 1:
                    showTable(data);
                    JOptionPane.showMessageDialog(null, totalTime + " nano second", "Run time", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    boolean empty = isEmpty(spectxt.getText());
                    if (empty == true) { //false
                        JOptionPane.showMessageDialog(null, "Please key in the Specification", "Please try again", JOptionPane.ERROR_MESSAGE);
                        rst();
                    } else { //blank
                        JOptionPane.showMessageDialog(null, "The Specification does not exist", "Please try again", JOptionPane.ERROR_MESSAGE);
                        rst();
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Search cannot contain special characters", "Please try again", JOptionPane.ERROR_MESSAGE);
                    rst();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Please key in the Specification", "Please try again", JOptionPane.ERROR_MESSAGE);
                    rst();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_showbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_SearchSpecification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_SearchSpecification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_SearchSpecification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_SearchSpecification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_SearchSpecification().setVisible(true);
            }
        });
    }

    public void showTable(String data) {
        DefaultTableModel table = new DefaultTableModel(new String[]{"Computer Laboratory", "Computer ID", "Processor", "RAM", "Operating System"}, 0);
        computertbl.setModel(table);
        String str = searchh.search(data);
        String count = searchh.count(data);
        try {
            for (int a = 0; a < Integer.parseInt(count); a++) {
                //System.out.println("Str: " + str);
                String[] labbs = str.split(",");
                String roomID = labbs[4 + a * 8];
                deviceID = labbs[0 + a * 8];
                processor = labbs[1 + a * 8];
                ram = labbs[2 + a * 8];
                os = labbs[3 + a * 8];
                if (data.matches(processor) || data.matches(ram) || data.matches(os)) {
                    for (int i = 0; i < str.length(); i++) {
                        Object[] row = new Object[5];
                        row[0] = roomID;
                        row[1] = deviceID;
                        row[2] = processor;
                        row[3] = ram;
                        row[4] = os;
                        table.addRow(row);
                        break;
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        JOptionPane.showMessageDialog(null, computertbl.getRowCount() + " results found!");

    }

    public void rst() {
        spectxt = null;
        DefaultTableModel dm = (DefaultTableModel) computertbl.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

    }

    public static boolean specialChar(String input) {
        boolean special;
        Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
        if (regex.matcher(input).find()) {
            special = true;
        } else {
            return false;
        }
        return special;
    }

    public boolean isEmpty(String input) {
        int c;
        c = input.length();
        boolean empty;
        if (c == 0) {
            empty = true;
        } else {
            return false;
        }
        return empty;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTable computertbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showbtn;
    private javax.swing.JTextField spectxt;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureassignment2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Frame_addSoftware extends javax.swing.JFrame {

    public static software_node_list<software> software_list = new software_node_linked_list();
    public static ListtADT<software> softList = new Check<software>();
    public static software softffff = new software();

    /**
     * Creates new form Frame_addSoftware
     */
    public Frame_addSoftware() {
        initComponents();

        softList.add(new software("Cisco", "B101", "B", "1", "1001"));
        softList.add(new software("Cisco", "B203", "B", "2", "1002"));

        softList.add(new software("DreamViewer", "B203", "B", "2", "1003"));
        softList.add(new software("DreamViewer", "B204", "B", "2", "1004"));

        softList.add(new software("Netbeans", "D303", "B", "3", "1005"));
        softList.add(new software("Netbeans", "D304", "B", "3", "1006"));
        
        software_list.add_software(new software("Cisco", "B101", "B", "1", "1001"));
        software_list.add_software(new software("Cisco", "B203", "B", "2", "1002"));

        software_list.add_software(new software("DreamViewer", "B203", "B", "2", "1003"));
        software_list.add_software(new software("DreamViewer", "B204", "B", "2", "1004"));

        software_list.add_software(new software("Netbeans", "D303", "B", "3", "1005"));
        software_list.add_software(new software("Netbeans", "D304", "B", "3", "1006"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addbtn1 = new javax.swing.JButton();
        block = new javax.swing.JTextField();
        levelllllllllllll = new javax.swing.JLabel();
        level = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        software = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comID = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shwbtn = new javax.swing.JButton();
        labID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addbtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addbtn1.setText("Clear");
        addbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn1ActionPerformed(evt);
            }
        });

        levelllllllllllll.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        levelllllllllllll.setText("Level");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Software");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Computer ID");

        addbtn.setText("Add Software");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Lab ID");

        shwbtn.setText("Search Software");
        shwbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shwbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel5.setText("Lab&Computer Searching Engine");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Block");

        jButton1.setText("Delete All DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addbtn2.setText("Back");
        addbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(levelllllllllllll)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(105, 105, 105)
                            .addComponent(comID))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(137, 137, 137)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(software, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(labID)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addbtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 1, Short.MAX_VALUE)
                                    .addComponent(shwbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(addbtn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(166, 166, 166)
                        .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(software, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelllllllllllll)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shwbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn1ActionPerformed
        rst();
    }//GEN-LAST:event_addbtn1ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed

        int flagg;
        boolean intttt = isInteger(block.getText());
        boolean intttttt = isInteger(software.getText());
        if (specialChar(labID.getText()) && specialChar(block.getText()) && specialChar(level.getText()) && specialChar(software.getText()) && specialChar(comID.getText())) { //special char
            flagg = 3;
        } else if (intttt && intttttt) { //integer
            flagg = 4;
        } else if (software.getText().equals(softffff.getSoftwareName()) && block.getText().equals(softffff.getBlock()) && level.getText().equals(softffff.getLevel()) && labID.getText().equals(softffff.getLabid()) && comID.getText().equals(softffff.getComid())) {
            flagg = 5;
        } else {
            flagg = 2;
        }

        switch (flagg) {
            case 2:
                int count = inputNum(labID.getText());
                int count1 = inputNum(block.getText());
                int count2 = inputNum(level.getText());
                int count3 = inputNum(software.getText());
                int count4 = inputNum(comID.getText());
                if (count == 0 || count1 == 0 || count2 == 0 || count3 == 0 || count4 == 0) {
                    //blank
                    JOptionPane.showMessageDialog(null, "There is some text field empty!", "Please try again", JOptionPane.ERROR_MESSAGE);
                    rst();
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Input cannot contain special characters", "Please try again", JOptionPane.ERROR_MESSAGE);
                rst();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Input cannot be Integer", "Please try again", JOptionPane.ERROR_MESSAGE);
                rst();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "You enter a same software with a same lab", "Please try again", JOptionPane.ERROR_MESSAGE);
                rst();
            default:
                break;
        }

        String labid = labID.getText();
        String blockk = block.getText();
        String levell = level.getText();
        String Softwaree = software.getText();
        String ComputerID = comID.getText();

        software_list.add_software(new software(Softwaree, labid, blockk, levell, ComputerID));
        softList.add(new software(Softwaree, labid, blockk, levell, ComputerID));
        JOptionPane.showMessageDialog(null, "Enter Successful !", "Successful enter a software", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addbtnActionPerformed

    private void shwbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shwbtnActionPerformed
        Frame_SearchSoftware fl = new Frame_SearchSoftware();
        fl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_shwbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        software_list.clear_software();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn2ActionPerformed
        Frame_Admin fa = new Frame_Admin();
        fa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addbtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_addSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_addSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_addSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_addSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_addSoftware().setVisible(true);
            }
        });
    }

    private void rst() {
        labID.setText("");
        block.setText("");
        level.setText("");
        software.setText("");
        comID.setText("");
    }

    public static boolean specialChar(String input) {
        boolean special = false;
        Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
        if (regex.matcher(input).find()) {
            special = true;
        } else {
            return false;
        }
        return special;
    }

    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try {
            Integer.parseInt(s);
            // s is a valid integer
            isValidInteger = true;
        } catch (NumberFormatException ex) {
            // s is not an integer
        }
        return isValidInteger;
    }

    public int inputNum(String input) {
        int count;
        count = input.length();
        return count;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addbtn1;
    private javax.swing.JButton addbtn2;
    private javax.swing.JTextField block;
    private javax.swing.JTextField comID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField labID;
    private javax.swing.JTextField level;
    private javax.swing.JLabel levelllllllllllll;
    private javax.swing.JButton shwbtn;
    private javax.swing.JTextField software;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elle.ellegui;

import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.util.*;
import java.util.ArrayList;
import java.awt.event.*;

import java.io.IOException;
import java.io.*;
import java.io.BufferedReader;

/**
 *
 * @author Louis W.
 */
public class LoginWindow extends javax.swing.JFrame {

    public LoginWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Log in");
//        jNewDB.setVisible(false);
        loadList();    // did not find suitable event
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        jUsername.requestFocusInWindow();
    }

    public LoginWindow(GUI a) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Log in");
//        jNewDB.setVisible(false);
        gui = a;
        loadList();    // did not find suitable event
        this.setVisible(true);
        jUsername.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jInputPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jServer = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDatabase = new javax.swing.JComboBox();
        jButtonPanel = new javax.swing.JPanel();
        jCancelButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jEditDB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please input your username and password to log in.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jTextPanelLayout = new javax.swing.GroupLayout(jTextPanel);
        jTextPanel.setLayout(jTextPanelLayout);
        jTextPanelLayout.setHorizontalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jTextPanelLayout.setVerticalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("Server");

        jServer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AWS", "Local" }));
        jServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jServerActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPassword.setText("DanielaMaria$$$$");
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });

        jUsername.setText("Daniela");

        jLabel5.setText("Database");

        jDatabase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dummy", "Elle2015" }));
        jDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatabaseActionPerformed(evt);
            }
        });

        jCancelButton.setText("Cancel/ Log off");
        jCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButtonPanelLayout = new javax.swing.GroupLayout(jButtonPanel);
        jButtonPanel.setLayout(jButtonPanelLayout);
        jButtonPanelLayout.setHorizontalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jButtonPanelLayout.setVerticalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(jCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jEditDB.setText("Edit");
        jEditDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInputPanelLayout = new javax.swing.GroupLayout(jInputPanel);
        jInputPanel.setLayout(jInputPanelLayout);
        jInputPanelLayout.setHorizontalGroup(
            jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInputPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInputPanelLayout.createSequentialGroup()
                        .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword)
                            .addComponent(jUsername)))
                    .addGroup(jInputPanelLayout.createSequentialGroup()
                        .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jServer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDatabase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditDB)
                .addContainerGap())
            .addComponent(jButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInputPanelLayout.setVerticalGroup(
            jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditDB))
                .addGap(18, 18, 18)
                .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(jInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonActionPerformed

        dispose();
    }//GEN-LAST:event_jCancelButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
        dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatabaseActionPerformed
//        String selectedDB = jDatabase.getSelectedItem().toString();
//        String newItem;
//        
//        if (selectedDB.equals("Add New Database")) {
////            newItem = jDatabase.getEditor().getItem().toString();   // figure out how to use getEditor()
////            jDatabase.setVisible(false);
//            jNewDB.setVisible(true);
//
//        }

    }//GEN-LAST:event_jDatabaseActionPerformed

    private void jServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jServerActionPerformed
//        loadList();
    }//GEN-LAST:event_jServerActionPerformed

    private void jEditDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditDBActionPerformed
        new EditDatabaseList(this).setVisible(true);
    }//GEN-LAST:event_jEditDBActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    public void loadList() {

        String temp;
        List<String> dbList = new ArrayList<String>();
        String dbFile = "database.txt";
        boolean hasContent = false; // has a local text file and the file has contents

        // Read text file of databases' names
        BufferedReader buf = null;
        try {
            buf = new BufferedReader(new FileReader(dbFile));
            while ((temp = buf.readLine()) != null) {
                if (!temp.equals("")) {   // remove extra lines
                    dbList.add(temp);
                    hasContent = true;
                }

            }
            if (!hasContent) {

            } else {
                String[] arr = dbList.toArray(new String[dbList.size()]);
                jDatabase.setModel(new DefaultComboBoxModel(arr));
            }
        } catch (Exception e) {

        } finally {
            if (buf != null) {
                try {
                    buf.close();
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }

    }

    public void login() {
        String selectedServer = jServer.getSelectedItem().toString();
        String server, db, str1, str2, str3, str4;
        char[] pw;
//        String dbFile = "AWS.txt";

        // load url for server
        if (selectedServer.equals("AWS")) {
            server = "jdbc:mysql://elle.csndtbcukajz.us-west-2.rds.amazonaws.com:3306/";
        } else if (selectedServer.equals("Local")) {
            server = "jdbc:mysql://localhost:3306/";
        } else {
            server = null;
        }

        // load database name
        db = jDatabase.getSelectedItem().toString();
        info.setUsername(jUsername.getText());
        info.setPassword(String.valueOf(jPassword.getPassword()));

        switch (selectedServer) {
            case "AWS":
                switch (db) {
                    case "Elle2015":
                        info.setURL(server + "Elle2014dev");    // <--
                        GUI.aws = info;

                        GUI.aws.setIconAddr("Images/imag_11.png");
                        gui.registerServer(GUI.aws);
                        break;
                    case "dummy":
                        info.setURL(server + db);
                        GUI.dummy = info;

                        GUI.dummy.setIconAddr("Images/imag_11.png");
                        gui.registerServer(GUI.dummy);
                        break;
                }
                break;
            case "Local":
                info.setURL(server + db);
                GUI.local = info;

                GUI.local.setIconAddr("Images/imag_10.png");
                gui.registerServer(GUI.local);
                break;
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        dispose();

    }

    public LogWindow logwind = new LogWindow();
    private GUI gui = new GUI();
    private LoginInfo info = new LoginInfo();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jButtonPanel;
    private javax.swing.JButton jCancelButton;
    private javax.swing.JComboBox jDatabase;
    private javax.swing.JButton jEditDB;
    private javax.swing.JPanel jInputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JComboBox jServer;
    private javax.swing.JPanel jTextPanel;
    private javax.swing.JTextField jUsername;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}

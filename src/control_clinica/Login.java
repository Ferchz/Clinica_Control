/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control_clinica;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        txtUser.setOpaque(false);
        txtPass.setOpaque(false);
    }
public Connection conectar(){
    
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_clinica","root","Emperador5732");
        }catch (SQLException e){
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrió un error");
        }
        return con;                                                                                                                                            
    }
   
    public void ingresar(){
        Connection con1 = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String user = txtUser.getText();
        String pass = txtPass.getText();
        
         if (user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(this, "Uno o mas campos están vacios, favor de completar");
        }else{
            try{               
               con1 = conectar();
               pst = con1.prepareStatement("select username, pass from usuarios where username='"+user+"' and pass ='"+pass+"'");
               rs = pst.executeQuery();      
               if (rs.next()){
                   this.dispose();
                   new Container().setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(this, "Credenciales incorrectas, intenat de nuevo");
               }
            }catch (SQLException e){
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nFavor comunicarse con el adminisrador.");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new control_clinica.PanelRound();
        panelRound2 = new control_clinica.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new control_clinica.TextField();
        txtPass = new control_clinica.PasswordField();
        btnIngresar = new control_clinica.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(20, 36, 57));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(237, 245, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(44, 88, 145));
        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setText("Login");
        jLabel1.setToolTipText("");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 21, 69, -1));

        txtUser.setBackground(new java.awt.Color(237, 245, 255));
        txtUser.setLabelText("Usuario");
        panelRound2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 270, -1));

        txtPass.setBackground(new java.awt.Color(237, 245, 255));
        txtPass.setLabelText("Contraseña");
        panelRound2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 270, -1));

        btnIngresar.setBackground(new java.awt.Color(61, 130, 219));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setRoundBottomLeft(20);
        btnIngresar.setRoundBottomRight(20);
        btnIngresar.setRoundTopLeft(20);
        btnIngresar.setRoundTopRight(20);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Iniciar");
        btnIngresar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelRound2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 100, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 36, 57));
        jLabel7.setText("-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        panelRound2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 36, 57));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 380, 370));

        jLabel2.setBackground(new java.awt.Color(44, 88, 145));
        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 245, 255));
        jLabel2.setText("ANGELA DEL ROSARIO");
        jLabel2.setToolTipText("");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));

        jLabel3.setBackground(new java.awt.Color(44, 88, 145));
        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 245, 255));
        jLabel3.setText("CLINICA MEDICA");
        jLabel3.setToolTipText("");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Doc_100.png"))); // NOI18N
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        ingresar();
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private control_clinica.PanelRound btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private control_clinica.PanelRound panelRound1;
    private control_clinica.PanelRound panelRound2;
    private control_clinica.PasswordField txtPass;
    private control_clinica.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}

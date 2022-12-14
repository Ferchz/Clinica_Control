/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control_clinica;

import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FerdyRCardonaDev
 */
public class Add_User extends javax.swing.JFrame {

    /**
     * Creates new form Add_User
     */
    public Add_User() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        this.setSize(660, 370);
    }

   public Connection conectar(){
    
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_clinica","root","Emperador5732");
        }catch (SQLException e){
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la conexion a DB");
        }
        return con;                                                                                                                                            
    }
    
   public void add(){
       
        Connection cn = null;
        Statement sql;
        PreparedStatement pst = null;
        String insert = "INSERT INTO paciente (Nombre, Direccion, Telefono)VALUES (?,?,?)";
        
        String Nombre = txtNombre.getText();
        String Direccion = txtDireccion.getText();
        int Telefono = Integer.parseInt(txtTelefono.getText());
        
        try{
            cn = conectar();
            pst = cn.prepareStatement(insert);
            pst.setString(1, Nombre);
            pst.setString(2, Direccion);
            pst.setInt(3, Telefono);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, al ingresar :( 2" +e.toString());
        }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new control_clinica.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelRound2 = new control_clinica.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(20, 36, 57));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS DEL USUARIO");
        jLabel1.setToolTipText("");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 260, -1));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teléfono");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 20));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 280, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 20));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 380, 30));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelRound1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 380, 30));

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 20));

        panelRound2.setBackground(new java.awt.Color(237, 245, 255));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound2MouseClicked(evt);
            }
        });
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(20, 36, 57));
        jLabel5.setText("Ingresar");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 110, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 10, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseClicked
        add();
        this.dispose();
        
    }//GEN-LAST:event_panelRound2MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private control_clinica.PanelRound panelRound1;
    private control_clinica.PanelRound panelRound2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

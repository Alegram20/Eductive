
package edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AdminCreateStu extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public AdminCreateStu() {
        initComponents();
        welcomeuser();
    }

    
    
    void welcomeuser(){
        String id = Signin.id.getText();
        
       
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            pst=con.prepareStatement("select name, surname from admin where id = ?");
            pst.setString(1, id);
            rs=pst.executeQuery();
            
            if(rs.next()){
                name.setText(rs.getString("name"));     
                surname.setText(rs.getString("surname"));  
                
            }
            
                    
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminCreateStu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminCreateStu.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        ManagerPage = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        ManagerPage1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        stuaccount = new javax.swing.JButton();
        tmail = new javax.swing.JTextField();
        ttype = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 166, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        logo.setText("EDUCTIVE");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_back_to_30px.png"))); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 70, -1));

        ManagerPage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ManagerPage.setText("Admin Page");
        jPanel1.add(ManagerPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_sign_out_30px.png"))); // NOI18N
        logout.setText("Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 90, -1));

        surname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        surname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 20));

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 20));

        ManagerPage1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ManagerPage1.setForeground(new java.awt.Color(255, 255, 255));
        ManagerPage1.setText("Create Student Account");
        jPanel1.add(ManagerPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 50)); // NOI18N
        jLabel2.setText("EDUCTIVE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 550, 43));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 522, 10));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("School Managment Application");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 270, 30));

        stuaccount.setBackground(new java.awt.Color(33, 166, 230));
        stuaccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stuaccount.setForeground(new java.awt.Color(255, 255, 255));
        stuaccount.setText("Create Student Account");
        stuaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuaccountActionPerformed(evt);
            }
        });
        jPanel2.add(stuaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 60));

        tmail.setBackground(new java.awt.Color(33, 166, 230));
        tmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tmail.setText(" ");
        jPanel2.add(tmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 310, 40));

        ttype.setBackground(new java.awt.Color(33, 166, 230));
        ttype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student" }));
        jPanel2.add(ttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 310, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Type of User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         Admin a = new Admin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       
       int a= JOptionPane.showConfirmDialog(this,"Do you want to log out from your account?","Log out",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE ); 
        
        if(a==JOptionPane.YES_OPTION){
        
        Main b = new Main();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

        
    }    
         
    private void stuaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuaccountActionPerformed
          String Email = tmail.getText();
          String Role = (String) ttype.getSelectedItem();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            
              if(ttype.getSelectedItem().equals("Student"))
         {
             pst =con.prepareStatement("insert into users (email,usertype) values (?,?) ");
             
             
             pst.setString(1, Email);
             pst.setString(2, Role);
             pst.executeUpdate();
             
          
             JOptionPane.showMessageDialog(this,"Student Account has been created successfully!");
             
             Admin a = new Admin();
             a.setVisible(true);
             this.dispose();
            
              
          
             
            
             
                     
          }
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_stuaccountActionPerformed

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
            java.util.logging.Logger.getLogger(AdminCreateStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCreateStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCreateStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCreateStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCreateStu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManagerPage;
    private javax.swing.JLabel ManagerPage1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name;
    private javax.swing.JButton stuaccount;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField tmail;
    private javax.swing.JComboBox<String> ttype;
    // End of variables declaration//GEN-END:variables
}


package edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Signin extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement ps;
   
    public Signin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 166, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel1.setText("EDUCTIVE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_exit_30px_1.png"))); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 60, -1));

        signin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_login_30px_1.png"))); // NOI18N
        signin.setText("Sign in");
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/icons8_back_to_30px.png"))); // NOI18N
        exit1.setText("Back");
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });
        jPanel2.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 70, -1));

        id.setBackground(new java.awt.Color(33, 166, 230));
        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 310, 40));

        role.setBackground(new java.awt.Color(33, 166, 230));
        role.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Professor", "Student", "Parent" }));
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 310, 40));

        jButton1.setBackground(new java.awt.Color(33, 166, 230));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign in");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 166, 230), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 170, 50));

        email.setBackground(new java.awt.Color(33, 166, 230));
        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 310, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Role");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 800, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        Main b = new Main();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exit1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int Id = Integer.parseInt(id.getText());
        String Email = email.getText();
        String Role = (String) role.getSelectedItem();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/eductivedb","root","");
            
              if(role.getSelectedItem().equals("Manager"))
         {
             ps=con.prepareStatement("select * from users where id=? and email=? and usertype=? ");
             ps.setInt(1, Id);
             ps.setString(2, Email);
             ps.setString(3, Role);
             rs = ps.executeQuery();
             
             if (rs.next())
          {
             JOptionPane.showMessageDialog(this,"Successful Login!");
              Admin a = new Admin();
             a.setVisible(true);
             this.dispose();
              
          }
          else
          {
             JOptionPane.showMessageDialog(this,"Id, Email or role of user are incorrect","Error",JOptionPane.ERROR_MESSAGE); 
             id.setText("");
             email.setText("");
                     
          }
         }
               if(role.getSelectedItem().equals("Student"))
         {
             ps=con.prepareStatement("select * from users where id=? and email=? and usertype=? ");
             ps.setInt(1, Id);
             ps.setString(2, Email);
             ps.setString(3, Role);
             rs = ps.executeQuery();
             
             if (rs.next())
          {
             JOptionPane.showMessageDialog(this,"Successful Login!");
              Student a = new Student();
             a.setVisible(true);
             this.dispose();
              
          }
          else
          {
             JOptionPane.showMessageDialog(this,"Id, Email or role of user are incorrect","Error",JOptionPane.ERROR_MESSAGE); 
             id.setText("");
             email.setText("");
                     
          }
         }
               
                if(role.getSelectedItem().equals("Professor"))
         {
             ps=con.prepareStatement("select * from users where id=? and email=? and usertype=? ");
             ps.setInt(1, Id);
             ps.setString(2, Email);
             ps.setString(3, Role);
             rs = ps.executeQuery();
             
             if (rs.next())
          {
             JOptionPane.showMessageDialog(this,"Successful Login!");
              Professor a = new Professor();
             a.setVisible(true);
             this.dispose();
              
          }
          else
          {
             JOptionPane.showMessageDialog(this,"Id, Email or role of user are incorrect","Error",JOptionPane.ERROR_MESSAGE); 
             id.setText("");
             email.setText("");
                     
          }
         }
        
                
                if(role.getSelectedItem().equals("Parent"))
         {
             ps=con.prepareStatement("select * from users where id=? and email=? and usertype=? ");
             ps.setInt(1, Id);
             ps.setString(2, Email);
             ps.setString(3, Role);
             rs = ps.executeQuery();
             
             if (rs.next())
          {
             JOptionPane.showMessageDialog(this,"Successful Login!");
              Parent a = new Parent();
             a.setVisible(true);
             this.dispose();
              
          }
          else
          {
             JOptionPane.showMessageDialog(this,"Id, Email or role of user are incorrect","Error",JOptionPane.ERROR_MESSAGE); 
             id.setText("");
             email.setText("");
                     
          }
         }
        
      
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
      
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel signin;
    // End of variables declaration//GEN-END:variables
}

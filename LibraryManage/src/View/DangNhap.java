/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Object.Account;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangKiDangNhap
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        chkRemember = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log in");

        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Username:");

        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Password:");

        chkRemember.setText("Remember me?");

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 153, 153));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLogin)
                                    .addComponent(chkRemember)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtPassword)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkRemember)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        
        StringBuilder sb = new StringBuilder();
        
        if (username.equals("")) {
            sb.append("Không được bỏ trống phần username! \n");
        }
        if (password.equals("")) {
            sb.append("Không được bỏ trống phần password! \n");
        }
        if(sb.length()>0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
//        if(username.equals("user") && password.equals("user")) {
//            JOptionPane.showMessageDialog(this, "Đăng nhập thành công ");
//            if(chkRemember.isSelected()) {
//                JOptionPane.showMessageDialog(this, "Tài khoản của bạn đã được ghi nhớ ");
//            }
//            checkAccount();
//        }else{
//            JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mật khẩu hoặc tài khoản! Mời bạn nhập lại");
//        }
        int i = 0;
        for(Account acc : arrAcc){
            if(username.equals(acc.getUserName()) && password.equals(acc.getPassword())){
                i = 0;
              
            }else{
                i = 1;
            }
                
        }
        if(i == 0 ){
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công ");
            LibraryManagement lm = new LibraryManagement();
            lm.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Bạn đã nhập sai mật khẩu hoặc tài khoản! Mời bạn nhập lại");
            txtPassword.setText("");
            txtUsername.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    ArrayList<Account> arrAcc = new ArrayList<>();
  
    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLThuVien";
    String user = "sa";
    String password = "1A@gmail.com";
    Connection conn = null;
    
    public void loadData(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM UserAccount";
            ResultSet rs = st.executeQuery(sql);
            arrAcc.clear();
            while(rs.next()){
                String userN = rs.getString(1);
                String pass = rs.getString(2);
                String role = rs.getString(3);
                arrAcc.add(new Account(userN, pass, role));  
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
      
    public void checkAccount(){
        for(Account acc : arrAcc){
            if(txtUsername.getText().equals(acc.getUserName()) && txtPassword.getText().equals(acc.getPassword())){
                JOptionPane.showMessageDialog(this, "Dang nhap thanh cong");
                new LibraryManagement();
                
            }   
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FuncionarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
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
    jLabel17 = new javax.swing.JLabel();
    txtsenha = new javax.swing.JPasswordField();
    jLabel4 = new javax.swing.JLabel();
    txtemail = new javax.swing.JTextField();
    btnentrar = new javax.swing.JButton();
    btnfechar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Bem-Vindo ao Sistema");

    jPanel1.setBackground(new java.awt.Color(0, 102, 204));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Autenticação de Usuários");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(jLabel1)
        .addContainerGap(292, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addComponent(jLabel1)
        .addContainerGap(44, Short.MAX_VALUE))
    );

    jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    jLabel17.setText("Senha:");

    txtsenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    jLabel4.setText("E-mail:");

    txtemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

    btnentrar.setBackground(new java.awt.Color(240, 240, 240));
    btnentrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png"))); // NOI18N
    btnentrar.setText("ENTRAR");
    btnentrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnentrarActionPerformed(evt);
      }
    });

    btnfechar.setBackground(new java.awt.Color(240, 240, 240));
    btnfechar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    btnfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign_out_icon.png"))); // NOI18N
    btnfechar.setText("FECHAR");
    btnfechar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnfecharActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(161, 161, 161)
            .addComponent(btnentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(57, 57, 57)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel17))
        .addGap(51, 51, 51)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 80, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        // Botão Entrar
        try {
            String email, senha;
            email = txtemail.getText();
            senha = txtsenha.getText();
            
            FuncionarioDAO dao = new FuncionarioDAO();
            
            boolean sucesso = dao.logar(email, senha);
            if (sucesso){
              this.dispose();
            }
            else {
              txtemail.setText(null);
              txtsenha.setText(null);
            }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro");
        }
        
    }//GEN-LAST:event_btnentrarActionPerformed

  private void btnfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfecharActionPerformed
    // Fechar o sistema
    int op;
    
    op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar a aplicação?");
    
    if (op == 0) {
      System.exit(0);
    }
  }//GEN-LAST:event_btnfecharActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnentrar;
  private javax.swing.JButton btnfechar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtemail;
  private javax.swing.JPasswordField txtsenha;
  // End of variables declaration//GEN-END:variables
}

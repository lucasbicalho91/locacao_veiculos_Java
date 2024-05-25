/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.VeiculoDAO;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.Veiculo;

/**
 *
 * @author Lucas
 */
public class FrmVeiculos extends javax.swing.JFrame {
  
    
      public void listar() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.getDefault());
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#,##0.00");

        VeiculoDAO dao = new VeiculoDAO();
        List<Veiculo> veiculos = dao.listarVeiculos();
        DefaultTableModel dados = (DefaultTableModel) tabelaVeiculos.getModel();
        dados.setNumRows(0);
        
        for (Veiculo v : veiculos) {
            dados.addRow(new Object[] {
                v.getId(),
                v.getMarca(),
                v.getModelo(),
                v.getAno(),
                v.getCategoria().getDescricao(),
                v.getPlaca(),
                df.format(v.getValorCompra()),
                v.getTipo(),
                v.getEstado().getDescricao(),
                
            });
        }  
    }
   

    /**
     * Creates new form frmClientes
     */
    public FrmVeiculos() {
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
    jTabbedPane1 = new javax.swing.JTabbedPane();
    painel_inicial = new javax.swing.JPanel();
    jTextField1 = new javax.swing.JTextField();
    btncadastrar = new javax.swing.JButton();
    btnlocar = new javax.swing.JButton();
    btnvender = new javax.swing.JButton();
    btnlocar1 = new javax.swing.JButton();
    btnlistar = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelaVeiculos = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Página de Veículos");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(0, 102, 204));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Página de Veículos");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addComponent(jLabel1)
        .addContainerGap(44, Short.MAX_VALUE))
    );

    painel_inicial.setBackground(new java.awt.Color(255, 255, 255));

    jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
    jTextField1.setText("Escolha uma opção:");
    jTextField1.setBorder(null);
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1ActionPerformed(evt);
      }
    });

    btncadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    btncadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
    btncadastrar.setText("Cadastrar um novo veículo");
    btncadastrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btncadastrarActionPerformed(evt);
      }
    });

    btnlocar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    btnlocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
    btnlocar.setText("Devolver o veículo de um cliente");

    btnvender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    btnvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_icon.png"))); // NOI18N
    btnvender.setText("Vender um veículo");
    btnvender.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnvenderActionPerformed(evt);
      }
    });

    btnlocar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    btnlocar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_icon.png"))); // NOI18N
    btnlocar1.setText("Locar um veículo para um cliente");
    btnlocar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnlocar1ActionPerformed(evt);
      }
    });

    btnlistar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/van_icon.png"))); // NOI18N
    btnlistar.setText("Listar Todos os Veículos Cadastrados");
    btnlistar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnlistarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout painel_inicialLayout = new javax.swing.GroupLayout(painel_inicial);
    painel_inicial.setLayout(painel_inicialLayout);
    painel_inicialLayout.setHorizontalGroup(
      painel_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painel_inicialLayout.createSequentialGroup()
        .addGap(97, 97, 97)
        .addGroup(painel_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(btnvender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btncadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnlistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnlocar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnlocar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(231, Short.MAX_VALUE))
    );
    painel_inicialLayout.setVerticalGroup(
      painel_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painel_inicialLayout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnlocar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnlocar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnvender, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(55, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Página Inicial", painel_inicial);

    jPanel2.setBackground(new java.awt.Color(204, 204, 204));
    jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

    tabelaVeiculos.setBackground(new java.awt.Color(240, 240, 240));
    tabelaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Código", "Marca", "Modelo", "Ano", "Categoria", "Placa", "Valor da Compra", "Tipo", "Estado"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, true, true, true, true
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tabelaVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tabelaVeiculosMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tabelaVeiculos);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(49, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(95, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Veículos Cadastrados", jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(128, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      //Listar todos os veículos
      listar();
      
    }//GEN-LAST:event_formWindowActivated

  private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed

    FrmAquisicao telaaq = new FrmAquisicao();
    telaaq.setVisible(true);
    this.dispose();

  }//GEN-LAST:event_btncadastrarActionPerformed

  private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField1ActionPerformed

  private void btnvenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvenderActionPerformed
    
    FrmVender telavenda = new FrmVender();
    telavenda.setVisible(true);
    this.dispose();
    
  }//GEN-LAST:event_btnvenderActionPerformed

  private void btnlocar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocar1ActionPerformed
    
    FrmLocacao telaLocacao = new FrmLocacao();
    telaLocacao.setVisible(true);
    this.dispose();
    
  }//GEN-LAST:event_btnlocar1ActionPerformed

  private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        //Lista de veículos
        jTabbedPane1.setSelectedIndex(1);
        
  }//GEN-LAST:event_btnlistarActionPerformed

  private void tabelaVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVeiculosMouseClicked

  }//GEN-LAST:event_tabelaVeiculosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                new FrmVeiculos().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btncadastrar;
  private javax.swing.JButton btnlistar;
  private javax.swing.JButton btnlocar;
  private javax.swing.JButton btnlocar1;
  private javax.swing.JButton btnvender;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  public javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JPanel painel_inicial;
  private javax.swing.JTable tabelaVeiculos;
  // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.VeiculoDAO;
import enums.Categoria;
import enums.Marca;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Veiculo;

/**
 *
 * @author Lucas
 */
public class FrmVender extends javax.swing.JFrame {
  
  /**
   * Creates new form FrmVender
   */
  public FrmVender() {
    initComponents();
    tabelaVeiculos.setVisible(false);

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
    painelLista = new javax.swing.JPanel();
    jLabel15 = new javax.swing.JLabel();
    txtcodigo = new javax.swing.JTextField();
    btnbusca = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelaVeiculos = new javax.swing.JTable();
    btnvender = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    cbtipo = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    cbmarca = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    cbcategoria = new javax.swing.JComboBox<>();
    btnfiltrar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Venda de Veículo");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(0, 102, 204));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Vender um Veículo");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(33, 33, 33)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(39, 39, 39)
        .addComponent(jLabel1)
        .addContainerGap(45, Short.MAX_VALUE))
    );

    painelLista.setBackground(new java.awt.Color(255, 255, 255));

    jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel15.setText("Código:");

    txtcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txtcodigo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtcodigoActionPerformed(evt);
      }
    });
    txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtcodigoKeyPressed(evt);
      }
    });

    btnbusca.setBackground(new java.awt.Color(240, 240, 240));
    btnbusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnbusca.setText("Pesquisar");
    btnbusca.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnbuscaActionPerformed(evt);
      }
    });

    tabelaVeiculos.setBackground(new java.awt.Color(240, 240, 240));
    tabelaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Código", "Marca", "Modelo", "Ano", "Placa", "Preço para venda", "Estado"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, true, true, true
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

    btnvender.setBackground(new java.awt.Color(240, 240, 240));
    btnvender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btnvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sold_icon.png"))); // NOI18N
    btnvender.setText("VENDER VEÍCULO");
    btnvender.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnvenderActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel6.setText("Tipo do Veículo");

    cbtipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvel", "Motocicleta", "Van" }));
    cbtipo.setSelectedItem(null);
    cbtipo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cbtipoItemStateChanged(evt);
      }
    });
    cbtipo.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        cbtipoAncestorAdded(evt);
      }
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    cbtipo.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cbtipoMouseClicked(evt);
      }
    });
    cbtipo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbtipoActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setText("Marca:");

    cbmarca.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        cbmarcaAncestorAdded(evt);
      }
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    cbmarca.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbmarcaActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel4.setText("Categoria:");

    cbcategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    cbcategoria.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        cbcategoriaAncestorAdded(evt);
      }
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    cbcategoria.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbcategoriaActionPerformed(evt);
      }
    });

    btnfiltrar.setBackground(new java.awt.Color(240, 240, 240));
    btnfiltrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnfiltrar.setText("Filtrar");
    btnfiltrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnfiltrarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
    painelLista.setLayout(painelListaLayout);
    painelListaLayout.setHorizontalGroup(
      painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painelListaLayout.createSequentialGroup()
        .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(painelListaLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(painelListaLayout.createSequentialGroup()
                .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(painelListaLayout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(painelListaLayout.createSequentialGroup()
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(btnbusca)
                  .addGroup(painelListaLayout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
          .addGroup(painelListaLayout.createSequentialGroup()
            .addGap(296, 296, 296)
            .addComponent(btnvender, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(18, Short.MAX_VALUE))
    );
    painelListaLayout.setVerticalGroup(
      painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painelListaLayout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(16, 16, 16)
        .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(jLabel6)
          .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3)
          .addComponent(cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        .addComponent(btnvender, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(painelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(11, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtcodigoActionPerformed

  private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed

  }//GEN-LAST:event_txtcodigoKeyPressed

  private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
            
    int id = Integer.parseInt(txtcodigo.getText());
    NumberFormat nf = NumberFormat.getNumberInstance(Locale.getDefault());
    DecimalFormat df = (DecimalFormat) nf;
    df.applyPattern("#,##0.00");

    VeiculoDAO dao = new VeiculoDAO();
    Veiculo veiculo = dao.buscarVeiculoPorCodigo(id);
    
    if (veiculo != null) {
      DefaultTableModel dados = (DefaultTableModel) tabelaVeiculos.getModel();
      Double valorVenda = veiculo.getValorParaVenda();
      dados.setNumRows(0);
      dados.addRow(new Object[]{
        veiculo.getId(),
        veiculo.getMarca(),
        veiculo.getModelo(),
        veiculo.getAno(),
        veiculo.getPlaca(),
        df.format(valorVenda),
        veiculo.getEstado().getDescricao(),});
    }
    tabelaVeiculos.setVisible(true);
    txtcodigo.setText("");
     
  }//GEN-LAST:event_btnbuscaActionPerformed

  private void tabelaVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVeiculosMouseClicked
    

  }//GEN-LAST:event_tabelaVeiculosMouseClicked

  private void btnvenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvenderActionPerformed
    // vender um veículo
    int rowIndex = tabelaVeiculos.getSelectedRow();
    if (rowIndex != -1) { 
      
      DefaultTableModel model = (DefaultTableModel) tabelaVeiculos.getModel();

      int id = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
      
      VeiculoDAO dao = new VeiculoDAO();
      dao.venderVeiculo(id);
      tabelaVeiculos.setVisible(false);
      
    } else {
      JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
    }

  }//GEN-LAST:event_btnvenderActionPerformed

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    //Listar os veículos
  }//GEN-LAST:event_formWindowActivated

  private void cbtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbtipoItemStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoItemStateChanged

  private void cbtipoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbtipoAncestorAdded
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoAncestorAdded

  private void cbtipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbtipoMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoMouseClicked

  private void cbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoActionPerformed

  private void cbmarcaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbmarcaAncestorAdded

    cbmarca.removeAllItems();

    for (Marca marca : Marca.values()) {
      cbmarca.addItem(marca.toString());
    }
    cbmarca.setSelectedItem(null);

  }//GEN-LAST:event_cbmarcaAncestorAdded

  private void cbmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmarcaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbmarcaActionPerformed

  private void cbcategoriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbcategoriaAncestorAdded

    cbcategoria.removeAllItems();

    for (Categoria categoria : Categoria.values()) {
      cbcategoria.addItem(categoria.getDescricao());
    }
    cbcategoria.setSelectedItem(null);
  }//GEN-LAST:event_cbcategoriaAncestorAdded

  private void cbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoriaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbcategoriaActionPerformed

  private void btnfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiltrarActionPerformed
    //Filtrar
    Object marca = cbmarca.getSelectedItem();
    Object categoria = cbcategoria.getSelectedItem();
    Object tipo = cbtipo.getSelectedItem();

    NumberFormat nf = NumberFormat.getNumberInstance(Locale.getDefault());
    DecimalFormat df = (DecimalFormat) nf;
    df.applyPattern("#,##0.00");

    VeiculoDAO dao = new VeiculoDAO();
    List<Veiculo> veiculos = dao.filtrarVeiculos(marca, categoria, tipo);
    tabelaVeiculos.setVisible(true);
    DefaultTableModel dados = (DefaultTableModel) tabelaVeiculos.getModel();
    dados.setNumRows(0);

    for (Veiculo v : veiculos) {
      Double valorVenda = v.getValorParaVenda();
      dados.addRow(new Object[]{
        v.getId(),
        v.getMarca(),
        v.getModelo(),
        v.getAno(),
        v.getPlaca(),
        df.format(valorVenda),
        v.getEstado().getDescricao(),});
    }

    cbmarca.setSelectedItem(null);
    cbcategoria.setSelectedItem(null);
    cbtipo.setSelectedItem(null);
    
  }//GEN-LAST:event_btnfiltrarActionPerformed

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
      java.util.logging.Logger.getLogger(FrmVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FrmVender().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnbusca;
  private javax.swing.JButton btnfiltrar;
  private javax.swing.JButton btnvender;
  private javax.swing.JComboBox<String> cbcategoria;
  private javax.swing.JComboBox<String> cbmarca;
  private javax.swing.JComboBox<String> cbtipo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel painelLista;
  private javax.swing.JTable tabelaVeiculos;
  private javax.swing.JTextField txtcodigo;
  // End of variables declaration//GEN-END:variables
}

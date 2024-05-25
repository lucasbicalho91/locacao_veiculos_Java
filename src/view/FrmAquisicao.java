/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.VeiculoDAO;
import enums.Categoria;
import enums.Marca;
import enums.ModeloAutomovel;
import enums.ModeloMotocicleta;
import enums.ModeloVan;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.Automovel;
import model.Motocicleta;
import model.Van;
import model.Veiculo;
import utilities.Utils;

/**
 *
 * @author Lucas
 */
public class FrmAquisicao extends javax.swing.JFrame {

      
    /**
     * Creates new form FrmAquisicao
     */
    public FrmAquisicao() {
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
    painelVeiculo = new javax.swing.JTabbedPane();
    painelDados = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    txtvalor = new javax.swing.JFormattedTextField();
    jLabel4 = new javax.swing.JLabel();
    cbcategoria = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    cbmodelo = new javax.swing.JComboBox<>();
    jLabel14 = new javax.swing.JLabel();
    txtplaca = new javax.swing.JFormattedTextField();
    jLabel8 = new javax.swing.JLabel();
    txtano = new javax.swing.JTextField();
    cbmarca = new javax.swing.JComboBox<>();
    btncadastrar = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    cbtipo = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro de Veículo");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(0, 102, 204));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Cadastro de Veículo Novo");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(jLabel1)
        .addContainerGap(542, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(40, 40, 40)
        .addComponent(jLabel1)
        .addContainerGap(44, Short.MAX_VALUE))
    );

    painelDados.setBackground(new java.awt.Color(255, 255, 255));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setText("Marca:");

    jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel13.setText("Valor de Compra:");

    txtvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
    txtvalor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txtvalor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtvalorActionPerformed(evt);
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

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel5.setText("Modelo:");

    cbmodelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    cbmodelo.addAncestorListener(new javax.swing.event.AncestorListener() {
      public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
        cbmodeloAncestorAdded(evt);
      }
      public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
      }
      public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
      }
    });
    cbmodelo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbmodeloActionPerformed(evt);
      }
    });

    jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel14.setText("Placa:");

    try {
      txtplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    txtplaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txtplaca.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtplacaActionPerformed(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setText("Ano:");

    txtano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

    btncadastrar.setBackground(new java.awt.Color(240, 240, 240));
    btncadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    btncadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/van_icon.png"))); // NOI18N
    btncadastrar.setText("CADASTRAR VEÍCULO");
    btncadastrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btncadastrarActionPerformed(evt);
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

    javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
    painelDados.setLayout(painelDadosLayout);
    painelDadosLayout.setHorizontalGroup(
      painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painelDadosLayout.createSequentialGroup()
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(painelDadosLayout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(painelDadosLayout.createSequentialGroup()
                  .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelDadosLayout.createSequentialGroup()
                  .addComponent(jLabel5)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(cbmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelDadosLayout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelDadosLayout.createSequentialGroup()
                  .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                      .addComponent(jLabel14)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                      .addComponent(jLabel13)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(142, 142, 142)))
              .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(painelDadosLayout.createSequentialGroup()
            .addGap(190, 190, 190)
            .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(385, Short.MAX_VALUE))
    );
    painelDadosLayout.setVerticalGroup(
      painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painelDadosLayout.createSequentialGroup()
        .addGap(47, 47, 47)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(15, 15, 15)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(cbmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addGap(18, 18, 18)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel14))
        .addGap(18, 18, 18)
        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel13))
        .addGap(30, 30, 30)
        .addComponent(btncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(45, Short.MAX_VALUE))
    );

    painelVeiculo.addTab("Dados do Veículo", painelDados);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(painelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(painelVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(35, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       // TODO add your handling code here:
  }//GEN-LAST:event_formWindowActivated

  private void cbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoActionPerformed

  private void cbtipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbtipoMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoMouseClicked

  private void cbtipoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbtipoAncestorAdded
    // TODO add your handling code here:
  }//GEN-LAST:event_cbtipoAncestorAdded

  private void cbtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbtipoItemStateChanged

    cbmodelo.removeAllItems();

    if (cbtipo.getSelectedItem() == "Automóvel") {
      for (ModeloAutomovel modelo : ModeloAutomovel.values()) {
        cbmodelo.addItem(modelo.toString());
      }
    }

    else if (cbtipo.getSelectedItem() == "Motocicleta") {
      for (ModeloMotocicleta modelo : ModeloMotocicleta.values()) {
        cbmodelo.addItem(modelo.toString());
      }
    }

    else if (cbtipo.getSelectedItem() == "Van") {
      for (ModeloVan modelo : ModeloVan.values()) {
        cbmodelo.addItem(modelo.toString());
      }
    }

    cbmodelo.setSelectedItem(null);

  }//GEN-LAST:event_cbtipoItemStateChanged

  private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
    // cadastrar um novo veículo
    Veiculo veiculo = null;
    String tipo = cbtipo.getSelectedItem().toString();
    String numero = txtvalor.getText().replace(",", ".");

    if (cbtipo.getSelectedItem() == "Automóvel") {
      veiculo = new Automovel();
    }
    else if (cbtipo.getSelectedItem() == "Motocicleta") {
      veiculo = new Motocicleta();
    }
    else if (cbtipo.getSelectedItem() == "Van") {
      veiculo = new Van();
    }

    if (veiculo != null) {
      veiculo.setMarca(Marca.valueOf(cbmarca.getSelectedItem().toString()));
      veiculo.setCategoria(Categoria.fromDescricao(cbcategoria.getSelectedItem().toString()));
      veiculo.setAno(Integer.parseInt(txtano.getText()));
      veiculo.setPlaca(txtplaca.getText());
      veiculo.setValorCompra(Double.parseDouble(numero));

      if (veiculo instanceof Automovel automovel) {
        automovel.setModelo(ModeloAutomovel.valueOf(cbmodelo.getSelectedItem().toString()));
      } else if (veiculo instanceof Motocicleta motocicleta) {
        motocicleta.setModelo(ModeloMotocicleta.valueOf(cbmodelo.getSelectedItem().toString()));
      } else if (veiculo instanceof Van van) {
        van.setModelo(ModeloVan.valueOf(cbmodelo.getSelectedItem().toString()));
      }

    }

    VeiculoDAO dao = new VeiculoDAO();
    dao.cadastrarVeiculo (veiculo, tipo);

    new Utils().limparCampos(painelDados);

  }//GEN-LAST:event_btncadastrarActionPerformed

  private void cbmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmarcaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbmarcaActionPerformed

  private void cbmarcaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbmarcaAncestorAdded

    cbmarca.removeAllItems();

    for (Marca marca : Marca.values()) {
      cbmarca.addItem(marca.toString());
    }
    cbmarca.setSelectedItem(null);

  }//GEN-LAST:event_cbmarcaAncestorAdded

  private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtplacaActionPerformed

  private void cbmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmodeloActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbmodeloActionPerformed

  private void cbmodeloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbmodeloAncestorAdded
    // TODO add your handling code here:
  }//GEN-LAST:event_cbmodeloAncestorAdded

  private void cbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoriaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbcategoriaActionPerformed

  private void cbcategoriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbcategoriaAncestorAdded

    cbcategoria.removeAllItems();

    for (Categoria categoria : Categoria.values()) {
      cbcategoria.addItem(categoria.getDescricao());
    }
    cbcategoria.setSelectedItem(null);
  }//GEN-LAST:event_cbcategoriaAncestorAdded

  private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtvalorActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAquisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAquisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAquisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAquisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAquisicao().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btncadastrar;
  private javax.swing.JComboBox<String> cbcategoria;
  private javax.swing.JComboBox<String> cbmarca;
  private javax.swing.JComboBox<String> cbmodelo;
  private javax.swing.JComboBox<String> cbtipo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel painelDados;
  private javax.swing.JTabbedPane painelVeiculo;
  private javax.swing.JTextField txtano;
  private javax.swing.JFormattedTextField txtplaca;
  private javax.swing.JFormattedTextField txtvalor;
  // End of variables declaration//GEN-END:variables
}

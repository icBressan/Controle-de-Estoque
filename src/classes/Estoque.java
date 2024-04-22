package classes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estoque extends javax.swing.JFrame {

    // criando um objeto da classe DefaultTableModel 
   DefaultTableModel modelo = new DefaultTableModel();
   
    public Estoque() {
        initComponents();
        atualizarTabela();
    }
    
    public void atualizarTabela(){
    ((DefaultTableModel) jTable1.getModel()).fireTableDataChanged();
}
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbtipo = new javax.swing.JComboBox<>();
        btnbuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        txtEntra = new javax.swing.JTextField();
        txtSai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Preço Unitário", "Estoque", "Tipo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentício", "Bebida", "Limpeza" }));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listar.png"))); // NOI18N
        jButton1.setText("Listar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo Produto:");

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntraActionPerformed(evt);
            }
        });

        jLabel2.setText("Entrada:");

        jLabel3.setText("Saída:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnvoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnbuscar)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEntra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdicionar)
                            .addGap(24, 24, 24)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSai, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemover))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(jButton1)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnRemover)
                    .addComponent(txtSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnvoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
      modelo = (DefaultTableModel) jTable1.getModel();
      modelo.setRowCount(0); // eliminando as linhas da tabela

      String tipo = cbtipo.getSelectedItem().toString(); // ObtÃ©m o tipo selecionado
  
      for(int i = 0; i < Dados.vet_dados.size(); i++) { // navegando no vetor (ArrayList)
        if (Dados.vet_dados.get(i).getTipo().equalsIgnoreCase(tipo)) { // verificando se o tipo do produto Ã© igual ao tipo selecionado
          // criando um array(vetor) de objetos e adicionando este vetor na linha do modelo (jTable) 
          modelo.addRow(new Object[]{
              Dados.vet_dados.get(i).getCod(),
              Dados.vet_dados.get(i).getPreco(),
              Dados.vet_dados.get(i).getEstoque(),
              Dados.vet_dados.get(i).getTipo(),
              Dados.vet_dados.get(i).getDescricao()
          });
      }
  }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        dispose(); // fechando a tela atual
        Menu x = new Menu();  // criando um objeto da classe Menu
        x.setVisible(true);  // deixando visÃ­vel a classe Menu (objeto x)
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
      int pos = jTable1.getSelectedRow();
      
    // Verifica se algum item foi selecionado na tabela
        if (pos == -1) { 
            JOptionPane.showMessageDialog(null, "Selecione um produto da tabela para remover estoque.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
       
      int remove = Integer.parseInt(txtSai.getText());// Captura a quantidade a ser removida
      Dados produto = Dados.vet_dados.get(pos);// Obtém o produto selecionado
    
    // Verifica se há estoque suficiente para remover
       if (produto.getEstoque() < remove) {
           JOptionPane.showMessageDialog(null, "Não há estoque suficiente para remover.", 
                  "Erro", JOptionPane.ERROR_MESSAGE);
       }
       
      produto.setEstoque(produto.getEstoque() - remove); // Atualiza o estoque do produto
      atualizarTabela();
      JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso!", "Sucesso",
              JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // eliminando as linhas da tabela
        
        String tipo = cbtipo.getSelectedItem().toString(); // ObtÃ©m o tipo selecionado
        
        for(int i=0; i<Dados.vet_dados.size(); i++) // navegando no vetor (ArrayList)
        {// criando um array(vetor) de objetos e adicionando este vetor na linha do modelo (jTable) 
          modelo.addRow(new Object[]{
          Dados.vet_dados.get(i).getCod(),
          Dados.vet_dados.get(i).getPreco(),
          Dados.vet_dados.get(i).getEstoque(),
          Dados.vet_dados.get(i).getTipo(),
          Dados.vet_dados.get(i).getDescricao()
        });
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
      int pos = jTable1.getSelectedRow();
    
    // Verifica se algum item foi selecionado na tabela
      if (pos == -1) {
          JOptionPane.showMessageDialog(null, "Selecione um produto da tabela para adicionar estoque.", 
                  "Erro", JOptionPane.ERROR_MESSAGE);
      }
    
      int add = Integer.parseInt(txtEntra.getText());// armazena quantidade a ser adicionada
      Dados produto = Dados.vet_dados.get(pos);// Obtém o produto selecionado
      produto.setEstoque(produto.getEstoque() + add); // Atualiza o estoque do produto
      atualizarTabela();
      JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso!", "Sucesso",
              JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntraActionPerformed

    }//GEN-LAST:event_txtEntraActionPerformed

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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEntra;
    private javax.swing.JTextField txtSai;
    // End of variables declaration//GEN-END:variables
}

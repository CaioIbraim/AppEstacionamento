package appestacionamento;

import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
public class TelaDados extends javax.swing.JFrame {

  // Atributos da clsses para ficarem disponíveis para todos os métodos
  int operacao;
  int id;

  // Construtor da janela alterado para receber o tipo de operação (1, 2 ou 3)
  // e o id do registro no banco, se id = 0 é uma inclusão
  public TelaDados(int operacao, int id) {
    initComponents();
    // repassa os dados recebidos para os atributos da classe
    this.operacao = operacao;
    this.id = id;
    // Limpa os conteúdos das caixas de texto
    tfMarca.setText("");
    tfPlaca.setText("");
    tfCor.setText("");
    tfHoraEntrada.setText("");
    tfHoraSaida.setText("");
    // Altera a fonte do Label de Título da janela
    lb1.setFont(new Font("Times Roman", Font.PLAIN, 14));
    if (operacao == 1) {
      // Determina o título da janela para uma inclusão
      lb1.setText("Inclusão");
    }
    if (operacao == 2) {
      // Determina o título da janela para uma alteração
      lb1.setText("Alteração");
      // Cria um objeto Carro para receber os dados da consulta
      Carro c = new Carro();
      // Cria um objeto CarroDAO para uso dos métodos de acesso
      // ao banco para os Carros
      CarroDAO cd = new CarroDAO();
      // Realiza a busca no Banco os dados do registro do Carro
      // através do id
      c = cd.buscarCarro(id);
      // Preenche as caixas de texto com os dados do Carro
      tfMarca.setText(String.valueOf(c.getMarca()));
      tfPlaca.setText(c.getPlaca());
      tfCor.setText(c.getCor());
      tfHoraEntrada.setText(String.valueOf( c.getHoraEntrada()));
      tfHoraSaida.setText(String.valueOf( c.getHoraEntrada()));
    }
    if (operacao == 3) {
      // Determina o título da janela para uma exclusão
      lb1.setText("Exclusão");
      // Cria um objeto Carro para receber os dados da consulta
      Carro c = new Carro();
      // Cria um objeto CarroDAO para uso dos métodos de acesso
      // ao banco para os Carros
      CarroDAO cd = new CarroDAO();
      // Realiza a busca no Banco os dados do registro do Carro
      // através do id
      c = cd.buscarCarro(id);
      // Preenche as caixas de texto com os dados do Carro
      tfMarca.setText(String.valueOf(c.getMarca()));
      tfPlaca.setText(c.getPlaca());
      tfCor.setText(c.getCor());
      tfHoraEntrada.setText(String.valueOf( c.getHoraEntrada()));
      tfHoraSaida.setText(String.valueOf( c.getHoraEntrada()));
   
    }
  }

  /**
   * O conteúdo a seguir foi gerado pelo NetBeans na criação da tela e não pode
   * ser alterado.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btConfirmar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfPlaca = new javax.swing.JTextField();
        tfCor = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        tfHoraEntrada = new javax.swing.JTextField();
        lb6 = new javax.swing.JLabel();
        tfHoraSaida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lb2.setText("Marca");

        lb3.setText("Placa:");

        lb4.setText("Cor:");

        tfMarca.setText("jTextField1");

        tfPlaca.setText("jTextField2");

        tfCor.setText("jTextField3");

        lb1.setText("jLabel4");

        lb5.setText("Hora Entrada:");

        tfHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraEntradaActionPerformed(evt);
            }
        });

        lb6.setText("Hora Saída:");

        tfHoraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lb6)
                                .addGap(30, 30, 30)
                                .addComponent(tfHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lb3)
                                        .addComponent(lb2)
                                        .addComponent(lb4))
                                    .addGap(18, 18, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(lb1))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lb5)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Método do botão de Confirmação
    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
      if (operacao == 1) { // Inclusão
        // Cria um objeto Carro para receber os dados da do preenchimento 
        // da tela
        Carro c = new Carro();
        // Cria um objeto CarroDAO para uso dos métodos de acesso
        // ao banco para os Carros
        CarroDAO cd = new CarroDAO();
        // Determina os valores dos atributos do objeto Carro, com os dados
        // preenchidos na tela
        // o id é gerado automaticamente pelo Access
        c.setMarca(tfMarca.getText().toString());
        c.setPlaca(tfPlaca.getText());
        c.setCor(tfCor.getText());
        c.setHoraEntrada(Integer.parseInt( tfHoraEntrada.getText()));
        c.setHoraSaida(Integer.parseInt( tfHoraSaida.getText()));
        
        // Verifica se a operação de inserção obteve sucesso
        if (cd.inserir(c)) {
          String mensagem = "Carro Inserido!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      } else if (operacao == 2) { // Alteração
        // Cria um objeto Carro para receber os dados da do preenchimento 
        // da tela
        Carro c = new Carro();
        // Cria um objeto CarroDAO para uso dos métodos de acesso
        // ao banco para os Carros
        CarroDAO cd = new CarroDAO();
        // Determina os valores dos atributos do objeto Carro, com os dados
        // preenchidos na tela
        // o id irá ser usado para determinar o registro a ser alterado
        c.setId(id);
        c.setMarca(tfMarca.getText().toString());
        c.setPlaca(tfPlaca.getText());
        c.setCor(tfCor.getText());
        c.setHoraEntrada(Integer.parseInt( tfHoraEntrada.getText()));
        c.setHoraSaida(Integer.parseInt( tfHoraSaida.getText()));
        

// Verifica se a operação de alteração obteve sucesso
        if (cd.alterar(c)) {
          String mensagem = "Carro Alterado!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      } else if (operacao == 3) { // Exclusão
        // Cria um objeto Carro para receber os dados da do preenchimento 
        // da tela
        Carro c = new Carro();
        // Cria um objeto CarroDAO para uso dos métodos de acesso
        // ao banco para os Carros
        CarroDAO cd = new CarroDAO();
        // Determina os valores dos atributos do objeto Carro, com os dados
        // preenchidos na tela
        // o id irá ser usado para determinar o registro a ser alterado
        c.setId(id);
        c.setMarca(tfMarca.getText().toString());
        c.setPlaca(tfPlaca.getText());
        c.setCor(tfCor.getText());
        c.setHoraEntrada(Integer.parseInt( tfHoraEntrada.getText()));
        c.setHoraSaida(Integer.parseInt( tfHoraSaida.getText()));
                
// Verifica se a operação de exclusão obteve sucesso
        if (cd.excluir(c)) {
          String mensagem = "Carro Excluído!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
      }
      this.dispose();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      // TODO add your handling code here:
      this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraEntradaActionPerformed

    private void tfHoraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraSaidaActionPerformed

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
      java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      // A chamada deste método foi alterada para atender 
      // a nova assinatura do método construtor da classe da janela
      // foram usados os valores 0 e 0 apenas compatibilizar
      // a janela será criada a partir da janela principal
      public void run() {
        new TelaDados(0, 0).setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfHoraEntrada;
    private javax.swing.JTextField tfHoraSaida;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
}

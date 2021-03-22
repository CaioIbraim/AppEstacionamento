package appestacionamento;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author sicsu
 */
// Classe de controle da manipução das operações no 
// Banco de dados da classe Carro
public class CarroDAO {
  // Método para realizar a busca na Tabela Carros dos dados do registro
  // do carro identificado pelo id

  public Carro buscarCarro(int id) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Carro para retornar os dados do registro
    Carro carro = new Carro();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela Carros através do id
        String consulta = "select * from carros where id="
                + String.valueOf(id).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Carro
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
            carro.setId(Integer.parseInt(rs.getString("id")));
            carro.setMarca(rs.getString("marca"));
            carro.setPlaca(rs.getString("placa"));
            carro.setCor(rs.getString("cor"));
            carro.setHoraEntrada(Integer.parseInt(rs.getString("horaEntrada")));
            carro.setHoraSaida(Integer.parseInt(rs.getString("horaSaida")));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Carro não Encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Carro com os dados do registro da tabela
    return carro;
  }

  // Método para realizar a inclusão de um no registro na Tabela Carros
  public boolean inserir(Carro carro) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela Carros 
        String consulta = "INSERT into carros (marca, placa, cor, horaentrada, horasaida) "
                + "VALUES(" + carro.getMarca() + ",'"
                + carro.getPlaca() + "','" + carro.getCor()+ "','" + carro.getHoraEntrada()+ "','" + carro.getHoraSaida()+ "')";
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Carro não Incluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Informa que a operação NÃO obteve sucesso
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

  public boolean alterar(Carro carro) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela Carros 
        String consulta = "UPDATE carros SET marca="
                + carro.getMarca() + ", placa='" + carro.getPlaca()
                + "', cor='" + carro.getCor()
                + "', horaentrada='" + carro.getHoraEntrada()
                + "', horasaida='" + carro.getHoraSaida()
                + "' WHERE id=" + carro.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Carro não Alterado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

  public boolean excluir(Carro carro) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela Carros 
        String consulta = "DELETE from carros WHERE id=" + carro.getId();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Carro não Excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

  public boolean listarCarros() {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Carro armazenar os dados de cada registro da tabela
    Carro carro = new Carro();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        String mensagem =
              "O resultado será exibido no ambiente de execução em modo texto!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Define a consulta de busca dos registros na tabela Carros 
        String consulta = "select * from carros";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        // Formata o título do relatório
        String linha = String.format("%3s|%-15s|%10s|%10s|%10s|%10s",
                "Id", "Placa", "Matrícula", "Cor", "Hora entrada", "Hora saída");
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Carro recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("id")) > 0) {
            carro.setId(Integer.parseInt(rs.getString("id")));
            carro.setMarca(rs.getString("marca"));
            carro.setPlaca(rs.getString("placa"));
            carro.setCor(rs.getString("cor"));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%3s|%-15s|%10s|%10s|%10s|%10s", rs.getString("id"),
                    rs.getString("placa"), rs.getString("marca"),
                    rs.getString("cor"), rs.getString("horaentrada"),rs.getString("horasaida"));
            // Exibe cada registro
            System.out.println(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }
}

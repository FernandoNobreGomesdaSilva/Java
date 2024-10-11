import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroCliente{
	// URL do banco de dados (formato: jdbc:mysql://servidor:porta/nome_do_banco)
    String url = "jdbc:mysql://localhost:3306/banco";
    String usuario = "root"; // Substitua pelo seu usuário do MySQL
    String senha = "1234";     // Substitua pela sua senha do MySQL
	
    public void CriarCorrente(ContaCorrente contaCorrente) {
    	String sqlcontaCorrente = "INSERT INTO ContaCorrente (nome, cpf, agencia, conta, saldo, chEspecial, cartaoCredito)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conn.prepareStatement(sqlcontaCorrente)) {
            // Setando os parâmetros da query com os valores do objeto ContaCorrente
            stmt.setString(1, contaCorrente.getNome());
            stmt.setString(2, contaCorrente.getCpf());
            stmt.setInt(3, contaCorrente.getAgencia());
            stmt.setInt(4, contaCorrente.getConta());
            stmt.setDouble(5, contaCorrente.getSaldo());
            stmt.setDouble(6, contaCorrente.getChEspecial());
            stmt.setDouble(7, contaCorrente.getCartaoCredito());

            // Executando a query
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Cliente cadastrado com sucesso!");
            } else {
                System.out.println("Falha ao cadastrar o cliente!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
    }
    
    public void CriarPoupanca(ContaPoupanca contaPoupanca) {
    	String sqlcontaPoupanca = "INSERT INTO ContaPoupanca (nome, cpf, agencia, conta, saldo, saldoContaPoupana)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, usuario, senha);
                PreparedStatement stmt = conn.prepareStatement(sqlcontaPoupanca)) {

               // Setando os parâmetros da query com os valores do objeto ContaPoupanca
               stmt.setString(1, contaPoupanca.getNome());
               stmt.setString(2, contaPoupanca.getCpf());
               stmt.setInt(3, contaPoupanca.getAgencia());
               stmt.setInt(4, contaPoupanca.getConta());
               stmt.setDouble(5, contaPoupanca.getSaldo());
               stmt.setDouble(6, contaPoupanca.getSaldoContaPoupanca());
               
               

               // Executando a query
               int linhasAfetadas = stmt.executeUpdate();

               if (linhasAfetadas > 0) {
                   System.out.println("Cliente cadastrado com sucesso!");
               } else {
                   System.out.println("Falha ao cadastrar o cliente!");
               }

           } catch (SQLException e) {
               e.printStackTrace();
           }
        
    }
    
}

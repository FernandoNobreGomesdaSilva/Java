import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    public static void main(String[] args) {
        // URL do banco de dados (formato: jdbc:mysql://servidor:porta/nome_do_banco)
        String url = "jdbc:mysql://localhost:3306/banco";
        String usuario = "root"; // Substitua pelo seu usuário do MySQL
        String senha = "1234";     // Substitua pela sua senha do MySQL

        // Tentar estabelecer a conexão
        try {
            // Registrar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Estabelecer a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");

            // Fechar a conexão
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        }
    }
}

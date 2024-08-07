import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Digite o servico a ser verificado: Movel, Fixa, Banda_larga ou TV: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os servicos contratados separados por vírgula: ");
        String entradaCliente = scanner.nextLine().trim();
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0].trim();
        
        boolean contratado = false;
        
        // Verifique se o serviço está na lista de serviços contratados
   		 for(Servicos s : Servicos.values()) {
   			 System.out.println("Produto: "+s.getProduto());
   			 for(int i = 1; i < partes.length; i++) {
   				if(partes[i].trim().equals(s.getProduto())) {
   					contratado = true;
      			 }
   			 }
   			 
   		 }
   	 
        
        if (contratado) {
            System.out.println("Seviço contratado: Sim");
        } else {
            System.out.println("Seviço contratado: Nao");
        }
        
        scanner.close();
    }
}

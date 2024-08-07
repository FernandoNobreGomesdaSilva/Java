import java.util.Scanner;

public class VerificacaoServicoCombo {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;
        boolean telefoniaFixa = false;

      //Verifique qual serviço foi contratado e atualize as variáveis
        for(Servicos s : Servicos.values()) {
        		System.out.println("Combo de Produto: "+s.getProduto());
        		for(int i =0; i< servicosContratados.length; i++) {
        			if(servicosContratados[i].equalsIgnoreCase(s.getProduto())) {
        				movelContratado = true;
        				bandaLargaContratada = true;
        				tvContratada = true;
        				telefoniaFixa = true;	
        		}    
        }
        }
        	

        // Verifique se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada && telefoniaFixa) {
        	
            return "Combo Completo";
        } else {
    
            return "Combo Incompleto";
        }
        
    }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        System.out.println("Informe os servicos contratados: ");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);
        

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
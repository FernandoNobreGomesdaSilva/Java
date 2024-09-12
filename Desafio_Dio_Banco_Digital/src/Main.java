public class Main {
    public static void main(String[] args) {
        // Criação de CadastroCliente
        CadastroCliente cadastro = new CadastroCliente();
        
        // Criação de Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente("Joao da Silva", "999.999.999-99", 5000.00, 1000.00, 10000.00);
        cadastro.CriarCorrente(contaCorrente); 
        System.out.println("Conta Corrente cadastrada:");
        contaCorrente.imprimirExtrato();

        // Criação de Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca("Joao da Silva", "999.999.999-99", 0, 0, 0.00, 2000.00);
        cadastro.CriarPoupanca(contaPoupanca);
        System.out.println("Conta Poupança cadastrada:");
        contaPoupanca.imprimirExtrato();

        // Operações na Conta Corrente
        System.out.println("Operações na Conta Corrente:");
        contaCorrente.depositar(500.00);  // Depósito na Conta Corrente
        contaCorrente.imprimirExtrato();

        contaCorrente.sacar(600.00);      // Saque na Conta Corrente
        contaCorrente.imprimirExtrato();
        contaCorrente.cartaoDeCredito(2000.00); // Uso do cartão de crédito
        contaCorrente.imprimirExtrato();

        // Operações na Conta Poupança
        System.out.println("Operações na Conta Poupança:");
        contaPoupanca.depositar(300.00);  // Depósito na Conta Poupança
        contaPoupanca.imprimirExtrato();

        contaPoupanca.sacar(100.00);      // Saque na Conta Poupança
        contaPoupanca.imprimirExtrato();

        // Transferência de Conta Corrente para Conta Poupança
        System.out.println("Transferência de Conta Corrente para Conta Poupanca:");
        contaCorrente.transferir(200.00, contaPoupanca);
        
        // Extratos após a transferência
        System.out.println("Extrato após transferência:");
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}

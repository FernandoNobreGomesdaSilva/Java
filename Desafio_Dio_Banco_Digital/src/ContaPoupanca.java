
public class ContaPoupanca extends Banco{
	private static final int agenciaPadrao = 1;
    private static int sequencia = 1;
	
	private double saldoContaPoupanca;
	
	public ContaPoupanca(String nome, String cpf, int agencia, int conta, double saldo, double saldoContaPoupanca) {
		super(nome, cpf, agenciaPadrao, sequencia++, saldo);
		this.saldoContaPoupanca = saldoContaPoupanca;
	}

	public double getSaldoContaPoupanca() {
		return saldoContaPoupanca;
	}

	public void setSaldoContaPoupanca(double saldoContaPoupanca) {
		this.saldoContaPoupanca = saldoContaPoupanca;
	}
	
	@Override
    public void depositar(double valor) {
        super.depositar(valor);
        super.setSaldo(getSaldo()); // Atualiza o saldo da superclasse Banco
    }
 // Método para sacar
    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        super.setSaldo(getSaldo()); // Atualiza o saldo da superclasse Banco
    }
 // Método para transferir
    @Override
    public void transferir(double valor, ContaPoupanca contaDestino) {
		super.transferir(valor, contaDestino);
		super.setSaldo(getSaldo()); // Atualiza o saldo da superclasse Banco
	}
	
	public void imprimirExtrato(){
		System.out.println("||--------------------Extrato conta poupanca--------------------||");
		super.imprimirExtrato();
		System.out.println("Saldo da Poupanca (reserva): R$  " +(this.getSaldoContaPoupanca()+ this.getSaldo()));
	}
	
	

}

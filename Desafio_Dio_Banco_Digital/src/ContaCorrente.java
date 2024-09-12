
public class ContaCorrente extends Banco {
    private static final int agenciaPadrao = 1;
    private static int sequencia = 1;

    private double chEspecial;
    private double cartaoCredito;

    public ContaCorrente(String nome, String cpf, double saldoContaCorrente, double chEspecial, double cartaoCredito) {
        super(nome, cpf, agenciaPadrao, sequencia++, saldoContaCorrente);
        this.chEspecial = chEspecial;
        this.cartaoCredito = cartaoCredito;
    }

    public double getChEspecial() {
        return chEspecial;
    }

    public void setChEspecial(double chEspecial) {
        this.chEspecial = chEspecial;
    }
    
    
    
 public double getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	// Método para depositar
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
 // Método uso do cartão de crédito
    public void cartaoDeCredito(double valor) {
    	double credito = getCartaoCredito();
    	if(valor > credito) {
    		System.out.println("Saldo insuficiente no cartao de credito: R$ " + valor);
    	}else {
    		credito -= valor;
    		setCartaoCredito(credito);
    		System.out.println("Voce usou o valor de : R$ "+valor+" do seu cartao de credito e possui um saldo no cartao de: R$ "+credito);
    	}
    	
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("||--------------------Extrato Conta Corrente--------------------||");
        super.imprimirExtrato();
        System.out.println("Saldo cheque especial: R$ " + this.getChEspecial());
        System.out.println("Saldo total (conta corrente + cheque especial): R$ " + (this.getSaldo() + this.getChEspecial()));
        System.out.println("Saldo cartao de credito: R$ "+this.getCartaoCredito());
        
    }
}
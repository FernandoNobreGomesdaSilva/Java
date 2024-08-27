import java.util.ArrayList;
import java.util.List;

public abstract class Banco {
    private String nome;
    private String cpf;
    protected int agencia;
    protected int conta;
    protected double saldo;

    public Banco(String nome, String cpf, int agencia, int conta, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado: R$ " + valor);
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
            
        } else {
            System.out.println("Saldo insuficiente para saque de: R$ " + valor);
        }
    }
 // Método para transferir
    public void transferir(double valor, ContaPoupanca contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
    public void imprimirExtrato() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Conta: " + this.getConta());
        System.out.println("Saldo: R$ " + this.getSaldo());
    }
}

package ContaBancaria;

public class ContaCorrente {
	private String nome;
	private String conta;
	private double saldo;

	
	public ContaCorrente(String nome, String conta, double saldo) {
		this.nome = "Fellipe Arakaki";
		this.conta = "123456-7";
		this.saldo = 0;
	}
	
	public void alteraNome(String n){
		this.nome = n;
	}
	
	public void saque(double s){
		this.saldo = saldo - s; 
	}
	
	public void deposito(double dep){
		this.saldo = saldo + dep; 
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}

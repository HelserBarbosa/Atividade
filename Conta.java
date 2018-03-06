package atividade;

public abstract class Conta {
	private static int proximaConta = 1;
	private final int agencia;
	private final int conta;
	private final String nome;
	private double limite;
	private double saldo;
	private double valorLimite;

	public Conta(int agencia, String nome) {
		this.agencia = agencia;
		this.conta = proximaConta;
		proximaConta++;
		this.nome = nome;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setValorLimite() {
		this.valorLimite = this.limite + this.saldo;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public final boolean sacar(double montante) {
		boolean status = false;
		if (montante >= valorLimite && montante != 0) {
			this.saldo -= this.saldo - montante;
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	public abstract boolean depositar(double montante);
}

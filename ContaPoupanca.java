package atividade;

public class ContaPoupanca extends Conta {
	public double juros;

	public ContaPoupanca(int agencia, String nome) {
		super(agencia, nome);
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public void setSaldo() {
		double novoSaldo = getSaldo();
		novoSaldo = novoSaldo * this.juros;
		super.setSaldo(novoSaldo);
	}

	@Override
	public boolean depositar(double montante) {
		boolean status = false;
		double saldo = getSaldo();
		if (montante >= 0) {
			saldo += saldo + montante;
			setSaldo(saldo);
			status = true;
		} else {
			status = false;
		}
		return status;
	}

}

package atividade;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, String nome) {
		super(agencia, nome);
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

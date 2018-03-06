package atividade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaPoupancaTeste {

	@Test
	public void testaSaque() {
		ContaPoupanca Cont = new ContaPoupanca(1, "Helder");
		Cont.setSaldo(1000);
		double montante = 200;
		boolean saqueEsperado = true;
		boolean saqueReal = Cont.sacar(200);
		assertEquals(saqueEsperado, saqueReal);
	}

	@Test
	public void testaDeposito() {
		ContaPoupanca Cont = new ContaPoupanca(1, "Helder");
		Cont.setSaldo(1000);
		double montante = 200;
		boolean saqueEsperado = true;
		boolean saqueReal = Cont.depositar(200);
		assertEquals(saqueEsperado, saqueReal);
	}

	@Test
	public void testaValorLimite() {
		ContaPoupanca Cont = new ContaPoupanca(1, "Helder");
		Cont.setSaldo(1000);
		Cont.setLimite(200);
		Cont.setValorLimite();
		double valorLimiteEsperado = 1200;
		double valorLimiteReal = Cont.getValorLimite();
		assertEquals(valorLimiteEsperado, valorLimiteReal);
	}
}

package atividade;

import java.util.Scanner;

public class ContaApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("qual timpo de conta deseja criar Corrente(1) Pupança(2)");
		int tipo = Integer.parseInt(teclado.nextLine());
		switch (tipo) {
		case 1: {
			System.out.println("digite a agencia e o titular da conta");
			int agencia = Integer.parseInt(teclado.nextLine());
			String nome = teclado.nextLine();
			ContaCorrente Cont = new ContaCorrente(agencia, nome);
			int menu = 0;
			while (menu != 5) {
				System.out.println("Operaçoes: Sacar(1) Depositar(2) Saldo(3)");
				menu = Integer.parseInt(teclado.nextLine());
				switch (menu) {
				case 1:
					System.out.println("Digite o valor para sacar");
					double montanteSaque = Double.parseDouble(teclado.nextLine());
					System.out.println("Realizado :" + Cont.sacar(montanteSaque));
					break;
				case 2:
					System.out.println("Digite o valor para depositar");
					double montanteDeposito = Double.parseDouble(teclado.nextLine());
					System.out.println("Realizado :" + Cont.depositar(montanteDeposito));
					break;
				case 3:
					System.out.println("Saldo : " + Cont.getSaldo());
					break;
				default:
					menu = 5;
					break;
				}
			}

		}
		case 2: {
			System.out.println("digite a agencia e o titular da conta");
			int agencia = Integer.parseInt(teclado.nextLine());
			String nome = teclado.nextLine();
			ContaPoupanca Cont = new ContaPoupanca(agencia, nome);
			int menu = 0;
			while (menu != 5) {
				System.out.println("Operaçoes: Sacar(1) Depositar(2) Saldo(3)");
				menu = Integer.parseInt(teclado.nextLine());
				switch (menu) {
				case 1:
					System.out.println("Digite o valor para sacar");
					double montanteSaque = Double.parseDouble(teclado.nextLine());
					System.out.println("Realizado :" + Cont.sacar(montanteSaque));
					break;
				case 2:
					System.out.println("Digite o valor para depositar");
					double montanteDeposito = Double.parseDouble(teclado.nextLine());
					System.out.println("Realizado :" + Cont.depositar(montanteDeposito));
					break;
				case 3:
					System.out.println("Saldo : " + Cont.getSaldo());
					break;
				default:
					menu = 5;
					break;
				}
			}
		}
		}
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	        int[] conta = new int[10];
	        double[] saldo = new double[10];
	        int i, j, codigo, op;
	        double valor, soma;
	        boolean achou;

	        for (i = 0; i < 10; i++) {
	            achou = false;

	            do {
	                System.out.print("Digite o número da conta [" + (i + 1) + "]: ");
	                conta[i] = sc.nextInt();

	                for (j = 0; j < i; j++) {
	                    if (conta[i] == conta[j]) {
	                        achou = true;
	                        System.out.println("Conta já cadastrada. Digite novamente.");
	                        break;
	                    }
	                }
	            } while (achou);

	            System.out.print("Digite o saldo da conta [" + (i + 1) + "]: ");
	            saldo[i] = sc.nextDouble();
	        }

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Realizar depósito");
	            System.out.println("2 - Realizar saque");
	            System.out.println("3 - Consultar saldo total");
	            System.out.println("4 - Sair");
	            System.out.print("Digite a opção desejada: ");
	            op = sc.nextInt();
	            achou = false;

	            if (op == 1) {
	                System.out.print("Digite o número da conta: ");
	                codigo = sc.nextInt();
	                System.out.print("Digite o valor do depósito: ");
	                valor = sc.nextDouble();

	                for (i = 0; i < 10; i++) {
	                    if (codigo == conta[i]) {
	                        saldo[i] += valor;
	                        achou = true;
	                        System.out.println("Depósito efetuado.");
	                        break;
	                    }
	                }

	                if (!achou) {
	                    System.out.println("Conta não cadastrada.");
	                }
	            } else if (op == 2) {
	                System.out.print("Digite o número da conta: ");
	                codigo = sc.nextInt();
	                System.out.print("Digite o valor do saque: ");
	                valor = sc.nextDouble();

	                for (i = 0; i < 10; i++) {
	                    if (codigo == conta[i]) {
	                        if (saldo[i] < valor) {
	                            System.out.println("Saldo insuficiente.");
	                        } else {
	                            saldo[i] -= valor;
	                            achou = true;
	                            System.out.println("Saque efetuado.");
	                        }
	                        break;
	                    }
	                }

	                if (!achou) {
	                    System.out.println("Conta não cadastrada.");
	                }
	            } else if (op == 3) {
	                soma = 0;

	                for (i = 0; i < 10; i++) {
	                    soma += saldo[i];
	                }

	                System.out.println("Saldo total: " + soma);
	            } else if (op < 1 || op > 4) {
	                System.out.println("Opção inválida.");
	            }
	        } while (op != 4);

	}

}

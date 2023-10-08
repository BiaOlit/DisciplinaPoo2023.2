package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 double numero1, numero2, resultado;
		 int opção;
		
		 Scanner sc = new Scanner(System.in);

	     System.out.println("MENU DE OPÇÕES");
	     System.out.println("1 - Média entre os números digitados");
	     System.out.println("2 - Diferença do maior pelo menor");
	     System.out.println("3 - Produto entre os números digitados");
	     System.out.println("4 - Divisão do primeiro pelo segundo");
	     System.out.println("Escolha uma opção:");
	     opção = sc.nextInt();

	      if (opção >= 1 && opção <= 4) {
	          System.out.print("Digite o primeiro número: ");
	          numero1 = sc.nextDouble();

	          System.out.print("Digite o segundo número: ");
	          numero2 = sc.nextDouble();

	          if (opção== 1) {
	             resultado = (numero1 + numero2) / 2;
                 System.out.println("Média entre os números: " + resultado);
	            } else if (opção == 2) {
                   resultado = Math.abs(numero1 - numero2);
                   System.out.println("Diferença do maior pelo menor: " + resultado);
	            } else if (opção == 3) {
	                resultado = numero1 * numero2;
	                System.out.println("Produto entre os números: " + resultado);
	            } else if (opção == 4) {
	                if (numero2 != 0) {
	                    resultado = numero1 / numero2;
	                    System.out.println("Divisão do primeiro pelo segundo: " + resultado);
	                } else {
	                    System.out.println("Erro! Divisão por zero não permitida.");
	                }
	            }
	        } else {
	            System.out.println("Erro! Opção inválida.");
	        }

	}

}

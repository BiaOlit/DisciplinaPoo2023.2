package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double peso_saco, racao_gato1, racao_gato2, total_final;
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o peso do saco de ração (em kg): ");
	     peso_saco = sc.nextDouble();

	     System.out.print("Digite a quantidade de ração consumida pelo gato 1 (em gramas): ");
	     racao_gato1 = sc.nextDouble() / 1000.0;

	     System.out.print("Digite a quantidade de ração consumida pelo gato 2 (em gramas): ");
	     racao_gato2 = sc.nextDouble() / 1000.0;

	     total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);

	     System.out.println("O total final de ração no saco é: " + total_final + " kg");
	     
	     
	  }
	}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double dep, rend, total, taxa;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do depósito: ");
		dep = sc.nextDouble();
		System.out.print("Digite o valor da taxa de juros: ");
		taxa = sc.nextDouble();
	
		rend = dep * taxa/100;
		total = dep + rend;
		System.out.println("O valor de rendimento será: " + rend);
		System.out.println("O valor total após o rendimento será: " + total);

	}

}

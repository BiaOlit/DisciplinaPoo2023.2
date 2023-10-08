package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double custo, convite, qtd_convites;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do custo espetáculo: ");
		custo = sc.nextDouble();
		System.out.println("Digite o preço dos convites: ");
		convite = sc.nextDouble();
		
		
		qtd_convites = custo/convite;
		System.out.println("A quantidade de convites necessários a serem vendidos é: " + qtd_convites);
		

	}

}

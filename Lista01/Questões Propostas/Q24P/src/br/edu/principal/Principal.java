package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double reais, dolares, marco, libra;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de dinheiro em reais: ");
		reais = sc.nextDouble();
		
		dolares = reais/1.80;
		marco = reais/2.00;
		libra = reais/3.57;
		
		System.out.println("Conversão para dólares: " + dolares);
		System.out.println("Conversão para marco alemâo: " + marco);
		System.out.println("Conversão para libra esterlina: " + libra);
		
		
		
		
	}

}

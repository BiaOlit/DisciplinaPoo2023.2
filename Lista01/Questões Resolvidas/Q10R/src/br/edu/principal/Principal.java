package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double area, raio;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		area = 3.1415 * Math.pow( raio,2);
		
		System.out.println("A área do círculo será: " + area);
				
	}

}

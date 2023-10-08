package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int base, altura, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		base = sc.nextInt();
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextInt();
		
		area = (base * altura)/2;
		
		System.out.println("Área do triângulo: " + area);
		

	}

}

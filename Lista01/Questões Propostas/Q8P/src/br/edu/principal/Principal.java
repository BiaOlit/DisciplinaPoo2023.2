package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double kg,gramas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu peso em quilos: ");
		kg = sc.nextDouble();
		 
		gramas = kg*1000;
	
		System.out.println("O seu peso em gramas será: " + gramas);
		
	}

}

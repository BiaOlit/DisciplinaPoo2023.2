package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double peso, peso_engordar, peso_emagrecer;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o peso: ");
		peso = sc.nextDouble();
		
		peso_engordar = peso + (15.0/100.0 * peso);
		peso_emagrecer = peso - (20.0/100.0 * peso);
		
		System.out.println("Se a pessoa engordar 15%, o novo peso será: " + peso_engordar);
		System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + peso_emagrecer);
		
		
		
		

	}

}

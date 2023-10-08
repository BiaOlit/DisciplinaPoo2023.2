package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		double num1,num2,r1,r2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um primeiro número(maior do que zero): ");
		num1 = sc.nextDouble();
		System.out.print("Digite um segundo número(maior do que zero): ");
		num2 = sc.nextDouble();
		
		r1 = Math.pow(num1,num2);
		r2 = Math.pow(num2, num1);
	
		
		System.out.println("1º elevado ao 2º : " + r1);
		System.out.println("2º elevado ao 1º : " + r2);
		

	}

}

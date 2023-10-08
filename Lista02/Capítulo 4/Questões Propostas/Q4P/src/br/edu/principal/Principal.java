package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2, num3, maior;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior número é: " + num2);
		}
		else if(num3 > num1 && num3 > num2) {
			System.out.println("O maior número é: " + num3);
			
		}
			
	}

}

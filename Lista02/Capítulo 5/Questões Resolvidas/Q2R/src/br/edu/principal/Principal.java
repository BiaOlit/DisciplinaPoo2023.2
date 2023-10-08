package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Informe um valor inteiro positivo N: ");
		        int N = sc.nextInt();

		        double E = 1.0; 
		        double fatorial = 1.0;

		        for (int i = 1; i <= N; i++) {
		            fatorial *= i; 
		            E += 1.0 / fatorial; // 
		        }

		        System.out.println("O valor de E é: " + E);

	}

}

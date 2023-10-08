package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double bmaior, bmenor, altura,area;
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o valor da base maior do trapézio: ");
	bmaior = sc.nextDouble();
	System.out.print("Digite o valor da base menor do trapézio: ");
	bmenor = sc.nextDouble();
	System.out.print("Digite o valor da altura do trapézio: ");
	altura = sc.nextDouble();
	
	area = ((bmaior + bmenor)*altura)/2;
	System.out.println("A área do trapézio é: " + area);
	
	}

}

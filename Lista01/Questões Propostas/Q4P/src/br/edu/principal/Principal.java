package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1,n2,peso1,peso2,média;
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite a primeira nota: ");
	    n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		
		peso1 = 2;
		peso2 = 3;
	    média = (n1*peso1 + n2*peso2)/peso1+peso2;
		
		System.out.println("A média ponderada das notas: " + média);
		
	}

}

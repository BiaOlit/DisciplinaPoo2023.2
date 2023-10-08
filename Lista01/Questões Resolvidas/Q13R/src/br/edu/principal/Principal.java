package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double pés, polegadas,jardas,milha;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Medida em pés: ");
		pés = sc. nextDouble();
		
		 polegadas = pés*12;
		 jardas = pés/3;
		 milha = jardas / 1760;
		
		
		System.out.println( pés + "pés = " + polegadas + " polegadas");
		System.out.println( pés + " pés = " + jardas + " jardas");
		System.out.println( pés + " pés = " + milha + " milhas");
		
		
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura: ");
		double alt = sc.nextDouble();
		System.out.println("Digite o peso: ");
		double peso = sc.nextDouble();
		
		if(alt < 1.20) {
			if(peso <= 60) {
				System.out.println("A");
			}
			if(peso > 60 && peso <= 90) {
				System.out.println("D");
			}
			if(peso > 90) {
				System.out.println("G");
				
			}
			
			}
			
		if(alt >= 1.20 && alt<= 1.70) {
			if(peso <= 60) {
				System.out.println("B");
			}
			if(peso > 60 && peso<= 90) {
				System.out.println("E");
			}
			if(peso>90) {
				System.out.println("H");	
			}
			
		    }
		
		if(alt>1.70) {
			if(peso<=60) {
				System.out.println("C");
			}
			if(peso>60 && peso<= 90);
				System.out.println("F");
			}
			if(peso>90) {
				System.out.println("I");
		}
	}

}



	
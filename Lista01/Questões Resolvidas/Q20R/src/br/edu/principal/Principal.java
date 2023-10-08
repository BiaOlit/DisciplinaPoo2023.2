package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	 double ang, alt, radiano, escada;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Digite a medida do ângulo: ");
	 ang = sc.nextDouble();
	 System.out.println("Digite a altura da parede: ");
	 alt = sc.nextDouble();
	 
     
     radiano = ang * 3.14 / 180;
     escada = alt / Math.sin(radiano);
     
     System.out.println("Medida da escada: " +escada);
     
	} 

}



package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double alt_degraus, alt_usuario,qtd_degraus;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura do degrau (em metros): ");
		alt_degraus = sc.nextDouble();
		System.out.println("Digite a altura do usuário (em metros): ");
		alt_usuario = sc.nextDouble();
		
		qtd_degraus = (int)alt_usuario / alt_degraus;
	
		System.out.println("A pessoa deverá subir " + qtd_degraus + " degraus");
	
	
	}
	

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double hora, conversao, m;
		int h;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma hora (hora e minutos): ");
		hora = sc.nextDouble();
		
		 h = (int)hora;
		 m = hora - h;
		 conversao = (h * 60) + (m * 100);
		System.out.println("A conversão em minutos será: " + conversao);

	}

}

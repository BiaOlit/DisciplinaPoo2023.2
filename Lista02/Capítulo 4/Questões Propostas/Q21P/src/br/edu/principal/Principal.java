package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco;
		int codigo_origem; 
		String procedencia;
		
		 Scanner sc = new Scanner(System.in);

		 	System.out.println("Digite o preço do produto: ");
		 	preco = sc.nextDouble();
	        System.out.print("Digite o código de origem do produto: ");
	        codigo_origem = sc.nextInt();

	        if (codigo_origem == 1) {
	            procedencia = "Sul";
	        } else if (codigo_origem == 2) {
	            procedencia = "Norte";
	        } else if (codigo_origem == 3) {
	            procedencia = "Leste";
	        } else if (codigo_origem == 4) {
	            procedencia = "Oeste";
	        } else if (codigo_origem == 5 || codigo_origem == 6) {
	            procedencia = "Nordeste";
	        } else if (codigo_origem == 7 || codigo_origem == 8 ||codigo_origem == 9) {
	            procedencia = "Sudeste";
	        } else if (codigo_origem >= 10 && codigo_origem <= 20) {
	            procedencia = "Centro-Oeste";
	        } else if (codigo_origem >= 21 && codigo_origem <= 30) {
	            procedencia = "Nordeste";
	        } else {
	            procedencia = "Origem desconhecida";
	        }

	        System.out.println("A procedência do produto é: " + procedencia);

		
		
	}

}

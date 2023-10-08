package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int contador = 0;
	        double somaAlturas = 0;

	        while (true) {
	            System.out.println("Digite a idade da pessoa (ou 0 para encerrar):");
	            int idade = sc.nextInt();

	            if (idade <= 0) {
	                break; 
	            }

	            System.out.println("Digite a altura da pessoa (em metros):");
	            double altura = sc.nextDouble();

	            if (idade > 50) {
	                somaAlturas += altura;
	                contador++;
	            }
	        }

	        if (contador > 0) {
	            double mediaAlturas = somaAlturas / contador;
	            System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAlturas + " metros");
	        } else {
	            System.out.println("Não foram inseridas alturas de pessoas com mais de 50 anos.");
	        }

	       
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        double nota1, nota2, nota3, media;
	        char letra;

	        System.out.print("Digite a primeira nota: ");
	        nota1 = sc.nextDouble();
	        System.out.print("Digite a segunda nota: ");
	        nota2 = sc.nextDouble();
	        System.out.print("Digite a terceira nota: ");
	        nota3 = sc.nextDouble();

	        do {
	            System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
	            letra = sc.next().charAt(0);
	        } while (letra != 'A' && letra != 'P');

	        media = calculaMedia(nota1, nota2, nota3, letra);

	        if (letra == 'A') {
	            System.out.println("A média aritmética é " + media);
	        } else {
	            System.out.println("A média ponderada é " + media);
	        }

	    }

	    public static double calculaMedia(double n1, double n2, double n3, char l) {
	        double media;
	        if (l == 'A') {
	            media = (n1 + n2 + n3) / 3;
	        } else {
	            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
	        }
	        return media;
	}

}

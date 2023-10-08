package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int cont, tr = 0, te = 0, ta = 0;
	        double media, totalClasse = 0, mediaClasse;

	        for (cont = 1; cont <= 6; cont++) {
	            System.out.print("Digite a nota 1: ");
	            double n1 = sc.nextDouble();
	            System.out.print("Digite a nota 2: ");
	            double n2 = sc.nextDouble();

	            media = (n1 + n2) / 2;
	            System.out.println("Média: " + media);

	            if (media <= 3) {
	                tr++;
	                System.out.println("Reprovado");
	            } else if (media > 3 && media < 7) {
	                te++;
	                System.out.println("Exame");
	            } else {
	                ta++;
	                System.out.println("Aprovado");
	            }

	            totalClasse += media;
	        }

	        System.out.println("Total de Reprovados: " + tr);
	        System.out.println("Total de Exames: " + te);
	        System.out.println("Total de Aprovados: " + ta);

	        mediaClasse = totalClasse / 6;
	        System.out.println("Média da Classe: " + mediaClasse);
	        
	  
	}

}

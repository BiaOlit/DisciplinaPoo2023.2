package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double nota1, nota2, nota3, media, nota_exame;
	       System.out.print("Digite a primeira nota: ");
	       nota1 = sc.nextDouble();
	       System.out.print("Digite a segunda nota: ");
	       nota2 = sc.nextDouble();
	       System.out.print("Digite a terceira nota: " );
	       nota3 = sc.nextDouble();
	       
	       media=(nota1+nota2+nota3)/3;
	       System.out.println("Media aritmética: " + media);
	       
	       if (media>=0 && media < 3) {
	    	   System.out.println("Reprovado");       }
	       
	       if (media>=3 && media < 7) {
	    	  System.out.println("Você terá que fazer outro exame");   
	    	  nota_exame = 12 - media; 
	    	  System.out.println("Você deve tirar "+ nota_exame +" para passar");
	       }
	          
	       if (media>=7 && media < 10) {
	     	  System.out.println("Aprovado");   }

	}

}

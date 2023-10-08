package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	double nota1, nota2, nota3, media;
	
	Scanner sc = new Scanner(System.in);
	  System.out.print("Digite o primeiro número: ");
	  nota1 = sc.nextDouble();
	  System.out.print("Digite o segundo número: ");
	  nota2 = sc.nextDouble();
	  System.out.print("Digite o terceiro número: ");
	  nota3 = sc.nextDouble();
	  media = (nota1 + nota2 +nota3)/3;
		
	  System.out.println( "A média das notas é: " + media);
		
		
	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double a,b,c, delta, x1, x2;
 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um valor para a: ");
		a = sc.nextInt();
		System.out.print("Entre com um valor para b: ");
		b = sc.nextInt();
		System.out.print("Entre com um valor para c: ");
		c = sc.nextInt();
		delta = (Math.pow(b,2)-(4*a*c));
		
		if (a == 0) {
			System.out.println("Esses valores não formam uma equação de segundo grau");
		}
		if(delta == 0) {
				System.out.println("Existe uma raiz real");
				x1 =(-b)/(2*a);
				System.out.println("Raiz: " + x1);
		}
	
		if (delta >  0) {
				System.out.println("Existem duas raizes reais");
				x1 =(-b+(Math.sqrt(delta) / (2*a)));
				x2 =(-b-(Math.sqrt(delta) / (2*a)));
				System.out.println("As raizes sao: " +x1 +" e " +x2);
		}else {
			System.out.println("Não existem raízes reais");
			
			
		}
	}

	}

// revisar!! refazer


	



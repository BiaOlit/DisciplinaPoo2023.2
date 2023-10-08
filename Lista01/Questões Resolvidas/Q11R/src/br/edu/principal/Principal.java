package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	double num,quad,cubo,rquad,rcub;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite um número positivo e maior do que zero: ");
	num = sc.nextDouble();
	
	quad = Math.pow(num, 2);
	cubo = Math.pow(num,3);
	rquad = Math.sqrt(num);
	rcub = Math.cbrt(num);
	
	System.out.println("Número ao quadrado: " + quad);
	System.out.println("Número ao cubo: " + cubo);
	System.out.println("Raiz quadrada do número: " + rquad);
	System.out.println("Raiz cúbica do número: " + rcub);
		
		
	}

}	
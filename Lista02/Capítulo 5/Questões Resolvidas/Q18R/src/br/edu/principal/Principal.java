package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		double num, quad, cubo, raiz;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = sc.nextDouble();
        
        while (num > 0) {
            quad = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);
            
            System.out.println("Quadrado: " + quad);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz Quadrada: " + raiz);
            
            System.out.println("Digite outro número (ou 0 para sair): ");
            num = sc.nextDouble();
        }
        
        
	}

}

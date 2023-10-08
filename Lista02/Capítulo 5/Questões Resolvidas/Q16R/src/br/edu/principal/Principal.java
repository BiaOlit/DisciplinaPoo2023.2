package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area;
		
		do {
            System.out.println ("Digite a base do triângulo: ");
            base = sc.nextDouble();
            
        } while (base <= 0);
        
        do {
            System.out.println("Digite a altura do triângulo: ");
            altura = sc.nextDouble();
            
        } while (altura <= 0);
        
        area = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: " + area);
        
	}

}

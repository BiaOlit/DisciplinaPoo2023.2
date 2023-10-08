package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2, divisao1, outronum, divisao2;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Digite um primeiro número: ");
	     num1 = sc.nextDouble();
	     System.out.print("Digite um segundo número: ");
   	     num2 = sc.nextDouble();
   	     
	     if(num2 == 0){ 
	    	System.out.println("Erro! O segundo número não pode ser zero.");
	    	System.out.print("Digite outro número: ");
	    	outronum = sc.nextDouble();
	    	divisao1 = num1/outronum;
	    	System.out.println("A divisão dos dois números é: " + divisao1);
	    	
	     } else {
	    	 divisao2 = num1/num2;
	     	 System.out.println("A divisão dos dois números é: " + divisao2);
	     }
	    
	     
	     
	}
}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double num1, num2, soma, raiz, op;

	   Scanner sc = new Scanner(System.in);
	   
       System.out.println(" MENU ");
       System.out.println(" 1- Somar dois números");
       System.out.println(" 2- Raiz quadrada de um número");
       System.out.print(" Digite a sua opção: ");
       op = sc.nextDouble();
       
       if(op == 1) {
    	   System.out.print("Digite um valor para o primeiro número: ");
    	   num1 = sc.nextDouble();
           System.out.print("Digite um valor para o segundo número: ");
           num2 = sc.nextDouble();
           soma = num1 + num2;
           System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
       }           
       
       if (op == 2){
    	   System.out.print("Digite um valor: ");
    	   num1 = sc.nextInt();
           raiz = Math.sqrt(num1);
           System.out.println(" A raiz quadrada de " + num1 + " é: " + raiz);
          
       }
       
       if (op!= 1 && op!= 2) {
    	   System.out.println(" Opção inválida! ");
		
	}


	}

}

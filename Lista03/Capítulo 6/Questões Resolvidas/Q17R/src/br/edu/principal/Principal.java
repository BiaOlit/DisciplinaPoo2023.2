package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        int[] num = new int[6];
	        int soma = 0;
	        boolean achouPar = false;
	        boolean achouImpar = false;
	        int qtdeImpares = 0;
	        
	        for (int i = 0; i < 6; i++) {
	            System.out.print("Informe um número: ");
	            num[i] = sc.nextInt();
	        }
	        
	        for (int i = 0; i < 6; i++) {
	            if (num[i] % 2 == 0) {
	                achouPar = true;
	                System.out.println(num[i] + " na posição " + i);
	                soma += num[i];
	            }
	        }
	        
	        if (!achouPar) {
	            System.out.println("Nenhum número par foi digitado.");
	        } else {
	            System.out.println("Soma dos pares = " + soma);
	        }
	        
	        for (int i = 0; i < 6; i++) {
	            if (num[i] % 2 != 0) {
	                achouImpar = true;
	                System.out.println(num[i] + " na posição " + i);
	                qtdeImpares++;
	            }
	        }
	        
	        if (!achouImpar) {
	            System.out.println("Nenhum número ímpar foi digitado.");
	        } else {
	            System.out.println("Quantidade de ímpares = " + qtdeImpares);
	        }
	        
		

	}

}

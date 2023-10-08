package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        int m, n, soma, i;
	        
	        System.out.println("Digite o valor de m: ");
	        m = sc.nextInt();
	        
	        System.out.println("Digite o valor de n: ");
	        n = sc.nextInt();
	        
	        while (m < n) {
	            soma = 0;
	            
	            for (i = m; i <= n; i++) {
	                soma += i;
	            }
	            
	            System.out.println("A soma dos números de " + m + " a " + n + " é: " + soma);
	            
	         break;
	        }
	        
	}
	}



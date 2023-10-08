package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do trabalho de laboratório: ");
        double nota_trab = sc.nextDouble();
        System.out.print("Digite a nota da avaliação semestral: ");
        double aval_sem = sc.nextDouble();
        System.out.print("Digite a nota do exame final: ");
        double exame = sc.nextDouble();
     
        
       int peson_trab = 2;
       int pesoa_sem  = 3;
       int pesoexame = 5;
       
       
        double media = (nota_trab * peson_trab + aval_sem * pesoa_sem + exame*pesoexame)/10;
        System.out.println("Média Ponderada: " + media);
        
        if (media >= 8 && media <= 10) { 
        	System.out.println("Você obteve o conceito A");
        	
        }
        
        if (media >=7 && media<8) {
        	System.out.println("Você obteve o conceito B");
        }
        
        if (media >= 6 && media < 7) { 
        	System.out.println("Você obteve o conceito C");
        	
        }
        
        if (media >= 5 && media < 6) { 
        	System.out.println("Você obteve o conceito D");
        	
        }
        
        if (media >= 0 && media < 5) { 
        	System.out.println("Você obteve o conceito E");
        	
        }
        
        }
	


	}



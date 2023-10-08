package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double op, sal, imp, aum = 0, novo_sal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Imposto");
		System.out.println("2 - Novo salário");
		System.out.println("3 - Classificação");
		System.out.println("Digite a opção desejada: ");
		op = sc.nextDouble();
		System.out.print("Digite o valor do salário: ");
		sal = sc.nextDouble();
		
		if(op == 1) {
			if (sal < 500){
				imp = sal * 5/100;
			}
			else if(sal >= 500 && sal <= 850) {
				imp = sal * 10/100;
			}
			else {
				imp = sal * 15/100;
			
		      System.out.println("Valor do imposto: " + imp);
			}
		}
		else if (op == 2) {
			if(sal > 1500) {
					 aum = 25;
			} 
			else if(sal >= 750 && sal <= 1500) {
					 aum = 50;
			}
			else if(sal >= 450 && sal < 750) {
					 aum = 75;
			}
			else {
					 aum = 100;
			}
			novo_sal = sal + aum;
					
			System.out.println("O novo salário é: " + novo_sal);			 	
		 }
		else if(op == 3) {
			if(sal <= 700) {
				System.out.println("Mal Remunerado");
			}
			else { 
				System.out.println("Bem Remunerado");
			}
		}
				
		
		if(op<1||op>3) {
			System.out.println("Opção Inválida");		}
		
				 }
					 
			  }
		
		  


	

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 double salario,aumento,novosal;
	 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o valor do salário: ");
		 salario = sc.nextDouble();
		 aumento = salario * 25/100;
		 novosal = salario + aumento;
		
		System.out.println("O novo salário será " + novosal + " reais. ");

	}

}

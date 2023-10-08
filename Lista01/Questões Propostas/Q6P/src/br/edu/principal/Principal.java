package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	 double salario, vlr_vendas, comissao, sal_final;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Digite o valor do salário fixo: ");
	 salario = sc.nextDouble();
	 System.out.print("Digite o valor das vendas: ");
	 vlr_vendas = sc.nextDouble();
	 
	 comissao = 0.04 * vlr_vendas;
	 sal_final = salario + comissao;
	 
	 System.out.println("Comissão: " + comissao);
	 System.out.println("O salário final será " + sal_final + " reais");
	 
		

	}

}

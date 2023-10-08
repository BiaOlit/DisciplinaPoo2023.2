package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double salbase, grat,imp,salreceber;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do salário: ");
		salbase = sc.nextDouble();
		
	    grat = salbase * 5/100;
	    imp = salbase * 7/100;
		salreceber = grat + salbase - imp;
		
		System.out.println("O novo salário a ser recebido será " + salreceber + " reais ");

	}

}

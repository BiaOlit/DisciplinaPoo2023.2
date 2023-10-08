package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double sal,imp,salreceber;
		int grat;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do salário: ");
		sal = sc.nextDouble();
		grat = 50;
		imp = sal * 10/100;
		salreceber = sal + grat - imp;
		
		System.out.println("O novo salário após a mudança será " + salreceber + " reais ");
		
		
		
	}
}

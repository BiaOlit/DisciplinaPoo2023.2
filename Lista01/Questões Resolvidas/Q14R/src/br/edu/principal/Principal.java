package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int ano_atual, ano_nasc, idade_atual, idade_2050;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento: ");
		ano_nasc = sc.nextInt();
		System.out.print("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		 
		 idade_atual = ano_atual - ano_nasc;
		 idade_2050 = 2050 - ano_nasc;
		
		System.out.println("Idade Atual: " + idade_atual);
		System.out.println("Idade em 2050: " + idade_2050);


	}

}

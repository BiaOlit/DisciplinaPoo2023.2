package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double peso_quilos,peso_gramas, pre_total, imp, valor_total, pre_grama;
		int cod_prod, cod_país;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto (1 a 10): ");
		cod_prod = sc.nextInt();
		System.out.println("Digite o peso do produto em quilos: ");
		peso_quilos = sc.nextDouble();
		System.out.println("Digite o código do país (1 a 3): ");
		cod_país = sc.nextInt();
		
		peso_gramas = peso_quilos * 1000;
		System.out.println("Peso do produto em gramas: " + peso_gramas);
		
		if (cod_prod >= 1 && cod_prod <=4) {
			pre_grama = 10;
		}
		else if(cod_prod >= 5 && cod_prod <=7) {
			pre_grama = 25;
		}
		else if(cod_prod >= 8 && cod_prod <= 10) {
			pre_grama = 35;
		}
		else {
			pre_grama = 0;
		}
		
		pre_total = peso_gramas * pre_grama;
		System.out.println("O preço total é:" + pre_total + " reais");
		
		if(cod_país == 1) {
			imp = 0;
		}
		else if(cod_país == 2) {
			imp = pre_total * 15/100;
		}
		else if(cod_país == 3) {
			imp = pre_total * 25/100;
		}
		else {
			imp = 0;
		}
		System.out.println("Imposto: " + imp);
		
		valor_total = pre_total + imp;
		System.out.println("O valor total será: " + valor_total + " reais");
			
		
		}
		
		
				

	}



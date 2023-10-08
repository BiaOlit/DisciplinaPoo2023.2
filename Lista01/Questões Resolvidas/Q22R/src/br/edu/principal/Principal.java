package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double vlr_salmin, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mínimo: ");
		vlr_salmin = sc.nextDouble();
		System.out.println("Digite a quantidade de quilowatts consumida por uma residência: ");
		qtd_kw = sc.nextDouble();
		
	    vlr_kw = vlr_salmin / 5;
	    vlr_reais = vlr_kw * qtd_kw;
	    desc = vlr_reais * 15 / 100;
	    vlr_desc = vlr_reais - desc;
		
		System.out.println("Valor por quilowatt: " + vlr_kw);
		System.out.println("Valor a ser pago por essa residência: " + vlr_reais);
		System.out.println("Valor com desconto de 15%: " + vlr_desc);


	}

}

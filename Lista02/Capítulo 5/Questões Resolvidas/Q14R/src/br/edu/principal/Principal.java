package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
	       double valorInicial, juros, valor_parc, total, valor_juros, num_parc, i;

			System.out.println("Digite o valor inicial da divida: ");
			valorInicial = sc.nextDouble();

			juros = 0;
			num_parc = 1;
			total = valorInicial;
			valor_parc = valorInicial;

			System.out.println("Valor total inicial: "+ total);
			System.out.println("Valor inicial de juros: " + juros);
			System.out.println("Número inicial de parcelas: "+ num_parc);
			System.out.println("Valor inicial da parcela: " + valor_parc);

			juros = juros + 10;
			num_parc = num_parc + 2;

			for (i = 1; i <= 4; i++) {
				valor_juros = valorInicial * juros / 100;
				total = valorInicial + valor_juros;
				valor_parc = total / num_parc;
				System.out.println("Valor total da dívida: " + total);
				System.out.println("Valor total dos juros: " + valor_juros);
				System.out.println("Número total de parcelas: " + num_parc);
				System.out.println("Valor total da parcela: " + valor_parc);
				juros = juros + 5;

	            break;
			}

	}

}

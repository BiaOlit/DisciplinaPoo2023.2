package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double hr_trab, vlr_salmin, vlr_hrtrab, vlr_salbru, imp,vlr_salliq;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de horas trabalhadas: ");
		hr_trab = sc.nextDouble();
		System.out.print("Valor do salário mínimo: ");
		vlr_salmin = sc.nextDouble();
		
		
		 vlr_hrtrab = vlr_salmin / 2;
		 vlr_salbru = hr_trab * vlr_hrtrab;
		 imp = vlr_salbru * 3/100;
		 vlr_salliq = vlr_salbru - imp;
		
		
		System.out.println("O salário a receber será: " + vlr_salliq + " reais."); 

	}

}

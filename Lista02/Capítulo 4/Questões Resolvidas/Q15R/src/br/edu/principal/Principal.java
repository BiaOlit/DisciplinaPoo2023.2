package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double sal_min, nht, ndep, nhet, sal_receber, vh,smes, vdep, vhe, imp = 0, sbruto, sliq, grat = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mínimo: ");
		sal_min = sc.nextDouble();
		System.out.println("Digite o número de horas trabalhadas: ");
		nht = sc.nextDouble();
		System.out.println("Digite o número de dependentes do funcionário: ");
		ndep = sc.nextDouble(); 
		System.out.println("Digite o número de horas extras trabalhadas: ");
		nhet = sc.nextDouble();
		
		vh = 1/5 * sal_min;
		smes = nht * vh;
		vdep = 32 * ndep;
		vhe = nhet * (vh +(vh*50/100));
		sbruto = smes + vdep + vhe;
		
		
		if(sbruto<200) {
			imp = 0;
		}
		else if(sbruto>=200 && sbruto <= 500) {
			imp = sbruto *10/100;
		}
		else if(sbruto> 500) {
			imp = sbruto * 20/100;
		}
		
		sliq = sbruto - imp;
		
		if(sliq <= 350) {
			grat = 100;
		}
		else if(sliq > 350){
			grat = 50;
		}
		
		sal_receber = sliq + grat;
		
		System.out.println("O salário a receber será: " + sal_receber);
		
	}
	

		
	}



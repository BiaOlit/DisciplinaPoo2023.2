package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	double sal_min, nht, coef_sal, sal_bru, imp, grat, aux, sal_liq;
	String turno, cat;
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o valor do salário mínimo: ");
	sal_min = sc.nextDouble();
	System.out.println("Digite o turno de trabalho: ");
	turno = sc.next();
	System.out.println("Digite a categoria:");
	cat = sc.next();
	System.out.println("Digite o número de horas trabalhadas:");
	nht = sc.nextDouble();
		
	if(turno.equals("M")) {
		coef_sal = 10.0/100 * sal_min;
	}
	else if(turno.equals("V")) {
		coef_sal = 15.0/100 * sal_min;
	}
	else if(turno.equals("N")) {
		coef_sal = 12.0/100 * sal_min;
	} else {
		coef_sal = 10;
	}
	System.out.println("O valor do coeficiente é: " + coef_sal);

	sal_bru = nht*coef_sal;
	
	if(cat.equals("O")) {
		if(sal_bru >= 300) {
			imp = 5.0/100 * sal_bru;
		  }	else {
			  imp = 3.0/100 * sal_bru;
		}
	}
		else {
			if(sal_bru >= 400) {
				imp = 6.0/100 * sal_bru;
			}
			else {
				imp = 4.0/100 * sal_bru;
			}
		}
	System.out.println(imp);
	
	
	if (turno == "N" && nht > 80) {
		grat = 50;
		
	} else {
		grat = 30;
	}
	System.out.println("Gratificação:" + grat);
	if (cat == "O" || coef_sal <=25) {
		aux = 1.0/3*sal_bru;
				
	} else {
		aux = 1.0/2*sal_bru;
	}
	System.out.println("Auxílio:" + aux);
	
	sal_liq = sal_bru - imp + grat + aux;
	System.out.println("Salário Líquido:" + sal_liq);
	
	if (sal_liq < 350) {
		System.out.println("Mal remunerado");
	} 
	if (sal_liq >=350 && sal_liq<= 600) {
		System.out.println("Normal");
	}
	if (sal_liq > 600){
		System.out.println("Bem remunerado");
	}
}
}
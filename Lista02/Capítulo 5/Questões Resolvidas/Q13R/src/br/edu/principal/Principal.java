package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
	        int i, numCriancas, meses, totMasculino, totFeminino, tot24;
	        double porcMasculino, porcFeminino, porc24;
	        String sexo;

	        System.out.print("Digite o número de crianças nascidas no período: ");
	        numCriancas = sc.nextInt();

	        totMasculino = 0;
	        totFeminino = 0;
	        tot24 = 0;

	        if (numCriancas == 0) {
	            System.out.println("NENHUMA CRIANÇA DIGITADA");
	        } else {
	            for (i = 1; i <= numCriancas; i++) {
	                System.out.print("Digite o sexo da " + i + "a criança (M/F): ");
	                sexo = sc.next();

	                System.out.print("Digite o tempo de vida (em meses) da " + i + "a criança: ");
	                meses = sc.nextInt();

	                if (sexo.equalsIgnoreCase("M")) {
	                    totMasculino++;
	                } else if (sexo.equalsIgnoreCase("F")) {
	                    totFeminino++;
	                }

	                if (meses <= 24) {
	                    tot24++;
	                }
	            }

	            porcMasculino = (double) totMasculino * 100 / numCriancas;
	            porcFeminino = (double) totFeminino * 100 / numCriancas;
	            porc24 = (double) tot24 * 100 / numCriancas;

	            System.out.println("Percentual de crianças do sexo feminino mortas: " + porcFeminino + "%");
	            System.out.println("Percentual de crianças do sexo masculino mortas: " + porcMasculino + "%");
	            System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc24 + "%");
	        }

	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	        double[] temp = new double[12];
	        int cont, maior_mes = 1, menor_mes = 1;
	        double maior =0, menor = 0;

	        for (cont = 1; cont <= 12; cont++) {
	            System.out.print("Digite a temperatura do mês " + cont + ": ");
	            temp[cont - 1] = sc.nextDouble();

	            if (cont == 1) {
	                maior = temp[0];
	                menor = temp[0];
	            } else {
	                if (temp[cont - 1] > maior) {
	                    maior = temp[cont - 1];
	                    maior_mes = cont;
	                }

	                if (temp[cont - 1] < menor) {
	                    menor = temp[cont - 1];
	                    menor_mes = cont;
	                }
	            }
	        }

	        System.out.println("Maior temperatura: " + maior);
	        switch (maior_mes) {
	            case 1:
	                System.out.println("Mês: JANEIRO");
	                break;
	            case 2:
	                System.out.println("Mês: FEVEREIRO");
	                break;
	            case 3:
	                System.out.println("Mês: MARÇO");
	                break;
	            case 4:
	                System.out.println("Mês: ABRIL");
	                break;
	            case 5:
	                System.out.println("Mês: MAIO");
	                break;
	            case 6:
	                System.out.println("Mês: JUNHO");
	                break;
	            case 7:
	                System.out.println("Mês: JULHO");
	                break;
	            case 8:
	                System.out.println("Mês: AGOSTO");
	                break;
	            case 9:
	                System.out.println("Mês: SETEMBRO");
	                break;
	            case 10:
	                System.out.println("Mês: OUTUBRO");
	                break;
	            case 11:
	                System.out.println("Mês: NOVEMBRO");
	                break;
	            case 12:
	                System.out.println("Mês: DEZEMBRO");
	                break;
	        }

	        System.out.println("Menor temperatura: " + menor);
	        switch (menor_mes) {
	            case 1:
	                System.out.println("Mês: JANEIRO");
	                break;
	            case 2:
	                System.out.println("Mês: FEVEREIRO");
	                break;
	            case 3:
	                System.out.println("Mês: MARÇO");
	                break;
	            case 4:
	                System.out.println("Mês: ABRIL");
	                break;
	            case 5:
	                System.out.println("Mês: MAIO");
	                break;
	            case 6:
	                System.out.println("Mês: JUNHO");
	                break;
	            case 7:
	                System.out.println("Mês: JULHO");
	                break;
	            case 8:
	                System.out.println("Mês: AGOSTO");
	                break;
	            case 9:
	                System.out.println("Mês: SETEMBRO");
	                break;
	            case 10:
	                System.out.println("Mês: OUTUBRO");
	                break;
	            case 11:
	                System.out.println("Mês: NOVEMBRO");
	                break;
	            case 12:
	                System.out.println("Mês: DEZEMBRO");
	                break;
	        }	
		

	}

}

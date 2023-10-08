
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int cont, cod, numVei, numAcid;
	        int maior = 0, menor = 0;
	        int cidMaior = 0, cidMenor = 0;
	        int somaVei = 0, somaAcid = 0;
	        int contAcid = 0;

	        for (cont = 1; cont <= 5; cont++) {
	            System.out.print("Informe o código da cidade: ");
	            cod = sc.nextInt();
	            System.out.print("Informe o número de veículos na cidade: ");
	            numVei = sc.nextInt();
	            System.out.print("Informe o número de acidentes na cidade: ");
	            numAcid = sc.nextInt();

	            if (cont == 1) {
	                maior = numAcid;
	                cidMaior = cod;
	                menor = numAcid;
	                cidMenor = cod;
	            } else {
	                if (numAcid > maior) {
	                    maior = numAcid;
	                    cidMaior = cod;
	                }
	                if (numAcid < menor) {
	                    menor = numAcid;
	                    cidMenor = cod;
	                }
	            }

	            somaVei += numVei;

	            if (numVei < 2000) {
	                somaAcid += numAcid;
	                contAcid++;
	            }
	        }

	        System.out.println("Cidade com maior número de acidentes: " + cidMaior + " - " + maior + " acidentes.");
	        System.out.println("Cidade com menor número de acidentes: " + cidMenor + " - " + menor + " acidentes.");

	        double mediaVei = (double) somaVei / 5;
	        System.out.println("Média de veículos por cidade: " + mediaVei);

	        if (contAcid == 0) {
	            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
	        } else {
	            double mediaAcid = (double) somaAcid / contAcid;
	            System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " + mediaAcid);
	      
	       
	        }
	    }
    }

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        int[] canais = {4, 5, 7, 12};
	        int[] audienciaTotal = {0, 0, 0, 0};
	        int totalGeral = 0;

	        while (true) {
	            System.out.println("Digite o número do canal (4, 5, 7, 12) ou 0 para encerrar:");
	            int canal = sc.nextInt();

	            if (canal == 0) {
	                break; 
	            }

	            if (canalValido(canal)) {
	                System.out.println("Digite o número de pessoas assistindo ao canal " + canal + ":");
	                int audiencia = sc.nextInt();

	                int indiceCanal = indiceDoCanal(canal);
	                audienciaTotal[indiceCanal] += audiencia;

	                
	                totalGeral += audiencia;
	            } else {
	                System.out.println("Canal inválido. Por favor, escolha um canal válido (4, 5, 7, 12).");
	            }
	        }

	       
	        System.out.println("Porcentagem de audiência de cada canal:");

	        for (int i = 0; i < canais.length; i++) {
	            double porcentagem = (double) audienciaTotal[i] / totalGeral * 100;
	            System.out.println("Canal " + canais[i] + ": " + porcentagem + "%");
	        }

	       ;
	    }

	    
	    public static boolean canalValido(int canal) {
	        int[] canaisValidos = {4, 5, 7, 12};
	        for (int i : canaisValidos) {
	            if (canal == i) {
	                return true;
	            }
	        }
	        return false;
	    }

	    
	    public static int indiceDoCanal(int canal) {
	        int[] canais = {4, 5, 7, 12};
	        for (int i = 0; i < canais.length; i++) {
	            if (canal == canais[i]) {
	                return i;
	            }
	        }
	        return -1;

	}

}

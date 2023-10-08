package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int[][] mat = new int[5][7];
	        int maior, menor, linha = 0, coluna = 0, cont = 0;

	      
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 7; j++) {
	                System.out.print("Digite o valor para mat[" + (i + 1) + "][" + (j + 1) + "]: ");
	                mat[i][j] = sc.nextInt();
	            }
	        }

	      
	        for (int i = 0; i < 5; i++) {
	            menor = mat[i][0];
	            linha = i;
	            coluna = 0;

	            
	            for (int j = 0; j < 7; j++) {
	                if (mat[i][j] < menor) {
	                    menor = mat[i][j];
	                    coluna = j;
	                }
	            }

	            maior = mat[0][coluna];

	          
	            for (int j = 0; j < 5; j++) {
	                if (mat[j][coluna] > maior) {
	                    maior = mat[j][coluna];
	                }
	            }

	      
	            if (menor == maior) {
	                System.out.println("Ponto de sela = " + maior + " na posição [" + (linha + 1) + "][" + (coluna + 1) + "]");
	                cont++;
	            }
	        }

	        if (cont == 0) {
	            System.out.println("Não existe ponto de sela nesta matriz");
	        }
	}

}

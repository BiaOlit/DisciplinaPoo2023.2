package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        int[][] mat = new int[8][8];
	        boolean simetria = true;

	        
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                System.out.print("Digite o valor para mat[" + (i + 1) + "][" + (j + 1) + "]: ");
	                mat[i][j] = sc.nextInt();
	            }
	        }

	       
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                if (mat[i][j] != mat[j][i]) {
	                    simetria = false;
	                    break;
	                }
	            }
	            if (!simetria) {
	                break;
	            }
	        }

	        if (simetria) {
	            System.out.println("Matr/iz Simétrica");
	        } else {
	            System.out.println("Matriz Assimétrica");
	        }

	}

}

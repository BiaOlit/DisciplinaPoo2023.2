package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int dp = 1, lin_ac = 1, col_ac = 2, lin_ab = 2, col_ab = 1;
        int num, r, cont_dp = 0, cont_ac = 0, cont_ab = 0;

        while (cont_ac < 10 || cont_ab < 10 || cont_dp < 5) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            r = num % 5;

            if (r == 0) {
                if (cont_dp < 5) {
                    mat[dp - 1][dp - 1] = num;
                    dp++;
                    cont_dp++;
                } else {
                    System.out.println("Não existe mais espaço para múltiplos de 5");
                }
            } else {
                r = num % 11;

                if (r == 0) {
                    if (cont_ac < 10) {
                        mat[lin_ac - 1][col_ac - 1] = num;
                        col_ac++;

                        if (col_ac > 5) {
                            lin_ac++;
                            col_ac = lin_ac + 1;
                        }

                        cont_ac++;
                    } else {
                        System.out.println("Não existe mais espaço para múltiplos de 11");
                    }
                } else {
                    r = num % 13;

                    if (r == 0) {
                        if (cont_ab < 10) {
                            mat[lin_ab - 1][col_ab - 1] = num;
                            col_ab++;

                            if (col_ab >= lin_ab) {
                                lin_ab++;
                                col_ab = 1;
                            }

                            cont_ab++;
                        } else {
                            System.out.println("Não existe mais espaço para múltiplos de 13");
                        }
                    } else {
                        System.out.println("Digite um número múltiplo de 5, 11 ou 13");
                    }
                }
            }
        }

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

	}

}

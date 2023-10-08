package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, qtd_b = 0, qtd_n = 0, qtd_c = 0;
        double preco, custo_est, imp, preco_final, adicional = 0, maior_p = 0, menor_p = 0, tot_imp = 0;

        for (i = 1; i <= 12; i++) {
            System.out.print("Informe o preço: ");
            preco = sc.nextDouble();

            System.out.print("Informe se possui refrigerante (S ou N): ");
            String refri = sc.next();

            System.out.print("Informe a categoria (A, L ou V): ");
            String categ = sc.next();

            if (preco <= 20) {
                if (categ.equals("A")) {
                    custo_est = 2;
                } 
                else if (categ.equals("L")) {
                    custo_est = 3;
                } 
                else if (categ.equals("V")) {
                    custo_est = 4;
                } 
                else {
                    custo_est = 0;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.equals("S")) {
                    custo_est = 6;
                } 
                else {
                    custo_est = 0;
                }
            } else {
                if (refri.equals("S")) {
                    if (categ.equals("A")) {
                        custo_est = 5;
                    } else if (categ.equals("L")) {
                        custo_est = 2;
                    } else if (categ.equals("V")) {
                        custo_est = 4;
                    } else {
                        custo_est = 0;
                    }
                } else {
                    if (categ.equals("A") || categ.equals("V")) {
                        custo_est = 0;
                    } 
                    else if (categ.equals("L")) {
                        custo_est = 1;
                    } 
                    else {
                        custo_est = 0;
                    }
                }
            }

            if (!categ.equals("A") && !refri.equals("S")) {
                imp = preco * 2 / 100;
            } 
            else {
                imp = preco * 4 / 100;
            }

            preco_final = preco + custo_est + imp;
            System.out.println("Custo Estimado: " + custo_est);
            System.out.println("Imposto: " + imp);
            System.out.println("Preço Final: " + preco_final);

            if (preco_final <= 20) {
                qtd_b++;
                System.out.println("Classificação: Barato");
            } 
            else if (preco_final > 20 && preco_final <= 100) {
                qtd_n++;
                System.out.println("Classificação: Normal");
            } 
            else {
                qtd_c++;
                System.out.println("Classificação: Caro");
            }

            adicional += custo_est + imp;
            tot_imp += imp;

            if (i == 1) {
                maior_p = preco_final;
                menor_p = preco_final;
            } 
            else {
                if (preco_final > maior_p) {
                    maior_p = preco_final;
                }
                if (preco_final < menor_p) {
                    menor_p = preco_final;
                }
            }
        }

        adicional /= 12;
        System.out.println("Adicional Médio: " + adicional);
        System.out.println("Maior Preço Final: " + maior_p);
        System.out.println("Menor Preço Final: " + menor_p);
        System.out.println("Total de Impostos: " + tot_imp);
        System.out.println("Quantidade de Produtos Baratos: " + qtd_b);
        System.out.println("Quantidade de Produtos Normais: " + qtd_n);
        System.out.println("Quantidade de Produtos Caros: " + qtd_c);
        


	}

}

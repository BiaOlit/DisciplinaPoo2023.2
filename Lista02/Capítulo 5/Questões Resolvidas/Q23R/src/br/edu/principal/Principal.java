package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        double sal, qtd, tipo, valorKw, gasto, acresc, total, totGeral = 0;
        int qtdCons = 0;
        
        totGeral = 0;
        qtdCons = 0;
        
        System.out.println("Digite o salário (ou 0 para sair): ");
        sal = sc.nextDouble();
        System.out.println("Digite a quantidade de consumidores (ou 0 para sair): ");
        qtd = sc.nextDouble();
        
        valorKw = sal / 8;
        
        while (qtd != 0) {
            gasto = qtd * valorKw;
            
            System.out.println("Digite o tipo (1, 2 ou 3): ");
            tipo = sc.nextDouble();
            
            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0;
            }
            
            total = gasto + acresc;
            totGeral += total;
            
            if (total >= 500 && total <= 1000) {
                qtdCons++;
            }
            
            System.out.println("Gasto: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total: " + total);
            
            System.out.println("Digite a quantidade de consumidores (ou 0 para sair): ");
            qtd = sc.nextDouble();
        }
        
        System.out.println("Total geral: " + totGeral);
        System.out.println("Quantidade de consumidores com conta entre 500 e 1000 reais: " + qtdCons);
        

	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtdPar = 0, somaPar = 0, qtdImpar = 0;
        double media = 0, mediaPar = 0, percImpar = 0;
        
        System.out.println("Digite um número (ou 30000 para sair): ");
        num = sc.nextInt();
        
        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
            
            soma += num;
            qtd++;
            
            if (num % 2 == 0) {
                somaPar += num;
                qtdPar++;
            } else {
                qtdImpar++;
            }
            
            System.out.println("Digite um número (ou 30000 para sair): ");
            num = sc.nextInt();
        }
        
        if (qtd == 0) {
            System.out.println("Nenhum número digitado");
        } else {
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade de números: " + qtd);
            media = (double) soma / qtd;
            System.out.println("Média: " + media);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            
            if (qtdPar == 0) {
                System.out.println("Nenhum número par digitado");
            } else {
                mediaPar = (double) somaPar / qtdPar;
                System.out.println("Média dos números pares: " + mediaPar);
            }
            
            percImpar = (double) qtdImpar * 100 / qtd;
            System.out.println("Porcentagem de números ímpares: " + percImpar + "%");
        }
        
        

	}

}

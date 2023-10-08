package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int aux;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado em ordem decrescente:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vet[i]);
        }


	}

}

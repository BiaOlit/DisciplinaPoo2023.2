package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] vetor = new int[25];

        for (int i = 0; i < 25; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor: ");
            vetor[i] = sc.nextInt();
        }

        substituicao(vetor);

        for (int i = 0; i < 25; i++) {
            System.out.println(vetor[i]);
        }

	    }

    public static void substituicao(int[] vet) {
        for (int z = 0; z < 25; z++) {
            if (vet[z] < 0) {
                vet[z] = 0;
            }
        }
	}

}

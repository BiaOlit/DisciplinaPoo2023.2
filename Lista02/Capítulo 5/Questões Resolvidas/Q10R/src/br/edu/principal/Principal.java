package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        int contTime, contJog, idade, qtde = 0, tot80 = 0;
        double peso, altura, mediaIdade = 0, mediaAltura = 0, porcentagem = 0;

        for (contTime = 1; contTime <= 5; contTime++) {
            mediaIdade = 0;

            for (contJog = 1; contJog <= 11; contJog++) {
                System.out.print("Digite a idade do jogador " + contJog + ": ");
                idade = sc.nextInt();
                System.out.print("Digite o peso do jogador " + contJog + ": ");
                peso = sc.nextDouble();
                System.out.print("Digite a altura do jogador " + contJog + ": ");
                altura = sc.nextDouble();

                if (idade < 18) {
                    qtde++;
                }

                mediaIdade += idade;
                mediaAltura += altura;

                if (peso > 80) {
                    tot80++;
                }
                break;
            }

            mediaIdade /= 11;
            System.out.println("Média de idade do time " + contTime + ": " + mediaIdade);
        }

        mediaAltura /= 55;
        System.out.println("Média de altura de todos os jogadores: " + mediaAltura);

        porcentagem = (tot80 * 100.0) / 55;
        System.out.println("Porcentagem de jogadores com peso superior a 80 kg: " + porcentagem + "%");

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);

        
	
	}
	

}

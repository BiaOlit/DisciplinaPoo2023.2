package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String[] sexo = new String[5];
        String[] olhos = new String[5];
        String[] cabelos = new String[5];
        int[] idade = new int[5];

        leitura(sexo, olhos, cabelos, idade);

        double m = media_idade(olhos, cabelos, idade);
        System.out.println("Média de idade das pessoas com olhos castanhos e cabelos pretos: " + m);

        int i = maior_idade(idade);
        System.out.println("Maior idade entre todas as pessoas: " + i);

        int q = qt_individuos(sexo, olhos, cabelos, idade);
        System.out.println("Quantidade de indivíduos do sexo feminino, com idade entre 18 e 35 anos, olhos azuis e cabelos loiros: " + q);
    }

    public static void leitura(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        Scanner sc = new Scanner(System.in);
        int x;

        for (x = 0; x < 5; x++) {
            do {
                System.out.print("Digite o sexo (M/F) da pessoa " + (x + 1) + ": ");
                sexo[x] = sc.nextLine();
            } while (!sexo[x].equals("F") && !sexo[x].equals("M"));

            do {
                System.out.print("Digite a cor dos olhos (A/C) da pessoa " + (x + 1) + ": ");
                olhos[x] = sc.nextLine();
            } while (!olhos[x].equals("A") && !olhos[x].equals("C"));

            do {
                System.out.print("Digite a cor dos cabelos (L/P/C) da pessoa " + (x + 1) + ": ");
                cabelos[x] = sc.nextLine();
            } while (!cabelos[x].equals("L") && !cabelos[x].equals("P") && !cabelos[x].equals("C"));

            System.out.print("Digite a idade da pessoa " + (x + 1) + ": ");
            idade[x] = sc.nextInt();
            sc.nextLine(); }
        
    }

    public static double media_idade(String[] olhos, String[] cabelos, int[] idade) {
        int soma = 0, cont = 0;
        for (int i = 0; i < 5; i++) {
            if (olhos[i].equals("C") && cabelos[i].equals("P")) {
                soma += idade[i];
                cont++;
            }
        }
        return cont == 0 ? 0 : (double) soma / cont;
    }

    public static int maior_idade(int[] idade) {
        int maior = idade[0];
        for (int i = 1; i < 5; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }
        return maior;
    }

    public static int qt_individuos(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        int qtd = 0;
        for (int i = 0; i < 5; i++) {
            if (sexo[i].equals("F") && idade[i] >= 18 && idade[i] <= 35 && olhos[i].equals("A") && cabelos[i].equals("L")) {
                qtd++;
            }
        }
        return qtd;
	}

}

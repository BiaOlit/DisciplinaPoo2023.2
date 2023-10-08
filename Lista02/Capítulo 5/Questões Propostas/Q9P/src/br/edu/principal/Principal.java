package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int quantidadePessoas = 10;
        int contadorPesoAltura = 0;
        int contadorIdade = 0;
        double somaIdades = 0;
        int contadorIdadeAltura = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = sc.nextInt();

            System.out.println("Informe o peso da pessoa " + i + " (em kg):");
            double peso = sc.nextDouble();

            System.out.println("Informe a altura da pessoa " + i + " (em metros):");
            double altura = sc.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                contadorPesoAltura++;
            }

            if (idade >= 10 && idade <= 30 && altura > 1.90) {
                contadorIdadeAltura++;
            }

            if (idade >= 10 && idade <= 30) {
                contadorIdade++;
            }
        }

        double mediaIdades = somaIdades / quantidadePessoas;
        double porcentagemIdadeAltura = (double) contadorIdadeAltura / quantidadePessoas * 100;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso > 90kg e altura < 1.50m: " + contadorPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e altura > 1.90m: " + porcentagemIdadeAltura + "%");

	}

}

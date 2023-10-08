package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int idade, totF, totM, soma1, contM1, contM2, tot, contF1, menorIdade;
        double mediaIdade = 0, perc = 0;
        String sexo, exp;
        
        tot = 0;
        totF = 0;
        totM = 0;
        soma1 = 0;
        contM1 = 0;
        contM2 = 0;
        contF1 = 0;
        menorIdade = 0;
        
        System.out.println("Digite a idade (ou 0 para sair): ");
        idade = sc.nextInt();
        
        while (idade != 0) {
            sc.nextLine();  
            
            System.out.println("Digite o sexo (M/F): ");
            sexo = sc.nextLine();
            
            System.out.println("Digite a experiência (S/N): ");
            exp = sc.nextLine();
            
            if (sexo.equals("F") && exp.equals("S")) {
                if (tot == 0) {
                    menorIdade = idade;
                    tot = 1;
                } else if (idade < menorIdade) {
                    menorIdade = idade;
                }
                totF++;
            }
            
            if (sexo.equals("M")) {
                totM++;
            }
            
            if (sexo.equals("F")) {
                totF++;
            }
            
            if (sexo.equals("F") && idade < 21 && exp.equals("S")) {
                contF1++;
            }
            
            if (sexo.equals("M") && idade > 45) {
                contM1++;
            }
            
            if (sexo.equals("M") && exp.equals("S")) {
                soma1 += idade;
                contM2++;
            }
            
            System.out.println("Digite a idade (ou 0 para sair): ");
            idade = sc.nextInt();
        }
        
        System.out.println("Total de mulheres: " + totF);
        System.out.println("Total de homens: " + totM);
        
        if (contM2 == 0) {
            System.out.println("Nenhum homem com experiência");
        } else {
            mediaIdade = (double) soma1 / contM2;
            System.out.println("Média de idade dos homens com experiência: " + mediaIdade);
        }
        
        if (totM == 0) {
            System.out.println("Nenhum homem");
        } else {
            perc = (double) contM1 * 100 / totM;
            System.out.println("Porcentagem de homens com mais de 45 anos: " + perc + "%");
        }
        
        System.out.println("Total de mulheres com menos de 21 anos e experiência: " + contF1);
        System.out.println("Menor idade entre as mulheres com experiência: " + menorIdade);
        
       
	}

}

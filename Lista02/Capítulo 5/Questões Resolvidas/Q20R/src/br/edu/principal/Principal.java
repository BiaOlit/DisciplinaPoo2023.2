package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int cod, num_h, cont_m = 0, cont_f = 0;
        double sal_b, sal_l = 0, media_m = 0, media_f = 0;
        String sexo;

        System.out.print("Digite o código: ");
        cod = sc.nextInt();

        while (cod != 99999) {
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.next();
            System.out.print("Digite o número de horas trabalhadas: ");
            num_h = sc.nextInt();

            sal_b = num_h * 30;

            if (sexo.equalsIgnoreCase("M")) {
                sal_l = sal_b - (sal_b * 10 / 100);
                media_m += sal_l;
                cont_m++;
            } else if (sexo.equalsIgnoreCase("F")) {
                sal_l = sal_b - (sal_b * 5 / 100);
                media_f += sal_l;
                cont_f++;
            }

            System.out.println("Código: " + cod);
            System.out.println("Salário Bruto: " + sal_b);
            System.out.println("Salário Líquido: " + sal_l);

            System.out.print("Digite o código: ");
            cod = sc.nextInt();
        }

        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino");
        } else {
            media_m /= cont_m;
            System.out.println("Média dos salários masculinos: " + media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino");
        } else {
            media_f /= cont_f;
            System.out.println("Média dos salários femininos: " + media_f);
            
        } 

	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double salario,perc_aum, aumento, novo_sal;
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextDouble();

        if (salario <= 300.0) {
            perc_aum = 35.0/100;
        } 
        else {
            perc_aum = 15.0/100;
        }

         aumento = salario * perc_aum;
         novo_sal = salario + aumento;

        System.out.println("O novo salário é: " + novo_sal + " reais.");

	}

}

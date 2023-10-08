package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int anoAtual;
        double salario, novoSalario, percentual;
        
        System.out.print("Informe o ano atual: ");
        anoAtual = sc.nextInt();
        
        salario = 1000.0; 
        percentual = 1.5 / 100.0; 
        
        novoSalario = salario + percentual * salario;
        
        for (int i = 2007; i <= anoAtual; i++) {
            percentual *= 2;
            novoSalario += percentual * novoSalario;
        }
        
        System.out.println("O novo salário em " + anoAtual + " é: " + novoSalario);
        


	}

}

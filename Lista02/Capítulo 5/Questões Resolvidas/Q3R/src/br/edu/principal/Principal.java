package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int n,num,fat;
       
        System.out.print("Informe o valor de n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe um número: ");
            num = sc.nextInt();
            
            fat = 1;

            for (int j = 1; j <= num; j++) {
                fat *= j;
            }

            System.out.println("O fatorial de " + num + " é: " + fat);
            
            
            break;
        }
	}
}
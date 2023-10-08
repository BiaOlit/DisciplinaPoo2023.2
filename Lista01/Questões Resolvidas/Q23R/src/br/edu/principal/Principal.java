package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
     double num = sc.nextDouble();
    
     int i = (int) num;
     System.out.println("O número em sua forma inteira: " + i);
     
     
     double f = num - i;
     System.out.println("O número em forma fracionária: " + f);
     
     long a = Math.round(num);
     
     System.out.println("O arredondamento do número: " + a);
     
	}

}

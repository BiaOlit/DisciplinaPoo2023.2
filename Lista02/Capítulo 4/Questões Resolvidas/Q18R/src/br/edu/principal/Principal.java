package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com valores para os lados de um triângulo");
		System.out.print("Lado X: ");
		int x = sc.nextInt();
		System.out.print("Lado Y: ");
		int y = sc.nextInt();
		System.out.print("Lado Z: ");
		int z = sc.nextInt();
		
		if(x<y+z && y<x+z && z<x+y) {
			if(x==y & y == z) {
				System.out.println("O triângulo é Equilátero");
			}	else if(x==y || x==z || y==z) {
					System.out.println("O triângulo é Isósceles");
				}	else if (x!= y && x!= z && y!= z) {
						System.out.println("O triângulo é Escaleno");
				}
				else {
					System.out.println("Essas medidas não formam um triângulo");
			
			}
		}
		

	}

}

	

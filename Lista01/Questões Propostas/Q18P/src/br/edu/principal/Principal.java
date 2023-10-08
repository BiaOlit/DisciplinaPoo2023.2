package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double temp_celsius, temp_fahr;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em graus Celsius: ");
		temp_celsius = sc.nextInt();
		
		temp_fahr = 180*(temp_celsius + 32) / 100;
		
		System.out.println("A temperatura em graus Fahrenheit será: " +temp_fahr);
		
		

	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String[] veiculo = new String[5];
        double[] consumo = new double[5];
        double menorCons = 0;
        int menorVei = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do veículo " + (i + 1) + ": ");
            veiculo[i] = sc.nextLine();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o consumo do veículo " + veiculo[i] + " (Km/L): ");
            consumo[i] = sc.nextDouble();
            
            if (i == 0) {
                menorCons = consumo[i];
                menorVei = i;
            } else {
                if (consumo[i] < menorCons) {
                    menorCons = consumo[i];
                    menorVei = i;
                }
            }
        }
        
        System.out.println("O veículo mais econômico é " + veiculo[menorVei]);
        
        for (int i = 0; i < 5; i++) {
            double valor = 1000 / consumo[i];
            System.out.println("O veículo " + veiculo[i] + " consome " + valor + " litro(s) de combustível para percorrer 1000 Km.");
        }
        

	}

}

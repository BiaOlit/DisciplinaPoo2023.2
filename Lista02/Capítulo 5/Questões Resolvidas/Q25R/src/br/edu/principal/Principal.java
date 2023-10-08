package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        double preco, imp, transp = 0, seguro, totalImp = 0;
        double finalPrice;
        int origem;
        String meioTransporte, carga;
        
        do {
            System.out.println("Digite o preço do produto (ou 0 para sair): ");
            preco = sc.nextDouble();
            
            if (preco > 0) {
                System.out.println("Digite a origem (1, 2 ou 3): ");
                origem = sc.nextInt();
                
                sc.nextLine(); 
                
                System.out.println("Digite o meio de transporte (A ou T): ");
                meioTransporte = sc.nextLine();
                
                System.out.println("Carga perigosa (S/N): ");
                carga = sc.nextLine();
                
                if (preco <= 100) {
                    imp = preco * 5 / 100;
                } else {
                    imp = preco * 10 / 100;
                }
                
                if (carga.equals("S")) {
                    if (origem == 1) {
                        transp = 50;
                    } else if (origem == 2) {
                        transp = 21;
                    } else if (origem == 3) {
                        transp = 24;
                    }
                } else {
                    if (origem == 1) {
                        transp = 12;
                    } else if (origem == 2) {
                        transp = 21;
                    } else if (origem == 3) {
                        transp = 60;
                    }
                }
                
                if (origem == 2 || meioTransporte.equals("A")) {
                    seguro = preco / 2;
                } else {
                    seguro = 0;
                }
                
                finalPrice = preco + imp + transp + seguro;
                totalImp += imp;
                
                System.out.println("Imposto: " + imp);
                System.out.println("Transporte: " + transp);
                System.out.println("Seguro: " + seguro);
                System.out.println("Preço Final: " + finalPrice);
            }
            
        } while (preco > 0);
        
        System.out.println("Total de Impostos: " + totalImp);
        
      
	}

}

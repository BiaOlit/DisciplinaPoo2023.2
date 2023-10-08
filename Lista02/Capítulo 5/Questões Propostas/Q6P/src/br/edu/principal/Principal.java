package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        char codigo;
	        double valor, totalVista = 0, totalPrazo = 0, totalCompras = 0, primeiraPrestacao = 0;
	        
	        for (int i = 1; i <= 15; i++) {
	            System.out.println("Digite o código da transação (V para à vista, P para a prazo) da transação " + i + ": ");
	            codigo = sc.next().charAt(0);
	            
	            System.out.println("Digite o valor da transação " + i + ": ");
	            valor = sc.nextDouble();
	            
	            totalCompras += valor;
	            
	            if (codigo == 'V' || codigo == 'v') {
	                totalVista += valor;
	            } else if (codigo == 'P' || codigo == 'p') {
	                totalPrazo += valor;
	                
	                if (i == 1) {
	                    primeiraPrestacao = valor / 3;
	                }
	            }
	        }
	        
	        System.out.println("Valor total das compras à vista: " + totalVista);
	        System.out.println("Valor total das compras a prazo: " + totalPrazo);
	        System.out.println("Valor total das compras efetuadas: " + totalCompras);
	        System.out.println("Valor da primeira prestação das compras a prazo: " + primeiraPrestacao);
	        
	       
	}

}

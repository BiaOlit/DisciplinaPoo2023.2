package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		int ano_nasc, ano_atual, idade_anos, idade_meses, idade_dias, idade_sem;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano em que você nasceu: ");
	    ano_nasc = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        ano_atual = sc.nextInt();
        
        
      idade_anos = ano_atual - ano_nasc;
      System.out.println("Você terá " + idade_anos + " anos em " +ano_atual);
     
      
      idade_meses = idade_anos * 12;
      System.out.println("Você terá " + idade_meses + " meses em " + ano_atual);
     
      idade_dias = idade_anos * 365;
      System.out.println("Você terá " + idade_dias + " dias em " +ano_atual);
  

      idade_sem = idade_dias /7;
      System.out.println("Você terá " + idade_sem + " semanas em " + ano_atual);
      
   
	}

}

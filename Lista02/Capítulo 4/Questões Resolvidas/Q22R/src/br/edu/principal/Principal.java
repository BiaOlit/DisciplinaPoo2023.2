package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal_base, tempo, imp, grat, sal_liq;

		Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário base: ");
        sal_base = sc.nextDouble();
        System.out.print("Digite o tempo de serviço (em anos): ");
        tempo = sc.nextDouble();

        
        if (sal_base < 200) {
            imp = 0;
        } else if (sal_base <= 450) {
            imp = 0.03 * sal_base;
        } else if (sal_base < 700) {
            imp = 0.08 * sal_base;
        } else {
            imp = 0.12 * sal_base;
        }
        System.out.println("Imposto: " + imp);

      
        if (sal_base > 500) {
            if (tempo <= 3) {
                grat = 20;
            } else {
                grat = 30;
            }
        } else {
            if (tempo <= 3) {
                grat = 23;
            } else if (tempo < 6) {
                grat = 35;
            } else {
                grat = 33;
            }
        }
        System.out.println("Gratificação: " + grat);

       
        sal_liq = sal_base - imp + grat;
        System.out.println("Salário líquido: " + sal_liq);

        if (sal_liq <= 350) {
            System.out.println("Classificação A");
        } else if (sal_liq < 600) {
            System.out.println("Classificação B");
        } else {
            System.out.println("Classificação C");
        }
	}
}

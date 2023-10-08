package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double angulo, voltas;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o ângulo: ");
	    angulo = sc.nextDouble();
	
	    if (angulo > 360 || angulo < -360) {
	         voltas = (int) (angulo / 360);
	         angulo = angulo % 360;
	     }else {
	         voltas = 0;
	        }
	
	    if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360
	       || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
	        System.out.println("Está em cima de algum dos eixos");
	        }
	
	    if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
	    	System.out.println("1o Quadrante");
	        }
	
	    if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
	        System.out.println("2o Quadrante");
	        }
	
	    if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
	        System.out.println("3o Quadrante");
	        }
	
	    if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
	        System.out.println("4o Quadrante");
	        }
	
	        System.out.println(voltas + " volta(s) no sentido " + (angulo < 0 ? "horário" : "anti-horário"));


	}
}
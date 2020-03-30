package ejercicio4;

import java.util.Scanner;

public class Test {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		int mes;
		System.out.println("Ingrese numero de día: ");
		dia = input.nextInt();
		System.out.println("Ingrese numero de mes: ");
		mes = input.nextInt();
		Anio a1 = new Anio();
		System.out.println("Dias transcurridos hasta "+dia+"/"+mes+" : "+(a1.diasTranscurridos(mes)+dia));

		

	}

}

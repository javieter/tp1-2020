package ejercicio4;

import java.util.Scanner;

public class Test {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		int mes;
		/*System.out.println("Ingrese numero de día actual:");
		dia = input.nextInt();
		System.out.println("Ingrese numero de mes actual:");
		mes = input.nextInt();*/
		Anio a1 = new Anio();
		//System.out.println("Dias transcurridos hasta el "+dia+"/"+mes+" : "+(a1.diasTranscurridos(mes)+dia));
		//System.out.println(a1);
		for(int i=1; i<=12; i++) {
			//System.out.println(a1.getNombreDelMes(i)+" "+a1.getDias()[0][i-1]);
			System.out.println(a1.diasTranscurridos(i));
		}

	}

}

package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int opcion;
		double tiempo;
		/*
		 * Atleta atl0 = new Atleta("Francisco", 9.81); Atleta atl1 = new
		 * Atleta("Lorena", 9.1); Atleta atl2 = new Atleta("Carlos", 9.83); Atleta atl3
		 * = new Atleta("Lorena", 9.1); Atleta atl4 = new Atleta("Carlos", 9.87);
		 * 
		 * Competencia carrera = new Competencia("100 metros llanos");
		 * carrera.agregarAtleta(atl0); carrera.agregarAtleta(atl1);
		 * carrera.agregarAtleta(atl2); carrera.agregarAtleta(atl3);
		 * carrera.agregarAtleta(atl4);
		 * 
		 * ArrayList<Atleta> ganadores = carrera.getGanadores(); for (Atleta atleta :
		 * ganadores) { System.out.println(atleta); }
		 */
		cadena = ingresaString("Ingrese nombre de especialidad de la carrera: ");
		Competencia c1 = new Competencia(cadena);
		do {
			opcion = ingreseNumero(0, 2,
					"1- Ingresar atleta \n" + "2- Obtener ganador \n" + "0- Salir \n" + "Ingrese opcion: ");
			switch (opcion) {
			case 1:
				System.out.print("Ingrese nombre de atleta: ");
				cadena = input.nextLine();
				System.out.print("Ingrese tiempo en segundos: ");
				tiempo = input.nextDouble();
				input.nextLine();
				Atleta atleta = new Atleta(cadena, tiempo);
				c1.agregarAtleta(atleta);
				break;
			case 2:
				ArrayList<Atleta> ganadores = c1.getGanadores();
				for (Atleta atletaGanador : ganadores) {
					System.out.println(atletaGanador);
				}
				break;

			default:
				break;
			}
			System.out.println("\n" + "\n");
		} while (opcion != 0);

		input.close();
	}

	public static String ingresaString(String mje) {
		String cadena;
		System.out.print(mje);
		cadena = input.nextLine();
		return cadena;
	}

	public static int ingreseNumero(int min, int max, String mje) {
		int valor;
		do {
			System.out.print(mje);
			valor = input.nextInt();
		} while (valor < min || valor > max);
		input.nextLine();
		return valor;
	}

}

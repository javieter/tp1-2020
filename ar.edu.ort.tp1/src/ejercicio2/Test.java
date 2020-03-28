package ejercicio2;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int opcion, numero;
		float tiempo;
		
		cadena = ingresaString("Ingrese nombre de especialidad de la carrera: ");
		Carrera c1 = new Carrera(cadena);
		do {
			opcion = ingreseNumero(0, 2, "1- Ingresar atleta \n"
					+ "2- Obtener ganador \n"
					+ "0- Salir \n"
					+ "Ingrese opcion: ");
			switch (opcion) {
			case 1:
				System.out.print("Ingrese numero de atleta: ");
				numero  = input.nextInt();
				System.out.print("Ingrese tiempo en segundos: ");
				tiempo = input.nextFloat();
				c1.ingresarAtleta(numero, tiempo);
				break;
			case 2:
				c1.mostrarGanador();
			break;

			default:
				break;
			}
			System.out.println("\n"+"\n");
		}while(opcion != 0);
		
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
		}while(valor<min||valor>max);
		input.nextLine();
		return valor;
	}

}

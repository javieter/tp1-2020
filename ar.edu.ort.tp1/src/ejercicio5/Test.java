package ejercicio5;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		int mes;
		AnioV2 anio = new AnioV2();
		do {
			mes = validaNumero(1, 12, "Ingrese numero de mes entre 1 y 12: ", "Error, ");
			dia = validaNumero(1, anio.getDiasMes(mes), "Ingrese numero de dia del mes: ",
					"Error, el mes elegido solo tiene " + anio.getDiasMes(mes) + " dias");
			System.out.println(
					"El numero de mes ingresado fue " + mes + ", que corresponde a " + anio.getNombreDelMes(mes));
			System.out.println("Desde el comienzo del año a la fecha " + dia + "/" + mes + " han pasado "
					+ (anio.diasTranscurridos(mes) + dia) + " dias");
		} while (pregunta());

		input.close();

	}

	public static int validaNumero(int min, int max, String mje, String error) {
		int valor;
		boolean flag = false;
		do {
			if (flag)
				System.out.println(error);
			System.out.print(mje);
			valor = input.nextInt();
			flag = true;
		} while (valor < min || valor > max);
		input.nextLine();
		return valor;
	}

	public static boolean pregunta() {
		boolean respuesta = false;
		char sn;
		do {
			System.out.print("Desea continuar s/n? :");
			sn = input.nextLine().toLowerCase().charAt(0);
		} while (sn != 's' && sn != 'n');
		if (sn == 's')
			respuesta = true;
		return respuesta;
	}

}

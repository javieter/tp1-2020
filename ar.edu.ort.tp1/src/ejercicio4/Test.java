package ejercicio4;

import java.util.Scanner;

public class Test {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		int mes;
		Anio a1 = new Anio();
		do {
			mes = validaNumero(1, 12, "Ingrese numero de mes entre 1 y 12: ", "Error, ");
			dia = validaNumero(1, a1.getDiasMes(mes), "Ingrese numero de dia del mes: ",
					"Error, el mes elegido solo tiene " + a1.getDiasMes(mes) + " dias");
			System.out.println(
					"El numero de mes ingresado fue " + mes + ", que corresponde a " + a1.getNombreDelMes(mes));
			System.out.println("Desde el comienzo del año a la fecha " + dia + "/" + mes + " han pasado "
					+ (a1.diasTranscurridos(mes) + dia) + " dias");
		} while (pregunta());

		input.close();

	}

	public static int validaNumero(int min, int max, String mje, String error) {
		int valor;
		boolean flag = false;
		do {
			if (flag)
				System.out.print(error);
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
			System.out.print("Desea continuar ingresar otra fecha? s/n :");
			sn = input.nextLine().toLowerCase().charAt(0);
		} while (sn != 's' && sn != 'n');
		if (sn == 's')
			respuesta = true;
		return respuesta;
	}

}

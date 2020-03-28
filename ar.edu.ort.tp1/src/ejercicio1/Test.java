package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static void comprueba(String variable, String mje) {
		if (variable != null)
			System.out.println(variable + " " + mje);
		else
			System.out.println("No existe el integrante indicado");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*// String [] integrantes = {"Vanesa","Ezequiel","Javier","ficticio"};
		Grupo grupo1 = new Grupo("Grupo3");
		// Grupo grupo2 = new Grupo("Prueba",integrantes);
		grupo1.agregarIntegrante("Ezequiel");
		grupo1.agregarIntegrante("Vanesa");
		grupo1.agregarIntegrante("Javier");
		grupo1.agregarIntegrante("Ficticio");
		comprueba(grupo1.buscarIntegrante("Vanesa"), "fue agregad@");
		comprueba(grupo1.buscarIntegrante("Leslie"), "fue agregad@");
		grupo1.mostrar();
		comprueba(grupo1.removerIntegrante("ficticio"), "fue removid@");
		comprueba(grupo1.removerIntegrante("Ficticio"), "fue removid@");
		grupo1.mostrar();
		grupo1.vaciar();
		grupo1.mostrar();

		ArrayList<String> integrantes = new ArrayList<>();
		integrantes.add("Intgrante1");
		integrantes.add("Intgrante2");
		integrantes.add("Intgrante3");
		integrantes.add("Intgrante4");
		Grupo g2 = new Grupo("Grupo2", integrantes);
		g2.mostrar();
		Grupo g4 = new Grupo("Grupo4");
		g4.setIntegrantes(integrantes);
		g4.mostrar();*/
		int opcion;
		String cadena;
		cadena = ingresaString("Ingrese el nombre del grupo: ");
		Grupo g = new Grupo(cadena);
		do {
			
			opcion=ingreseNumero(1, 10, menu());
			switch (opcion) {
			case 1:
				System.out.println(g.getNombre());
				break;
			case 2:
				System.out.println(g.getCantidadIntegrantes());
				break;
			case 3:
				cadena = ingresaString("Ingrese el nombre del integrante: ");
				g.agregarIntegrante(cadena);
				break;
			case 4:
				int posicion;
				System.out.print("Posicion: ");
				posicion = input.nextInt();
				System.out.println(g.obtenerIntegrante(posicion));
				input.nextLine();
				break;
			case 5:
				cadena = ingresaString("Ingrese el nombre del integrante: ");
				System.out.println(g.buscarIntegrante(cadena));
				break;
			case 6:
				cadena = ingresaString("Ingrese el nombre del integrante a eliminar: ");
				System.out.println(g.removerIntegrante(cadena));
				break;
			case 7:
				g.mostrar();
				break;
			case 8:
				g.vaciar();
			break;

			default:
				break;
			}
			System.out.println("\n"+"\n");
		}while(opcion!=9);
		
		input.close();

	}
	public static String menu() {
		return    "1 - Mostrar nombre del grupo \n"
				+ "2 - Ver cantidad de integrantes \n"
				+ "3 - Agregar integrante al grupo \n"
				+ "4 - Ver integrante perteneciente a una posicion \n"
				+ "5 - Buscar integrante \n"
				+ "6 - Remover integrante por nombre \n"
				+ "7 - Ver datos del grupo \n"
				+ "8 - Remover todos los integrantes \n"
				+ "9 - Salir \n"
				+ "Ingrese opcion: ";
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
	public static boolean pregunta(String mje) {
		boolean respuesta = false;
		char continua;
		do {
			System.out.println(mje);
			continua = input.nextLine().toLowerCase().charAt(0);
		}while(continua!='s' && continua!='n');
		if(continua=='s')
			respuesta = true;
		return respuesta;
	}
	public static String ingresaString(String mje) {
		String cadena;
		System.out.print(mje);
		cadena = input.nextLine();
		return cadena;
	}

}
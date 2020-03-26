package ejercicio1;

import java.util.ArrayList;

public class Test {
	public static void comprueba(String variable, String mje) {
		if (variable != null)
			System.out.println(variable + " " + mje);
		else
			System.out.println("No existe el integrante indicado");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [] integrantes = {"Vanesa","Ezequiel","Javier","ficticio"};
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
		g4.mostrar();

	}

}
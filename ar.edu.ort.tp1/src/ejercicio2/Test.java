package ejercicio2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrera c1 = new Carrera("100 metros");
		c1.ingresarAtleta(5, 54);
		c1.ingresarAtleta(3, 44);
		c1.ingresarAtleta(8, 45);
		c1.ingresarAtleta(12, 34);
		c1.ingresarAtleta(23, 46);
		c1.ingresarAtleta(31, 34);
		c1.ingresarAtleta(22, 49);
		c1.ingresarAtleta(66, 43);
		c1.ingresarAtleta(87, 44);
		System.out.println(c1);
		c1.mostrarGanador();

		Carrera c2 = new Carrera("1000 metros");
		System.out.println(c2);
		c2.mostrarGanador();
		c2.ingresarAtleta(3, 65.33f);
		c2.ingresarAtleta(7, 65.35f);
		c2.mostrarGanador();
	}

}

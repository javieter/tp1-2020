package ejercicio3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub#
		
		 Atleta atl0 = new Atleta("Francisco", 9.1); 
		 Atleta atl1 = new Atleta("Lorena", 9.45); 
		 Atleta atl2 = new Atleta("Carlos", 9.83);
		 Atleta atl3 = new Atleta("Patricia", 9.23); 
		 Atleta atl4 = new Atleta("Vanesa", 9.52);
		 Atleta atl5 = new Atleta("Ricardo", 9.20); 
		 Atleta atl6 = new Atleta("Tomas", 9.23); 
		 Atleta atl7 = new Atleta("Sofia", 9.52);
		 Atleta atl8 = new Atleta("Mateo", 9.33); 
		 Atleta atl9 = new Atleta("Julieta", 9.33);
		 Atleta atl10 = new Atleta("Belen", 9.20);
		 
		  
		  Competencia carrera = new Competencia("100 metros llanos");
		  carrera.agregarAtleta(atl0); 
		  carrera.agregarAtleta(atl1);
		  carrera.agregarAtleta(atl2); 
		  carrera.agregarAtleta(atl3);
		  carrera.agregarAtleta(atl4);
		  carrera.agregarAtleta(atl5);
		  carrera.agregarAtleta(atl6);
		  carrera.agregarAtleta(atl7);
		  carrera.agregarAtleta(atl8);
		  carrera.agregarAtleta(atl9);
		  carrera.agregarAtleta(atl10);
		  
		  ArrayList<Atleta> primero = carrera.getPrimerPuesto(); 
		  System.out.println("Primer Puesto");
		  for (Atleta atleta : primero) 
		  	{ System.out.println(atleta); }
		  
		  ArrayList<Atleta> segundo = carrera.getSegundoPuesto(); 
		  System.out.println("Segundo Puesto");
		  for (Atleta atleta : segundo) 
		  	{ System.out.println(atleta); }
		  
		  ArrayList<Atleta> tercero = carrera.getTercerPuesto(); 
		  System.out.println("Tercer Puesto");
		  for (Atleta atleta : tercero) 
		  	{ System.out.println(atleta); }
		 

	}

}

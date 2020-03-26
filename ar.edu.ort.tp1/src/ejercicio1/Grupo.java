package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre, ArrayList<String> integrantes) {
		//this.nombre = nombre;
		setNombre(nombre);
		this.integrantes = integrantes;
	}

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}

	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}

	public void agregarIntegrante(String nombreIntegrante) {
		if (getCantidadIntegrantes() == 0 || obtenerPosicionIntegrante(nombreIntegrante) == -1) {
			this.integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante +" fue agregado al grupo " + this.nombre);
		}
			
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		int posicion = -1;
		while (i < getCantidadIntegrantes() && posicion == -1) {
			if (this.integrantes.get(i).toLowerCase().equals(nombreIntegrante.toLowerCase()))
				posicion = i;
			else
				i++;
		}
		return posicion;
	}

	public String obtenerIntegrante(int posicion) {
		if (posicion >= 1 && posicion <= getCantidadIntegrantes())
			return this.integrantes.get(posicion - 1);
		return null;
	}
	
	public String buscarIntegrante(String nombre) {
		String nombreIntegrante = null;
		int i = 0;
		while(i < this.integrantes.size() && nombreIntegrante==null) {
			if (this.integrantes.get(i).toLowerCase().equals(nombre.toLowerCase()))
				nombreIntegrante = this.integrantes.get(i);
			else
				i++;					
			
		}
		return nombreIntegrante;
	}
	public String removerIntegrante(String nombreIntegrante) {
		int posicion = (obtenerPosicionIntegrante(nombreIntegrante));
		String integrante = null;
		if(posicion != -1)
			integrante = this.integrantes.remove(posicion);
		return integrante;
	}
	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes: "+ getCantidadIntegrantes() + "\n" +
				getIntegrantes());
	}
	public void mostrar() {
		System.out.println("Grupo: " + getNombre());
		mostrarIntegrantes();
	}
	public void vaciar() {
		this.integrantes.clear();
	}

}

package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		this.integrantes = new ArrayList<String>();
	}
	
	public Grupo(String nombre, ArrayList<String> integrantes) {
		//this.nombre = nombre;
		setNombre(nombre);
		this.integrantes = integrantes;
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
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		int posicion = -1;
		while (i < this.integrantes.size() && posicion == -1) {
			if (this.integrantes.get(i).toLowerCase().equals(nombreIntegrante.toLowerCase()))
				posicion = i;
			else
				i++;
		}
		return posicion;
	}

	public void agregarIntegrante(String nombreIntegrante) {
		if (obtenerPosicionIntegrante(nombreIntegrante) == -1) {
			this.integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante +" fue agregado al grupo " + this.nombre);
		}
		else
			System.out.println(nombreIntegrante +" ya existe en el grupo "+ this.nombre);
			
	}

	public String obtenerIntegrante(int posicion) {
		if (posicion > 0 && posicion <= getCantidadIntegrantes())
			return this.integrantes.get(posicion - 1);
		else
			return null;
	}
	
	public String buscarIntegrante(String nombre) {
		int posicion = obtenerPosicionIntegrante(nombre);
		String nombreIntegrante = null;
		
		if(posicion!=-1)
			nombreIntegrante = this.integrantes.get(posicion);
	
		return nombreIntegrante;
	}
	public String removerIntegrante(String nombreIntegrante) {
		int posicion = obtenerPosicionIntegrante(nombreIntegrante);
		String nombre = null;
		
		if(posicion!=-1) 
			nombre = this.integrantes.remove(posicion);
	
		return nombre;
	}
	private void mostrarIntegrantes() {
		if(getCantidadIntegrantes()>0) {
			System.out.println("Cantidad de integrantes  " + getCantidadIntegrantes());
			System.out.println(this.integrantes);
		}
		
	}
	
	public void mostrar() {
		System.out.println("Nombre del grupo: " + getNombre());
		mostrarIntegrantes();
	}
	public void vaciar() {
		this.integrantes.clear();
	}

	@Override
	public String toString() {
		return "Grupo [integrantes=" + integrantes + "]";
	}
	
	

}

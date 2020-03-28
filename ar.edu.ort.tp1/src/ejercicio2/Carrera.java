package ejercicio2;

import java.util.ArrayList;

public class Carrera {
	private String especialidad;
	private ArrayList<Atleta> atletas;

	public Carrera(String especialidad) {
		this.especialidad = especialidad;
		this.atletas = new ArrayList<Atleta>();
	}

	public Carrera(String especialidad, ArrayList<Atleta> atletas) {
		this.especialidad = especialidad;
		this.atletas = atletas;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public ArrayList<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		this.atletas = atletas;
	}

	public void ingresarAtleta(int numero, float tiempo) {
		if(!existeAtleta(numero)) {
			Atleta atleta = new Atleta(numero, tiempo);
			this.atletas.add(atleta);
		}else
			System.out.println("El atleta numero: "+numero+" ya existe cargado en la carrera");
		
	}
	
	private boolean existeAtleta(int numero) {
		boolean existe = false;
		int i = 0;
		
		while(i<this.atletas.size()&&!existe) {
			if(this.atletas.get(i).getNumero()==numero)
				existe = true;
			else
				i++;
		}
		return existe;
	}

	private float mejorTiempo() {
		float tiempo = this.atletas.get(0).getTiempo();
		for (Atleta auxAtleta : this.atletas) {
			if (auxAtleta.getTiempo() < tiempo)
				tiempo = auxAtleta.getTiempo();
		}
		return tiempo;
	}

	private ArrayList<Atleta> obtenerGanador() {
		ArrayList<Atleta> ganador = new ArrayList<Atleta>();
		float tiempo = mejorTiempo();
		for (Atleta auxAtleta : this.atletas) {
			if (tiempo == auxAtleta.getTiempo())
				ganador.add(auxAtleta);
		}
		return ganador;
	}

	public void mostrarGanador() {
		if (this.atletas.size() > 0) {
			for (Atleta auxAtleta : obtenerGanador())
				System.out.println(auxAtleta);
		} else
			System.out.println("No se cargaron participantes en la carrera");

	}

	@Override
	public String toString() {
		return "Carrera [especialidad=" + especialidad + ", atletas=" + atletas + "]";
	}

}

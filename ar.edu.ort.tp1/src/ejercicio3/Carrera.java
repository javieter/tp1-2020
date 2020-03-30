package ejercicio3;

import java.util.ArrayList;

import ejercicio2.Atleta;

public class Carrera {
	private String especialidad;
	private ArrayList<Atleta> atletas;
	private float[] podio;

	public Carrera(String especialidad) {
		this.especialidad = especialidad;
		this.atletas = new ArrayList<Atleta>();
		this.podio = new float[] {-1,-1,-1};
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
		this.atletas.add(new Atleta(numero, tiempo));
	}
	
	private void obtenerPodio() {
		ArrayList<Float> tiempos = new ArrayList<Float>();
		for (int i=0;this.atletas.size()<i;i++) {
				tiempos.add(this.atletas.get(i).getTiempo());
		}
		
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


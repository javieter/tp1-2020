package ejercicio2;

import java.util.ArrayList;

public class Competencia {
	private String especialidad;
	private ArrayList<Atleta> atletas;
	private ArrayList<Atleta> ganadores;
	private double mejorTiempo;

	public Competencia(String especialidad) {
		this.especialidad = especialidad;
		this.atletas = new ArrayList<Atleta>();
		this.ganadores = new ArrayList<Atleta>();
		this.mejorTiempo = Double.MAX_VALUE;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public ArrayList<Atleta> getAtletas() {
		return this.atletas;
	}

	public void agregarAtleta(Atleta atleta) {
		if (!existeAtleta(atleta.getNombre())) {
			this.atletas.add(atleta);
			if (atleta.getTiempo() < mejorTiempo) {
				mejorTiempo = atleta.getTiempo();
				ganadores.clear();
				ganadores.add(atleta);
			} else if (atleta.getTiempo() == mejorTiempo)
				ganadores.add(atleta);
		} else
			System.out.println("El atleta " + atleta.getNombre() + ", ya existe cargado en la competencia de "
					+ this.especialidad);

	}

	public ArrayList<Atleta> getGanadores() {
		/*
		 * ArrayList<Atleta> ganadores = new ArrayList<Atleta>(); double mejorTiempo =
		 * Double.MAX_VALUE;
		 * 
		 * if(this.atletas.size()>0) { for(Atleta auxAtl: this.atletas)
		 * if(auxAtl.getTiempo() < mejorTiempo) { mejorTiempo = auxAtl.getTiempo();
		 * ganadores.clear(); ganadores.add(auxAtl); }else if(auxAtl.getTiempo() ==
		 * mejorTiempo) ganadores.add(auxAtl); }
		 */
		return this.ganadores;
	}

	private boolean existeAtleta(String nombre) {
		boolean existe = false;
		int i = 0;

		while (i < this.atletas.size() && !existe) {
			if (this.atletas.get(i).getNombre().equals(nombre))
				existe = true;
			else
				i++;
		}
		return existe;
	}

	@Override
	public String toString() {
		return "Competencia \n" + "especialidad=" + especialidad + "\n" + "atletas=" + atletas;
	}

}

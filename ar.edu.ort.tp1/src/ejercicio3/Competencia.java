package ejercicio3;

import java.util.ArrayList;

public class Competencia {
	private String especialidad;
	private ArrayList<Atleta> atletas;
	private ArrayList<Atleta> primerPuesto;
	private ArrayList<Atleta> segundoPuesto;
	private ArrayList<Atleta> tercerPuesto;
	private double mejorTiempo[];

	public Competencia(String especialidad) {
		this.especialidad = especialidad;
		this.atletas = new ArrayList<Atleta>();
		this.primerPuesto = new ArrayList<Atleta>();
		this.segundoPuesto = new ArrayList<Atleta>();
		this.tercerPuesto = new ArrayList<Atleta>();
		this.mejorTiempo = new double[] { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE };
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public ArrayList<Atleta> getAtletas() {
		return this.atletas;
	}

	public void agregarAtleta(Atleta atleta) {
		// Cuando se agrega el atleta, se empieza a cargar el podio de ganadores
		if (!existeAtleta(atleta.getNombre())) {
			this.atletas.add(atleta);
			// chequear si es el mejor tiempo, si es asi, el que era el 1er mejor tiempo
			// pasa a ser el 2do mejos
			// por los atletas que eran primeros pasan a ser segundos
			if (atleta.getTiempo() < this.mejorTiempo[0]) {
				this.mejorTiempo[1] = this.mejorTiempo[0];
				this.tercerPuesto.clear();
				for (Atleta atletaAux : segundoPuesto)
					this.tercerPuesto.add(atletaAux);
				this.segundoPuesto.clear();
				for (Atleta atletaAux : primerPuesto)
					this.segundoPuesto.add(atletaAux);
				this.mejorTiempo[0] = atleta.getTiempo();
				this.primerPuesto.clear();
				this.primerPuesto.add(atleta);
			}
			// si no es el mejor, chequea si no es el mismo mejor tiempo, si es asi, agrega
			// el atleta a los primeros
			else if (atleta.getTiempo() == this.mejorTiempo[0]) {
				this.primerPuesto.add(atleta);
			}
			// si no, chequea si no es el 3do mejor tiempo, si es asi, los segundos pasan a
			// ser terceros
			else if (atleta.getTiempo() < this.mejorTiempo[1]) {
				this.mejorTiempo[2] = this.mejorTiempo[1];
				tercerPuesto.clear();
				for (Atleta atletaAux : segundoPuesto)
					this.tercerPuesto.add(atletaAux);
				this.mejorTiempo[1] = atleta.getTiempo();
				this.segundoPuesto.clear();
				this.segundoPuesto.add(atleta);
			}
			// si es igual a 2do mejor tiempo, agrega al atleta a los segundos
			else if (atleta.getTiempo() == this.mejorTiempo[1]) {
				this.segundoPuesto.add(atleta);
			}
			// si es menor al 3er mejor tiempo, borra todo y agrega el nuevo tercer atleta
			else if (atleta.getTiempo() < this.mejorTiempo[2]) {
				this.mejorTiempo[2] = atleta.getTiempo();
				this.tercerPuesto.clear();
				this.tercerPuesto.add(atleta);
			}
			// si es igual, agrega el atleta a los terceros
			else if (atleta.getTiempo() == this.mejorTiempo[2]) {
				this.tercerPuesto.add(atleta);
			}

		} else
			System.out.println("El atleta " + atleta.getNombre() + ", ya existe cargado en la competencia de "
					+ this.especialidad);

	}

	public ArrayList<Atleta> getPrimerPuesto() {
		return this.primerPuesto;
	}

	public ArrayList<Atleta> getSegundoPuesto() {
		return this.segundoPuesto;
	}

	public ArrayList<Atleta> getTercerPuesto() {
		return this.tercerPuesto;
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

package ejercicio5;

public class AnioV2 {
	private enum Meses {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}

	private int[][] dias;

	public AnioV2() {
		this.dias = new int[][] { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 } };
	}

	public int getDiasMes(int nroMes) {
		return this.dias[0][nroMes - 1];
	}

	public String getNombreDelMes(int numeroMes) {
		int mes = numeroMes - 1;
		String nombreMes = "";
		for (Meses unMes : Meses.values()) {
			if (unMes.ordinal() == mes)
				nombreMes = unMes.toString();
		}
		return nombreMes;
	}

	public int diasTranscurridos(int numeroMes) {
		int nroMes = numeroMes - 1;
		return this.dias[1][nroMes];
	}

}

package ejercicio4;

//import java.util.Arrays;

public class Anio {
	private String[] meses;
	private int[][] dias;
	// private int[] dias; //Se reemplazo por el uso de una matriz

	public Anio() {
		this.meses = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Sepriembre", "Octubre", "Noviembre", "Diciembre" };
		this.dias = new int[][] { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 } };
		// this.dias = new int [] {31,28,31,30,31,30,31,31,30,31,30,31};
	}

	public int getDiasMes(int nroMes) {
		return this.dias[0][nroMes - 1];
		// return this.dias[nroMes-1];
	}

	public String getNombreDelMes(int numeroMes) {
		return this.meses[numeroMes - 1];
		// return this.meses[numeroMes-1];
	}

	public int diasTranscurridos(int numeroMes) {
		int nroMes = numeroMes - 1;
		/*
		 * al reemplazar el aarray por una matriz no es necesario el for int
		 * diasTranscurridos = 0; for(int i=0; i<numeroMes-1;i++)
		 * diasTranscurridos+=this.dias[i]; return diasTranscurridos;
		 */
		return this.dias[1][nroMes];
	}

}

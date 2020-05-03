package ejercicio4;

//import java.util.Arrays;

public class Anio {
	private String[] meses;
	private int[] dias; //Se reemplazo por el uso de una matriz

	public Anio() {
		this.meses = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Sepriembre", "Octubre", "Noviembre", "Diciembre" };
		this.dias = new int[] {  0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
		// this.dias = new int [] {31,28,31,30,31,30,31,31,30,31,30,31};
	}

	public String getNombreDelMes(int numeroMes) {
		return this.meses[numeroMes-1];
	}
	public int getDiasMes(int mes) {
		int diasMes=365;
		
			if(mes==12)
				diasMes -= this.dias[mes-1];
			else
				diasMes = this.dias[mes]-this.dias[mes-1];
					
		return diasMes;
	}

	public int diasTranscurridos(int numeroMes) {
		int nroMes = numeroMes - 1;
		/*
		 * al reemplazar los valores del array dias, ya no es necesario el for
		 * diasTranscurridos = 0; for(int i=0; i<numeroMes-1;i++)
		 * diasTranscurridos+=this.dias[i]; return diasTranscurridos;
		 */
		return this.dias[nroMes];
	}

}

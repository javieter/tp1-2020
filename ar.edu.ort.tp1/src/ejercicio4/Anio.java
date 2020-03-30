package ejercicio4;

import java.util.Arrays;

public class Anio {
	private String[] meses;
	private int[][] dias;
	
	public Anio() {
		this.meses = new String [] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Sepriembre","Octubre","Noviembre","Diciembre"};
		this.dias = new int [][] {{31,28,31,30,31,30,31,31,30,31,30,31},{0,31,59,90,120,151,181,212,243,273,304,334}};
	}
	
	public String[] getMeses() {
		return meses;
	}

	public void setMeses(String[] meses) {
		this.meses = meses;
	}

	public int[][] getDias() {
		return dias;
	}

	public void setDias(int[][] dias) {
		this.dias = dias;
	}

	public String getNombreDelMes(int numeroMes) {
		return this.meses[numeroMes-1];
	}
	
	public int diasTranscurridos(int numeroMes) {
		int nroMes = numeroMes-1;
	/*	int diasTranscurridos = 0;
		for(int i=0; i<numeroMes-1;i++)
			diasTranscurridos+=this.dias[i];*/
		
		return this.dias[1][nroMes];
	}

	@Override
	public String toString() {
		return "Anio [meses=" + Arrays.toString(meses) + ", dias=" + Arrays.toString(dias) + "]";
	}

	
}

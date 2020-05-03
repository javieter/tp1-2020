package ejercicio5;

public class AnioV2 {
	private int[] dias;

	public AnioV2() {
		this.dias = new int[] { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
	}
	
	public int getDiasMes(int mes) {
		int diasMes=365;
		
			if(mes==12)
				diasMes -= this.dias[mes-1];
			else
				diasMes = this.dias[mes]-this.dias[mes-1];
					
		return diasMes;
	}

	public String getNombreDelMes(int numeroMes) {
		int nroMes = numeroMes - 1;
		return Mes.values()[nroMes].name();
	}

	public int diasTranscurridos(int numeroMes) {
		int nroMes = numeroMes - 1;
		return this.dias[nroMes];
	}

}

package ejercicio6;

public class Rubro {
//	private Mes[] TOTAL_MESES;
//	private int[] TOTAL_MESES1 = new int[12];
	private static final int TOTAL_MESES = 12;
	private String nombre;
	private double [] gastosPorMes;
	
	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getTotalGastos(Mes mes) {
		return this.gastosPorMes[mes.ordinal()];
	}
	
	public static int getTotalMeses() {
		return TOTAL_MESES;
	}

	private void inicializarGastos() {
		this.gastosPorMes = new double[12];
	}
	
	public void agregarGasto(Mes mes, double importe) {
		if(importe > 0) 
			this.gastosPorMes[mes.ordinal()]+=importe;
		else
			System.out.println("El importe debe ser mayor a 0");
		
	}
}

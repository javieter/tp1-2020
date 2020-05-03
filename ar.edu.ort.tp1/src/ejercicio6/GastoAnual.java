package ejercicio6;

import java.util.ArrayList;

public class GastoAnual {
	private ArrayList<Rubro> rubros;

	public GastoAnual() {
		this.rubros = new ArrayList<Rubro>();
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		if(importe>0) {
			Rubro rubro = obtenerRubro(nombreRubro);
			rubro.agregarGasto(mes, importe);
		}
		else
			System.out.println("El importe debe ser mayor a 0");
	}
	
	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro = buscarRubro(nombreRubro);
		if(rubro==null) {
			this.rubros.add(new Rubro(nombreRubro));
			rubro = this.rubros.get(this.rubros.size()-1);
		}
		return rubro;
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		Rubro buscaRubro = null;
		int i = 0;
		
		while (i < this.rubros.size() && buscaRubro==null) {
			if(this.rubros.get(i).getNombre().equals(nombreRubro)) 
				buscaRubro = this.rubros.get(i);
			else
				i++;
		}
		return buscaRubro;
	}
	
	private double[][] consolidadoDeGastos() {
		int cantRubros = this.rubros.size();
		double [][] acumPorMes = new double [cantRubros][12];
		Mes mes;
		for (int i = 0; i < acumPorMes.length; i++) {
			for (int j = 0; j < acumPorMes[i].length; j++) {
				mes = Mes.values()[j];
				acumPorMes[i][j]=this.rubros.get(i).getTotalGastos(mes);
			}
		}
		return acumPorMes;
	}
	public double gastoAcumulado(Mes mes) {
		double [][] acumPorMes = consolidadoDeGastos();
		double sumaTotalMes = 0;
		for (int i = 0; i < acumPorMes.length; i++) {
				sumaTotalMes += acumPorMes[i][mes.ordinal()];
			}
		return sumaTotalMes;
	}
	public double gastoAcumulado(String nombreRubro) {
		double gastoAcum = -1;
		Rubro rubro = buscarRubro(nombreRubro);
		if(rubro!=null) {
			Mes mes;
			for (int i = 0; i < 12; i++) {
				mes = Mes.values()[i];
				gastoAcum += rubro.getTotalGastos(mes);
			}
		}
		return gastoAcum;
	}
	public void informarConsumosPorMes() {
		double [][] acumPorMes = consolidadoDeGastos();
		double total;
		for (int i = 0; i < acumPorMes.length; i++) {
			total = 0;
			System.out.print(this.rubros.get(i).getNombre() + "\t" );
			for (int j = 0; j < acumPorMes[i].length; j++) {
				System.out.print("$" + acumPorMes[i][j] + "\t");
			}
			total = gastoAcumulado(this.rubros.get(i).getNombre());
			System.out.print("$" + total +"\n");
			
		}
	}
	public void informarPromedioMensualPorRubro() {
		double promedio;
		for (int i = 0; i < Rubro.getTotalMeses(); i++) {
			promedio = gastoAcumulado(this.rubros.get(i).getNombre())/12;
			System.out.print(this.rubros.get(i).getNombre() +"\t $" + promedio);
		}
	}
	public void informarMesMayorConsumo() {
		ArrayList<Mes> mayorConsumo = new ArrayList<Mes>();
		double [][] acumPorMes = consolidadoDeGastos();
		double maxConsumo = 0;
		double sumaDelMes;
		Mes mes;
		int fila,col;
		fila = acumPorMes.length;
		col = acumPorMes[0].length;
		for (int i = 0; i < col; i++) {
			sumaDelMes = 0;
			for (int j = 0; j < fila; j++) {
				sumaDelMes += acumPorMes[j][i];
			}
			//if(sumaDelMes>maxConsumo)
				//maxConsumo = sumaDelMes;
			mes = Mes.values()[i];
			if(sumaDelMes>maxConsumo) {
				maxConsumo = sumaDelMes;
				mayorConsumo.clear();
				mayorConsumo.add(mes);
			}else if(sumaDelMes==maxConsumo)
				mayorConsumo.add(mes);
			
		}
		System.out.println("Mayor importe registrado: $" + maxConsumo);
		for (Mes meses : mayorConsumo) {
			System.out.println(meses);
		}
		
	}
		
	
}
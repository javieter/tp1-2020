package ejercicio6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GastoAnual gastoAnual = new GastoAnual();
		gastoAnual.agregarGasto(Mes.ENERO, "administracion", 1500);
		gastoAnual.agregarGasto(Mes.ENERO, "tecnico", 150);
		gastoAnual.agregarGasto(Mes.FEBRERO, "tecnico", 500);
		gastoAnual.agregarGasto(Mes.MARZO, "comercial", 750);
		gastoAnual.agregarGasto(Mes.ABRIL, "funcional", 200);
		gastoAnual.agregarGasto(Mes.MAYO, "comercial", 7500);
		gastoAnual.agregarGasto(Mes.JUNIO, "administracion", 500);
		gastoAnual.agregarGasto(Mes.JULIO, "funcional", 50);
		gastoAnual.agregarGasto(Mes.AGOSTO, "funcional", 300);
		gastoAnual.agregarGasto(Mes.SEPTIEMBRE, "tecnico", 500);
		gastoAnual.agregarGasto(Mes.OCTUBRE, "comercial", 300);
		gastoAnual.agregarGasto(Mes.NOVIEMBRE, "administracion", 1000);
		gastoAnual.agregarGasto(Mes.DICIEMBRE, "comercial", 400);
		gastoAnual.agregarGasto(Mes.OCTUBRE, "funcional", 7200);
		
		System.out.println("Gasto del rubro tecnico: " + gastoAnual.gastoAcumulado("tecnico"));
		System.out.println("Gasto del rubro administracion: " + gastoAnual.gastoAcumulado("administracion"));
		System.out.println("Gasto del rubro comercial: " + gastoAnual.gastoAcumulado("comercial"));
		System.out.println("Gasto del rubro funcional: " + gastoAnual.gastoAcumulado("funcional"));
		
		gastoAnual.informarConsumosPorMes();
		
		System.out.println();
		
		gastoAnual.informarMesMayorConsumo();
		
	}

}

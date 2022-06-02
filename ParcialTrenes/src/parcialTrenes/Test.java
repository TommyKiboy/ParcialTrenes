package parcialTrenes;

public class Test {

	public static void main(String[] args) {
		
		
		EstacionDeCarga estacionDeCarga = new EstacionDeCarga("Estacion");
		
		int tren1 = estacionDeCarga.crearFormacion();
		
		int tren2 = estacionDeCarga.crearFormacion();
		
		
		
		
		System.out.println(estacionDeCarga.agregarVagones(tren1, 5, TipoVagon.MEDIUM));
		
		System.out.println(estacionDeCarga.agregarVagones(tren1, 7, TipoVagon.LARGE));
		
		System.out.println(estacionDeCarga.agregarVagones(tren2, 20, TipoVagon.SMALL));
		
		
		
		System.out.println(estacionDeCarga.agregarVagones(tren2, 20, TipoVagon.MEDIUM));
		
		System.out.println(estacionDeCarga.agregarVagones(999, 20, TipoVagon.LARGE));
		
	    System.out.println(estacionDeCarga.cargarTren(tren1, 165));
		
	    System.out.println(estacionDeCarga.cargarTren(tren1, 200));
		
	    System.out.println(estacionDeCarga.cargarTren(tren2, 240));
		
	    System.out.println(estacionDeCarga.cargarTren(tren2, 1000));
	    
	    System.out.println(estacionDeCarga.cargarTren(999, 10));
		
		estacionDeCarga.listarCapacidadDisponible();
		
		System.out.println(estacionDeCarga.sacarVagonesVacios(tren1));
		
		System.out.println(estacionDeCarga.sacarVagonesVacios(tren1));
		
		System.out.println(estacionDeCarga.sacarVagonesVacios(999));
		
	}

}

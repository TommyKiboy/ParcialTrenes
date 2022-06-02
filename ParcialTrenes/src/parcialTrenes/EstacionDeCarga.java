package parcialTrenes;

import java.util.ArrayList;

public class EstacionDeCarga {

	private Mensaje mensaje;
	
	private final static int LIMITE_VAGONES = 30;
	
	private static final int CAPACIDAD_LARGE = 50;

	private static final int CAPACIDAD_MEDIUM = 40;

	private static final int CAPACIDAD_SMALL = 30;
	
	private String nombre;
	
	private ArrayList <Tren> trenes = new ArrayList<Tren>();
	
	public EstacionDeCarga(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int crearFormacion() {
		
		Tren tren = new Tren();
		
		trenes.add(tren);
		
		return tren.getTrenID();
	}
	
	public Mensaje agregarVagones(int trenID, int cantVagones, TipoVagon tipo) {
		
	    mensaje = Mensaje.AGREGADO_OK;
		
		if (trenID > 0 && trenID <= trenes.size()) {
			
			Tren tren = trenes.get(trenID - 1);
			
			ArrayList<Vagon> arrayVagones = tren.getArrayVagones();
			
			if ( (cantVagones + arrayVagones.size()) <= LIMITE_VAGONES) {
				
				for (int indice = 1; indice <= cantVagones; indice++) {
					
					Vagon vagon = new Vagon(tipo);
					
					arrayVagones.add(vagon);
					
					switch (tipo) {
						case SMALL: {
							
							tren.setCapacidad(CAPACIDAD_SMALL);
							
							
							
							break;
						}
						case MEDIUM: {
						
							tren.setCapacidad(CAPACIDAD_MEDIUM);
							
						
							
							break;
						} 
					
						case LARGE: {
							
							tren.setCapacidad(CAPACIDAD_LARGE);
							
							break;
						}
					
					
					}
					
					
				}
				
				mensaje = Mensaje.AGREGADO_OK;
			
			} else {
				
				mensaje = Mensaje.CANT_VAGONES_INVALIDA;
			}
		
		} else {
			
			mensaje = Mensaje.NO_EXISTE_TREN;
		}
		
		return mensaje;	
	}
	
	
	
	
	
	
	public boolean cargarTren(int trenID, double cantTrigo) {
		
		boolean resultado = false;
		
		if (trenID > 0 && trenID <= trenes.size()) {
			
			ArrayList<Vagon> arrayVagones = trenes.get(trenID - 1).getArrayVagones();
				
			double capacidadDisponible = trenes.get(trenID - 1).getDisponible();
				
			if (cantTrigo <= capacidadDisponible) {
					
				trenes.get(trenID - 1).setCarga(cantTrigo);
				
				double restante = cantTrigo;
				
				for (int indice = 0; indice < arrayVagones.size(); indice++) {
					
					if (restante >= 1) {
						
						Vagon vagon = arrayVagones.get(indice);
						
						restante = vagon.llenar(restante);
						
					}
					
			
				}
				
				resultado = true;
			}
				
			
		}
		
		return resultado;
	}
	
	
	
	
	
	
	public void listarCapacidadDisponible() {
	
		for (int indice = 0; indice < trenes.size(); indice++) {
			
			System.out.println(trenes.get(indice).toString());
			
		}
		
		
	}
	
	
	
	public int sacarVagonesVacios(int trenID) {
		
		int vagones = 0;
		
		if (trenID > 0 && trenID <= trenes.size()) {
			
			Tren tren = trenes.get(trenID - 1);
			
			ArrayList<Vagon> arrayVagones = tren.getArrayVagones();
			
			for (int indice = 0; indice < arrayVagones.size(); indice++) {
				
				Vagon vagon = arrayVagones.get(indice);
				
				if (vagon.getCarga() == 0) {
					
					arrayVagones.remove(indice);
					
					indice = indice - 1;
					
					vagones++;
				}
				
			}
			
		} else {
			
			vagones = -1;
		}
		
		return vagones;
	}
	
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	


package parcialTrenes;

import java.util.ArrayList;

public class Tren {

	

	
	
	private static int contadorTrenes = 0;
	
	private int trenID;
	
	private double capacidadTotal;
	
	private double carga;
	
	private double disponible;;
	
	private ArrayList<Vagon> vagones = new ArrayList<Vagon>();


	
	
	public Tren () {
		
		contadorTrenes++;
		
		this.trenID = contadorTrenes;
		
	}
	
	

	
	public void setCarga(double carga) {
		
		if (carga <= this.capacidadTotal) {
			
			this.carga += carga;
			
			this.disponible = this.disponible - carga;
			
		} else {
			
			System.out.println("Error. Supera la capacidad total.");
		}
		
	}
	
	
	public void setTrenID(int trenID) {
		
		this.trenID = trenID;
	}
	
	
	public int getTrenID() {
		
		return trenID;
	}


	public double getDisponible() {
		
		return disponible;
	}
	
	public int getCantVagones() {
		
		int cantVagones = (this.vagones.size() - 1);
		
		return cantVagones; 
	}

	public int getContadorTrenes() {
		
		return contadorTrenes;
	}

	public ArrayList<Vagon> getArrayVagones() {
		
		return vagones;
	}
	
	public void setCapacidad(int nuevaCapacidad) {
		
		this.capacidadTotal =  this.capacidadTotal + nuevaCapacidad;
		
		setDisponible(nuevaCapacidad);
	}
	
	public void setDisponible(int disponible) {
		
		this.disponible = this.disponible + disponible;
	}
	
	public String toString() {
		
		double porcentaje = (100 * this.disponible) / this.capacidadTotal;
		
		return "TrenID: "+this.trenID+" / Capacidad disponible: %"+porcentaje;
	}
	
	
}

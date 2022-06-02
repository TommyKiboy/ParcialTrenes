package parcialTrenes;

public class Vagon {
	
	private static final int CAPACIDAD_LARGE = 50;

	private static final int CAPACIDAD_MEDIUM = 40;

	private static final int CAPACIDAD_SMALL = 30;
	
	private TipoVagon tipoVagon;
	
	private int capacidad;
	
	private int carga = 0;
	
	private int disponible;
	
	public Vagon(TipoVagon tipo) {
		
		this.tipoVagon = tipo;
		
		switch (tipo) {
			case SMALL: {
			
				this.capacidad = CAPACIDAD_SMALL;
				
				this.disponible = CAPACIDAD_SMALL;
				
				break;
			}
			case MEDIUM: {
			
				this.capacidad = CAPACIDAD_MEDIUM;
				
				this.disponible = CAPACIDAD_MEDIUM;
				
				break;
			}
			case LARGE: {
				
				this.capacidad = CAPACIDAD_LARGE;
				
				this.disponible = CAPACIDAD_LARGE;
				
				break;
			}
		}
		
	}
	
	
	public double llenar(double carga) {
		
		double restante = carga;
		
		while (this.disponible >= 1) {
		
			restante = restante - 1;
			
			this.disponible = this.disponible - 1;
			
			this.carga = this.carga + 1;
		
		}
		
		return restante;
	}
	
	public int getCarga() {
		
		return this.carga;
	}
	
	
	
}

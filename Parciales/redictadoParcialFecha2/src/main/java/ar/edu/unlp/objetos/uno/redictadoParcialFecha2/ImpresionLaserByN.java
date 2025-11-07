package ar.edu.unlp.objetos.uno.redictadoParcialFecha2;


public class ImpresionLaserByN extends Trabajo{
	private int cantidadPaginas;
	private String tipo;
	
	
	public ImpresionLaserByN(int cantidadDePaginas,String tipo) {
		this.cantidadPaginas=cantidadDePaginas;
		this.tipo=tipo;
	}
	
	public double calcularCostoDeImpresion() {
		double total=0;
		if(this.tipo.equals("simple faz")) {
			total=this.cantidadPaginas*3;
		}else if(this.tipo.equals("doble faz")) {
			total=this.cantidadPaginas*2;
		}
		
		return total;
	}
	
	public double calcularTiempoDeImpresion() {
		return 0.1*this.cantidadPaginas;
	}
	
	
	public String descripcion() {
	    return "Impresión BN, cant páginas: " + this.cantidadPaginas + ", " + this.tipo;
	}

}

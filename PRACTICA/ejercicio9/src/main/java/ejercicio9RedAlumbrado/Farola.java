package ejercicio9RedAlumbrado;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Farola {
	private boolean encendida;
	private List<Farola> vecinas;
	
	
	public Farola(){
		this.encendida=false;
		this.vecinas=new ArrayList<Farola>();
	}
	
	public void add(Farola otraFarola) {
		this.vecinas.add(otraFarola); //encapsulo la manipulacion de la coleccion
	}
	public void pairWithNeighbor(Farola otraFarola) {
		
		if(!this.vecinas.contains(otraFarola)) {
			this.add(otraFarola);
			otraFarola.add(this);
		}
//		if(!otraFarola.vecinas.contains(this)) {
//			otraFarola.vecinas.add(this);
//		}
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	
	public void turnOn() {
		if (this.isOff()) {
			this.encendida=true;
			
			this.vecinas.stream() //creo el stream.
				.forEach(farola -> farola.turnOn()); 
			}
	}
	
	public void turnOff() {
		if (this.isOn()) {
			this.encendida=false;
			
			/*for (Farola vecina: this.vecinas) {
				vecina.turnOff();
			}*/
			
			this.vecinas.stream()
				.forEach(Farola::turnOff);
		}
	}
	
	public boolean isOn() {
		return this.encendida;
	}
	
	public boolean isOff() {
		return !this.encendida;
	}
	
	
	
	
}

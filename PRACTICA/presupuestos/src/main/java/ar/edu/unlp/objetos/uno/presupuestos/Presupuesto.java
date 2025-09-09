package ar.edu.unlp.objetos.uno.presupuestos;

import java.time.LocalDate;
import java.util.*;


public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items; // Lista de items
	
	public Presupuesto(String cliente) {
		this.fecha=LocalDate.now();
		this.cliente=cliente;
		this.items=new ArrayList<Item>(); //inicializamos la Lista 
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item); //agrego un item a la lista
	}
	
	/*public double calcularTotal() {
		double total=0;
		for (Item item: items) {
			total+=item.costo();
		}
		return total;
	}*/
	
	public double calcularTotal() {
		
		double total = this.items.stream().mapToDouble(item ->item.costo()).sum();
	return total;
	}
}

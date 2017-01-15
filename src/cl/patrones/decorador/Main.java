package cl.patrones.decorador;

public class Main {
	
	public static void main(String[] args) {
		
		Vendible auto = new FiatUno();
		auto = new CDPlayer(auto);
		auto = new Gasoil(auto);
		
		System.out.println(auto.getDescripcion());
		System.out.println(auto.getPrecio());
	}

}

package cl.patrones.observer;

public class Biblioteca {

	//La biblioteca es quien dispara el evento. Seguramente el estade de un libro
	//no estara en formato String, pero no viene al caso
	public void devuelveLibro(Libro libro){
		if("MALO".equals(libro.getEstado())){
			System.out.println("ESTA MALO");
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObservers();
		}
	}
}

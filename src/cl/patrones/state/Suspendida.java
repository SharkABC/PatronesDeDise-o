package cl.patrones.state;

public class Suspendida implements EstadoVentanilla {
	
	@Override
	public void atende(Persona persona) {
		// El cajero esta ocupado pero si se que hay
		//una persona mayor la atienda igual
		if(persona.getEdad() > 65){
			System.out.println("Atiendiendo a: " + persona.getNombre());
		}else{
			System.out.println("Espere 5 minutos por favor...");
		}
		System.out.println("");
	}
}

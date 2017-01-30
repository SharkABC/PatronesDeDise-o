package cl.patrones.state;

public class Ventanilla {
	
	private String cajero;
	private EstadoVentanilla estado;
	
	public Ventanilla(){
		estado = new Abierta();
	}
	
	//Cambia de estado a ABIERTA
	public void abrete(){
		estado = new Abierta();
	}
	
	//Cambia de estado a SUSPENDIDA
	public void suspendete(){
		estado = new Suspendida();
	}
	
	//Cambia de estado a CERRADA
	public void cierrate(){
		estado = new Cerrada();
	}
	
	//Atendiendo persona segun último estado
	public void atende(Persona persona){
		estado.atende(persona);
	}

	public String getCajero() {
		return cajero;
	}

	public void setCajero(String cajero) {
		this.cajero = cajero;
	}
}

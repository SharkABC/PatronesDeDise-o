package cl.patrones.singleton;

public class InstitutoEducativoThreadSafe {
	 //¿que pasa si dos hilos del programa llaman (la primera vez) al método getInstance()
	 //al mismo tiempo? Bueno aqui podriamos tener un problema, ya que existe la remota 
	 //posibilidad de que se logre crear dos instancias de la clase, en vez de una
	 //como quisieramos. La solución más sencilla es realizar un pequeño cambio:
	
	private static InstitutoEducativoThreadSafe instance = new InstitutoEducativoThreadSafe();
	
	private String nombreInstituto;

	private InstitutoEducativoThreadSafe(){
		
	}
	
	public static InstitutoEducativoThreadSafe getInstance(){
		return instance;
	}
	
	public String getNombreInstituto() {
		return nombreInstituto;
	}

	public void setNombreInstituto(String nombreInstituto) {
		this.nombreInstituto = nombreInstituto;
	}
	
}

package cl.patrones.singleton;

public class InstitutoEducativo {

	private static InstitutoEducativo instance;
	//Se coloca una variable del mismo tipo que la clase llamada, por convencion
	//"instance". Aqui reside todo el secreto de este patron, ya que es dicha variable
	//la que se instancia por unica vez y se devuelve al cliente.
	
	private String nombreInstituto;
	
	private InstitutoEducativo(){
		
	}
	//Se privatiza el constructor para que no se pueda hacer un new InstitutoEducativo()
	//desde otro lugar que no sea dentro de la misma clase.
	
	public static InstitutoEducativo getInstance(){
		if(instance == null){
			instance = new InstitutoEducativo();
		}
		return instance;
	}
	//Para utilizar la unica instancia de la clase, los clientes deberan convocar
	//al metodo getInstance(). Si observan la condicion del if solo sera true 
	//la primera vez.

	public String getNombreInstituto() {
		return nombreInstituto;
	}

	public void setNombreInstituto(String nombreInstituto) {
		this.nombreInstituto = nombreInstituto;
	}

	public static void setInstance(InstitutoEducativo instance) {
		InstitutoEducativo.instance = instance;
	}
	
}

package cl.patrones.command;

/*
 * Clase que simplementa llama al metodo execute
 */
public class Invoker {
	
	private Command command;
	
	public Invoker(Command command){
		this.command = command;
	}
	
	public void run(){
		command.execute();
	}
}

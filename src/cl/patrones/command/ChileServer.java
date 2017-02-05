package cl.patrones.command;

public class ChileServer implements IServer {

	@Override
	public void apagate() {
		System.out.println("Apagando el servidor de Chile");
	}

	@Override
	public void prendete() {
		System.out.println("Prendiendo el servidor de Chile");
	}

	@Override
	public void conectate() {
		System.out.println("Conectando al servidor de Chile");
	}

	@Override
	public void verificaConexion() {
		System.out.println("Verificando el sevidor de Chile");
	}

	@Override
	public void guardaLog() {
		System.out.println("Guardar Log de Chile");
	}

	@Override
	public void cerraConexion() {
		System.out.println("Cerrando conexion con el servidor de Chile");
	}

}

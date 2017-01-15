package cl.patrones.todo;

public abstract class VideoJuegoBuilder {
	
	protected VideoJuego videoJuego;
	
	public VideoJuego getVideoJuego(){
		return videoJuego;
	}
	
	public void crearVideoJuego(){
		videoJuego = new VideoJuego();
	}
	
	public abstract void buildNombre();
	
	public abstract void buildTipo();
	
	public abstract void buildCosto();
	
	public abstract void buildFormatoFisico();
	
	public abstract void buildPlataforma();
}

package cl.patrones.todo;

public class VideoJuegoDirector {
	
	private static VideoJuegoDirector videoJuegoDirector = new VideoJuegoDirector();
	public VideoJuegoBuilder videoJuegoBuilder;
	
	//Singleton
	private VideoJuegoDirector(){
		
	}
	
	public static VideoJuegoDirector getInstance(){
		return videoJuegoDirector;
	}
		
	public void constructVideoJuego(){
		videoJuegoBuilder.crearVideoJuego();
		videoJuegoBuilder.buildNombre();
		videoJuegoBuilder.buildTipo();
		videoJuegoBuilder.buildFormatoFisico();
		videoJuegoBuilder.buildCosto();
		videoJuegoBuilder.buildPlataforma();
	}

	public VideoJuegoBuilder getVideoJuegoBuilder() {
		return videoJuegoBuilder;
	}

	public void setVideoJuegoBuilder(VideoJuegoBuilder videoJuegoBuilder) {
		this.videoJuegoBuilder = videoJuegoBuilder;
	}
}

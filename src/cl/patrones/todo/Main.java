package cl.patrones.todo;

public class Main {
	
	public static void main(String[] args) {
		
		//Metal Gear
		VideoJuegoDirector videoJuegoDirector = VideoJuegoDirector.getInstance();
		videoJuegoDirector.setVideoJuegoBuilder(new MetalGearBuilder());
		videoJuegoDirector.constructVideoJuego();
		
		VideoJuegoBuilder videoJuegoBuilder = videoJuegoDirector.getVideoJuegoBuilder();
		
		System.out.println(videoJuegoBuilder.getVideoJuego().getNombre());
		System.out.println(videoJuegoBuilder.getVideoJuego().getCosto());
		System.out.println(videoJuegoBuilder.getVideoJuego().getTipo());
		System.out.println(videoJuegoBuilder.getVideoJuego().getPlataformas());
		
		System.out.println("--------");
		
		//Battlefield
		videoJuegoDirector.setVideoJuegoBuilder(new BattlefieldBuilder());
		videoJuegoDirector.constructVideoJuego();
		videoJuegoBuilder = videoJuegoDirector.getVideoJuegoBuilder();
		
		System.out.println(videoJuegoBuilder.getVideoJuego().getNombre());
		System.out.println(videoJuegoBuilder.getVideoJuego().getCosto());
		System.out.println(videoJuegoBuilder.getVideoJuego().getTipo());
		System.out.println(videoJuegoBuilder.getVideoJuego().getPlataformas());
	}
}

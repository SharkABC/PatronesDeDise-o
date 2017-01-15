package cl.patrones.todo;

import java.util.ArrayList;
import java.util.List;

public class MetalGearBuilder extends VideoJuegoBuilder {

	public void buildNombre() {
		videoJuego.setNombre("Metal Gear");
	}

	public void buildTipo() {
		videoJuego.setTipo("Aventura");
	}

	public void buildCosto() {
		videoJuego.setCosto(30000);
	}

	public void buildFormatoFisico() {
		videoJuego.setFormatoFisico(true);
	}

	public void buildPlataforma() {
		List<Plataforma> listaPlataformas = this.getPlataformas();
		videoJuego.setPlataformas(listaPlataformas);
	}
	
	private List<Plataforma> getPlataformas(){
		List<Plataforma> listaPlataformas = new ArrayList<Plataforma>();
		
		PlataformaPrototype plataformaPrototypo = new PlataformaPrototype();
		
		try {
			listaPlataformas.add((Plataforma)plataformaPrototypo.getPrototipo(PlataformaPrototype.PLAYSTATION));
			listaPlataformas.add((Plataforma)plataformaPrototypo.getPrototipo(PlataformaPrototype.XBOX));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return listaPlataformas;
	}
}

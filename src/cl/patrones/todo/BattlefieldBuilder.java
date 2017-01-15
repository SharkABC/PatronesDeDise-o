package cl.patrones.todo;

import java.util.ArrayList;
import java.util.List;

public class BattlefieldBuilder extends VideoJuegoBuilder {

	public void buildNombre() {
		videoJuego.setNombre("Battlefield 3");
	}

	public void buildTipo() {
		videoJuego.setTipo("Disparos");
	}

	public void buildCosto() {
		videoJuego.setCosto(45000);
	}

	public void buildFormatoFisico() {
		videoJuego.setFormatoFisico(false);
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

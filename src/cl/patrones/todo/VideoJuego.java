package cl.patrones.todo;

import java.util.List;

public class VideoJuego {
	
	private String nombre;
	private String tipo;
	private int costo;
	private boolean formatoFisico;
	private List<Plataforma> plataformas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public boolean isFormatoFisico() {
		return formatoFisico;
	}
	public void setFormatoFisico(boolean formatoFisico) {
		this.formatoFisico = formatoFisico;
	}
	public List<Plataforma> getPlataformas() {
		return plataformas;
	}
	public void setPlataformas(List<Plataforma> plataformas) {
		this.plataformas = plataformas;
	}
}

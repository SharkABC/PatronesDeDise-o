package cl.patrones.templatemethod;

public class Empleado extends Persona {
	
	private String legajo;
	
	public Empleado(String legajo){
		setLegajo(legajo);
	}

	@Override
	protected String getIdentificacion() {
		// TODO Auto-generated method stub
		return legajo;
	}

	@Override
	protected String getTipoId() {
		// TODO Auto-generated method stub
		return "numero de legajo";
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
}

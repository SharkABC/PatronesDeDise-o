package cl.patrones.facade;

public class Inmobiliaria {

	private MuestraPropiedad muestraPropiedad;
	private VentaInmueble venta;
	private CuentasAPagar cuentasAPagar;
	private AdministracionAlquiler alquiler;
	
	public Inmobiliaria(){
		muestraPropiedad = new MuestraPropiedad();
		venta = new VentaInmueble();
		cuentasAPagar = new CuentasAPagar();
		alquiler = new AdministracionAlquiler();
	}
	
	public void atencionCliente(Persona.Cliente c){
		System.out.println("Atendiendo a un cliente");
	}
	
	public void atencionPropietario (Persona.Propietario p){
		System.out.println("Atendiendo a un propietario");
	}
	
	public void atencionInteresado(Persona.Interesado i){
		System.out.println("Atendiendo a un interesado en una propiedad");
	}
	
	public void atencion(Persona p){
		if(p instanceof Persona.Cliente){
			atencionCliente((Persona.Cliente)p);
		}else if(p instanceof Persona.Propietario){
			atencionPropietario((Persona.Propietario) p);
		}else if(p instanceof Persona.Interesado){
			atencionInteresado((Persona.Interesado) p);
		}
	}
	
	public void mostraPropiedad(int num){
		muestraPropiedad.mostraPropiedad(num);
	}
	
	public void gestionaVenta(){
		venta.gestionaVenta();
	}
	
	public void cobraAlquiler(double monto){
		alquiler.cobro(monto);
	}
	
	public void paga(double monto){
		cuentasAPagar.pagoPropietario(monto);
	}
}

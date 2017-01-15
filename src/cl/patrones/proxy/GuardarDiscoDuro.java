package cl.patrones.proxy;

import java.util.ArrayList;

public class GuardarDiscoDuro implements IGuardar {

	@Override
	public void save(ArrayList datosAGuardar) {
		System.out.println("Guardando datos en el HD");
	}

}

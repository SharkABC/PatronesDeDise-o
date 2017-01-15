package cl.patrones.proxy;

import java.util.ArrayList;

public class ObjetoRemoto implements IGuardar {

	@Override
	public void save(ArrayList datosAGuardar) {
		System.out.println("Guardando datos en el objeto remoto...");
	}
}

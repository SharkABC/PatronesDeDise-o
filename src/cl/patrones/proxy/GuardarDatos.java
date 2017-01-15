package cl.patrones.proxy;

import java.util.ArrayList;

public class GuardarDatos implements IGuardar {

	@Override
	public void save(ArrayList datosAGuardar) {
		
		System.out.println("Hay conexion: " + ConnectionManager.hayConexion());
		
		if(ConnectionManager.hayConexion()){
			new ObjetoRemoto().save(datosAGuardar);
		}else{
			new GuardarDiscoDuro().save(datosAGuardar);
		}
	}
}

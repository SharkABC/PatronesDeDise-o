package cl.patrones.singleton;

/*
 * Define una unica instancia que es accedida mediante un
 * metodo de la clase.
 * 
 * ----
 * Singleton
 * ----
 * Instance: singletonData
 * ----
 * getInstance()
 * getSingletonData()
 * singletonOperation()
 * ----
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		InstitutoEducativoThreadSafe ie = InstitutoEducativoThreadSafe.getInstance();
		ie.setNombreInstituto("Educacion S.A.");
		System.out.println("ie: " + ie.getNombreInstituto());
		
		InstitutoEducativoThreadSafe ie2 = InstitutoEducativoThreadSafe.getInstance();
		System.out.println("ie2: " + ie2.getNombreInstituto());
		
		InstitutoEducativoThreadSafe ie3 = InstitutoEducativoThreadSafe.getInstance();
		System.out.println("ie3: " + ie3.getNombreInstituto());
		
		ie3.setNombreInstituto("Capacitacion S.A.");
		//IE3 cambia el nombre
		
		System.out.println("ie: " + ie.getNombreInstituto());
		//La primera llamada se ve afectada ya que es una 
		//referencia a la misma instancia
		
		
	}

}

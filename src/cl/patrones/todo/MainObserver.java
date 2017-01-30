package cl.patrones.todo;

public class MainObserver {
	
	public static void main(String[] args) {
		
		Observer o = new Observer();
		o.setNombre("OSCAR");
		
		Observer o2 = new Observer();
		System.out.println(o2.getNombre());
	}
}

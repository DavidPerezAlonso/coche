
public class Test {

	public static void main (String args[]) {
		Coche c;

		c = new Coche();
		c.cilindrada= 1800;
		c.color = "plata";
		c.precio = 25000.0;

		System.out.println ("�Qu� coche es este?");
		c.verCoche();

		System.out.println("Vamos a arrancar el coche");
		c.arrancar();

		System.out.println ("�Qu� coche es este?");
		c.verCoche();

		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
	}

}

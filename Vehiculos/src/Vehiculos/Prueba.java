package Vehiculos;

public class Prueba {

	public static void main(String[] args) {
		
		Camion c1 = new Camion("rojo", 5, 15500); 
		Motocicleta m1 = new Motocicleta("Negro");
		Vehiculo v1 = new Vehiculo("Azul", 4, 1800, 140);
		
		c1.ver();
		m1.ver();
		v1.ver();
	}
}

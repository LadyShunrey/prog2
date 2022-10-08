package ej2tp6;

public class Main {
	public static void main(String[] args) {
		
		CentroComputo centro = new CentroComputo();
		
		Computadora compu1 = new Computadora("Lab1", 2560.0);
		Computadora compu2 = new Computadora("Lab2", 5560.0);
		Computadora compu3 = new Computadora("Lab3", 3560.0);
		
		centro.addComputadora(compu1);
		centro.addComputadora(compu2);
		centro.addComputadora(compu3);
	}
}

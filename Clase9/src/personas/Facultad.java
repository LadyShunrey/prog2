package personas;

import ej2tp6.ColaEspera;

public class Facultad {
	ColaEspera alumnos;

	public Facultad() {
		alumnos = new ColaEspera();
	}
	
	public void addAlumno(Alumno a){
		alumnos.addElemento(a);
	}
}

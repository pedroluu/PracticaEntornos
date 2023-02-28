package clasedos;

public class Profesor {
	
	
	private int nombre;
	private int numAlumnos;
	private int horasClase;
	private String asignatura;
<<<<<<< HEAD
	
	
	public Profesor(int nombre, int numAlumnos, int horasClase, String asignatura) {
		super();
		this.nombre = nombre;
		this.numAlumnos = numAlumnos;
		this.horasClase = horasClase;
		this.asignatura = asignatura;
	}


	public int getNombre() {
		return nombre;
	}


	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


	public int getNumAlumnos() {
		return numAlumnos;
	}


	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}


	public int getHorasClase() {
		return horasClase;
	}


	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}


	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", numAlumnos=" + numAlumnos + ", horasClase=" + horasClase
				+ ", asignatura=" + asignatura + "]";
	}
=======
	private String apellido;
	private String dni;
	
	public Profesor() {
		
	}
	
	public Profesor(int nombre, int numAlumnos, int horasClase, String asignatura,String dni,String apellido) {
		super();
		this.nombre = nombre;
		this.numAlumnos = numAlumnos;
		this.horasClase = horasClase;
		this.asignatura = asignatura;
		this.dni= dni;
		this.apellido= apellido;
	}


	public int getNombre() {
		return nombre;
	}


	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


	public int getNumAlumnos() {
		return numAlumnos;
	}


	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}


	public int getHorasClase() {
		return horasClase;
	}


	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}


	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", numAlumnos=" + numAlumnos + ", horasClase=" + horasClase
				+ ", asignatura=" + asignatura + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	
>>>>>>> branch 'NuevaRama' of https://github.com/pedroluu/PracticaEntornos.git
	
	

}

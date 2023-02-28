package claseuno;

public class Alumno {
	
	private String nombre;
	private int notaAsig;
	private String colorPelo;
	private int faltas;
	
	
	public Alumno(String nombre, int notaAsig, String colorPelo, int faltas) {
		super();
		this.nombre = nombre;
		this.notaAsig = notaAsig;
		this.colorPelo= colorPelo;
		this.faltas = faltas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNotaAsig() {
		return notaAsig;
	}


	public void setNotaAsig(int notaAsig) {
		this.notaAsig = notaAsig;
	}


	public String getColorPelo() {
		return colorPelo;
	}


	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}


	public int getFaltas() {
		return faltas;
	}


	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}


	@Override
	public String toString() {
		return "ClaseUno [nombre=" + nombre + ", notaAsig=" + notaAsig + ", colorPelo=" + colorPelo + ", faltas="
				+ faltas + "]";
	}
	
	
	

}

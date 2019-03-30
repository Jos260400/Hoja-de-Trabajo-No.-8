/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructuras de Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 8
 * paciente.java
 * */

public class paciente<E> implements Comparable<E>{
	
	private String nombre;
	private String caso;
	private String prioridad;

	public paciente(String Paciente, String Caso, String Prioridad) {
		super();
		this.nombre = Paciente;
		this.caso = Caso;
		this.prioridad = Prioridad;
	}

	public int compareTo(E Paciente) {
		return this.prioridad.compareTo(((paciente) Paciente).getPrioridad());
	}

	//Sets y Gets

	public String getNombrePaciente() {
		return nombre;
	}

	public void setNombrePaciente(String Paciente) {
		this.nombre = Paciente;
	}

	public String getCaso() { return caso; }

	public void setCaso(String Caso) {
		this.caso = Caso;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	
}
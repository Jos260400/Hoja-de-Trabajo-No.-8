/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructuras de Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 8
 * PriorityQueue.java
 * */

/**
 * Extraído de:
 * Libro: Java Structures, capítulo 13 (Páginas 315 y 316)
 * @param <E>
 */

public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();

	public E remove();

	public void add(E value);

	public boolean isEmpty();

	public int size();

	public void clear();

}
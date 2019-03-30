/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructuras de Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 8
 * main.java
 * */


/**Leer un archivo:
 * https://www.mkyong.com/java/how-to-read-file-in-java-fileinputstream/
 *
 * Vectores:
 * https://www.geeksforgeeks.org/java-util-vector-class-java/
 * https://www.geeksforgeeks.org/vector-elements-method-in-java/
 *
 * Interfaz Queue:
 * https://www.geeksforgeeks.org/queue-interface-java/
 */



import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		int A = 0;
		VectorHeap V  = new VectorHeap();
		@SuppressWarnings("rawtypes")
		Vector<paciente> Pacientes = new Vector<paciente>();
		
		try{
			FileInputStream Stream = new FileInputStream("Archivo.txt");
			DataInputStream Stream2 = new DataInputStream(Stream);
			BufferedReader Stream3 = new BufferedReader(new InputStreamReader(Stream2));
			String Linea;
			String[] partes = new String[3];
			int B;
			int cantP =0;
			
			System.out.println("Pacientes:");
			while ( ( Linea = Stream3.readLine() )!=null){
				int principio=0;
	            int nop=0;
	            B =0;
	            for(int n = 0; n <Linea.length(); n++){
                    if(Character.toString(Linea.charAt(n)).equals(",") && B<3){
                        partes[B] = Linea.substring(principio, n);
                        principio = n+1;
                        nop=nop+1;
                        B = B+1;
                    } 
                 } 
	            B=0;
	            partes[2]= Linea.substring(principio+1, Linea.length());
	            Pacientes.add(new paciente<String>(partes[0],partes[1],partes[2]));
	            cantP++;
	            System.out.println(partes[0]+","+partes[1]+","+partes[2]);
			}
			Stream2.close();

			System.out.println("\n Lista:");
			
			String Tarea="";
			VectorHeap V2 = new VectorHeap(Pacientes);
			for (B=0;i<cantP;i++){
				paciente pacientes = (paciente) V2.remove();
					Tarea = OrdenP+pacientes.getNombrePaciente()+" "+","+pacientes.getCaso()+" "+","+pacientes.getPrioridad()+"\n";
			}
			
			System.out.println(Tarea);
		}
	}
}
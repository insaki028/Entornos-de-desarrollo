/*
 * Se define el paquete donde se encuentra la clase notas y se importa la clase Scanner 
 * para poder solicitar datos al usuario. Luego, se declaran las variables uf1, uf2, uf3, 
 * acu1, acu2, acu3 y def como de tipo double y se inicializan en 0. Se crea un objeto 
 * de la clase Scanner llamado entrada para leer los datos que ingresará el usuario.
 * */
package practica1;
import java.util.Scanner;


public class notas {
	
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	
	Scanner entrada = new Scanner(System.in);
	
/*
 * Se define un método IngresaNotas() que pide al usuario que ingrese las notas del estudiante 
 * y las almacena en las variables correspondientes uf1, uf2 y uf3.
 * */
	
	public void IngresarNotas() {
		
		System.out.println("ingrese las notas del estudiante una por una");
		
		
		System.out.print("ingrese nota numero 1: ");
		uf1= entrada.nextDouble();

		System.out.print("ingrese nota numero 2: ");
		uf2= entrada.nextDouble();
		
		System.out.print("ingrese nota numero 3: ");
		uf3= entrada.nextDouble();
		
	}
	
	
/*
 * Se define un método comprobarcion() que verifica si las notas ingresadas son válidas (menores 
 * o iguales a 10) e imprime un mensaje indicando si cada nota es correcta o no.
 * */
	
	public void comprobacion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}

	}
	
	
/*
 * Se define un método Calculonotas() que calcula la nota definitiva del estudiante a partir de 
 * las notas parciales (uf1, uf2 y uf3) y sus porcentajes de peso (0.35, 0.35 y 0.30, respectivamente). 
 * La nota definitiva se almacena en la variable def.
 * */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
	}
	
/*
 * Se define un método Mostrar() que imprime por pantalla las notas, las notas ponderadas y la nota definitiva.
 * */
	
	public void Mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

/*
 * Se define un método aprobado() que verifica si la nota esta suspendida (menor que 5 y mayor o igual a 0)
 * si la nota esta aprobada (mayor o igual a 5 y menor o igual a 10) o si hay un error en la nota.
 * */
	
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}

/*
 * En el método main() se crea un objeto de la clase notas, se llaman a los métodos IngresaNotas(), 
 * comprobarcion(), Calculonotas(), Mostrar() y aprobado() para realizar los cálculos y mostrar los resultados.
 * */
		
	public static void main(String[] args) {
		
		notas fc= new notas();
		
		fc.IngresarNotas();
		
		fc.comprobacion();
		
		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
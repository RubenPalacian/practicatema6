import java.util.*;

public class practicatema6 {
	

	public static int calculaMenor() {
		int calculaMenor=Integer.MIN_VALUE;
		
	}

	public static int calculaMayor() {
		int calculaMayor=Integer.MAX_VALUE;
		
		
		
	}
	public static int calculaMedia() {
		int media=Math.sqrt(calculaMedia);
		
	}
	
	public static void main(String[] args) {
	
		int[] valor=new int[20];
		
		for(int i=0; i < valor.length; i++){
				 valor[i]= (int)(Math.random()*10)+1;		
				}
		System.out.println("1. Imprimir el mayor valor" + calculaMayor);
		System.out.println("2. Imprimir el menor valor" + calculaMenor);
		System.out.println("3. Calcular la media de todos los valores" + calculaMedia);
		System.out.println("4. Imprimir todos los valores");
		System.out.println("5. Calcular el número de veces que se encuentra un número");
		System.out.println("0. SALIR");
	    Scanner sc=new Scanner(System.in);
		System.out.println(valor[i]);
		
			
	}

}		
		
		/*Menu:
		 * 		1. Imprimir el mayor valor del array
		 * 		2. Imprimir el menor valor del array
		 * 		3. Calcular la media de todos los valores
		 * 		4. Imprimir todos los valores del array
		 * 		0. SALIR
		 * 		OPCIONAL: Calcular el número de veces que se encuentra un número(pedido por teclado al usuario)
		 				
		/*Crear una aplicación en Java que cree un array de 20 elementos. Cada elemento del array debe contener un
número entero comprendido entre 1 y 10. Los números enteros deben generarse de manera aleatoria.
Además, el programa debe mostrar un menú al usuario con las siguientes opciones:
 Imprimir el mayor valor del array.
 Imprimir el menor valor del array.
 Calcular la media de todos los valores del array.
 Imprimir todos los valores del array.
Se mostrará el menú anterior hasta que el usuario introduzca un 0 por teclado.
Debe generarse un método para cada una de las opciones del menú anterior.
Opcional: Crear una opción más en el menú que permita calcular el número de veces que se encuentra un
número (pedido por teclado al usuario) dentro del array (número de ocurrencias*/


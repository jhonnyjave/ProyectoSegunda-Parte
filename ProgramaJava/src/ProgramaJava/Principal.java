package ProgramaJava;
import java.io.*;
import java.util.Scanner;
public class Principal {		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 23456789;
		float flotante = 5.6f ; // reales
		double doble = 5.6;	    //reales mayor presicion mas decimales
		boolean boleano = true;
		String texto = "Pepe Peralta";
		
		System.out.println(numero);
		System.out.println(flotante);
		System.out.println(doble);
		System.out.println(texto + numero);
		System.out.println(boleano);
		
		double resultado = doble/doble; 
		float res= (float) (doble/doble); 
		int x = (int) (doble/doble);
		
		System.out.println(resultado);
		System.out.println(res);
		
		
		if(numero==3)
			System.out.println("Se cumple la condicion");
		System.out.println("No se cumple la condicion");
		
		
		//     &&  and
		//     ||  or
		//     ()
		//     ^
		//     * / 
		//     + -
		//     
		
		/*swich(dia) {
			case 1:
				System.out.println("uno");
				break;
		}*/
		
		Scanner leer= new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int nro1=leer.nextInt();
		System.out.print("Ingrese un segundo  numero: ");
		int nro2=leer.nextInt();
		
		System.out.print("La suma es: "+(nro1+nro2));
		res=10;
		while(res > 1){
		 	System.out.println("hola"+res);
		 	res=res-1;
		}
	
			
		// estructura while   
	  int resp=8;	   
	  do {
	  	System.out.println("while");
	  	resp=resp-1;
	  }while(resp>5);
	  
	  
	  //Estructura for
	  
	  for(int i=0; i<5; i++){
	  		System.out.println("for");
	  }
	  
	  Persona p = new Persona ();
	  System.out.println(p.toString());
	  
	}
}

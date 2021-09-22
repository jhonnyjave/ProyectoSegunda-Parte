package ProgramaJava;

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
		
	}

}

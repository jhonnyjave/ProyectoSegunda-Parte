package ProgramaJava;

public class Persona {
	String nombre;
	double estatura;
	int edad; 
	double peso;
	int ci;

	public Persona() {
		nombre="jhonny";
		estatura=1.60;
		edad=28; 
		peso=76;
		ci=12345678;
	}
	
	public String getNombre() 		{	return nombre;	}
	public void setNombre(String n) {	this.nombre=n;	}
	public double getEstatura() 	{	return estatura;	}
	public void setEstatura(double estatura) {	this.estatura = estatura;	}
	public int getEdad() 			{	return edad;	}
	public void setEdad(int edad)    {	this.edad = edad;	}
	public double getPeso() 		 {	return peso;	}
	public void setPeso(double peso) {	this.peso = peso;	}
	public int getCi() 				 {	return ci;	}
	public void setCi(int ci)		 {	this.ci = ci;	}

	@Override
	public String toString() {
	return "Persona [nombre=" + nombre + ", estatura=" + estatura + ", edad=" + edad + ", peso=" + peso + ", ci="
				+ ci + "]";
	}
	
	//************************************herencia***********************
	
	Estudiante est1=new Estudiante();
	
}

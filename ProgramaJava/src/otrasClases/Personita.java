package otrasClases;

public class Persona extends Personita {
	
	@Override
	Public abstract String decirNombre(String nom,String ap) {
		String msj = "Soy el empleado" + nom +" " + ap;
		return msj;
	}
	@Override
	Public abstract void caminar();
	
	public void hablar() {
		System.out.println("Soy un empleado caminando");
	}
}
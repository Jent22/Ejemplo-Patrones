public abstract class Plantilla {
	public final void FabricarCel(){
		Modelo();
		CPU();
		Pantalla();
		Camara();
		System.out.println("Telefono creado");
	}

	private void Camara() {
		System.out.println("Agregando camara");
	}
	public abstract void CPU();
	public abstract void Pantalla();
	private void Modelo() {
		System.out.println("Modelo creado");
	}
}
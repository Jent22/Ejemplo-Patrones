public class BuilderCelular {
	private String Capacidad;
	private String Marca;
	public String getCapacidad() {
		return Capacidad;
	}

	public String getMarca() {
		return Marca;
	}
	private BuilderCelular(BuilderCell builder) {

		this.Marca=builder.Marca;
		this.Capacidad=builder.Capacidad;	
	}
	public static class BuilderCell{
		private String Capacidad;
		private String Marca;
		public BuilderCelular build(){
			return new BuilderCelular(this);
		}
		public BuilderCell(String Capacidad, String Marca){
			this.Capacidad=Capacidad;
			this.Marca=Marca;
		}
	}

}


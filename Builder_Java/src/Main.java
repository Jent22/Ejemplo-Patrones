
public class Main {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		BuilderCelular comp = new BuilderCelular.BuilderCell(
				"64 GB", "Sony").build();
		BuilderCelular comp2 = new BuilderCelular.BuilderCell(
				"32 GB", "Huawei").build();
		System.out.println(comp+" "+comp2);
	}

}


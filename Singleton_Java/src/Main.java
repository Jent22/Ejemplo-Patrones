
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton data1= Singleton.getInstance();
		data1.setValue("Si aparece el mensaje funciona ;)");
		System.out.print(data1.getValue());
	}

}

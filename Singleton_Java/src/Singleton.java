
public class Singleton {
private String x;
private static Singleton data;
private Singleton() {
	 
 }
 public static Singleton getInstance() {
	 if(data==null) {
		 data = new Singleton();
	 }
	 return data;
 }
 public void data(String ptbl) {
	 System.out.println(ptbl);
 }
 public void setValue(String ptbl) {
	 x = ptbl;
 }
 public String getValue() {
	 return x;
 }
}

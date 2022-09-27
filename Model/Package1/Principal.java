package Package1;
public class Principal{
	
	
	public static void main(String[] args) {
		
		Receptor r = new Receptor();

		r.cuenta=123;
	 	System.out.println("Se aprobo? :  "+ r.aprovarTransaccion()) ;
	}


}
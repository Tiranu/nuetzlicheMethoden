package nuetzlicheMethoden;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerzeichenEntfernen("Das ist ein Test");
	}

	public static String leerzeichenEntfernen(String test)
	{
		System.out.println(test);
		String ohneLeerzeichen = test.replaceAll(" ", "");
		System.out.println(ohneLeerzeichen);
		return ohneLeerzeichen;
	}
	
}

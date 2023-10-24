package flyweight;

public class Client {
	public static void main(String []args) {
		 ILetter smallA = CharFactory.createChar('a');
		 ILetter capitalA = CharFactory.createChar('A');
	}
}


public class StringException extends Exception{
	public StringException() {
		System.out.println("StringExpection has been thrown");
	}
	public String toString() {
		return("The string is over 20 characters" );
	}

}

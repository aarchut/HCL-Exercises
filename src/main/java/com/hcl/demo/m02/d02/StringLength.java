import java.util.Scanner;

public class StringLength {
	public static void main(String [] args) {
		
		int i =0; 
		String str; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name without any spaces, capitilazing the beginning of first, last and middle name: ");
		str = sc.nextLine();
		
		try {
		int x = str.length();
		if(x < 20) {
			System.out.println("The length of " + str + " is " + x + " characters long");
				
			
		}else 
			throw new StringException();
		
	
		}
	 catch(StringException e) {
		System.out.println(e);

} 
	System.out.println("The initials of the name are: ");
	 for (int n = 0; n < str.length(); n++) {
		    
         if(Character.isUpperCase(str.charAt(n))){    
         System.out.print(str.charAt(n));
}

	}
	 }
	 }

	
	



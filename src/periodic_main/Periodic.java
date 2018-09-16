package periodic_main;

import java.util.Scanner;

//import java.util.Scanner;

public class Periodic {

	public static void main(String[] args) 
	
	{
		
		boolean run=true;
		
		while (run)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Please put in your element");
			String name = s.nextLine();
			
			if (name.equals("exit"))
			{
				run=false;
				Rules.elements.forEach((key, value) -> System.out.println("Symbol " + key + " , Element name " + value));
				break;
			}
			Rules.symbols(name);
			
		}
		

		
		 
		
		
	}
}

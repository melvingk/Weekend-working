package periodic_main;

import java.util.HashMap;

public class Rules {
	
	//input=input.toLowerCase();  
	// sets all the chars in the string to lower-case
	
	
	static HashMap <String, String> elements = new HashMap<>();
	
	
	public static void rule (String elementName, String symbol)
	{
		
		
		String fLetter= symbol.substring(0,1);
		int fPosition= elementName.indexOf(fLetter);
		
		String sLetter= symbol.substring(1,2);
		int sPosition= elementName.indexOf(sLetter);
				
		
			if (elementName.contains(fLetter) && elementName.contains(sLetter))
			{
				if((fPosition<sPosition) || (fLetter.equals(sLetter)))
				{
								
						System.out.println("Its possible");
									
				}
				else
				{
					System.out.println("Its not possible");
				}
			}   	
	}
	

public static void symbols(String name)

{
String output="";

	
		for (int i=0;i<name.length()-1; i++)
		{
			for (int j=0;j<name.length(); j++)
			{
				if (j<i || j==i)
	
				{
					continue;
				
				}
				output = name.substring(i,(i+1))+ name.substring(j, j+1);
				
				if (elements.get(output) == null)
				{
					elements.put(output, name);
					System.out.println(output);
					return;
					
				}
			}
		
		}
	}

	}
	
			
		
	


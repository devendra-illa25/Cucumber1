package learning;

import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
	//predefined class in java known as pattern class.
		
	//. means single letter/symbol/number 
		//* means any number/symbol/letter can be repeated any number of times.
		
		//boolean matchingStatus = Pattern.matches(".*Arun.*", "My name is Arun Motoori,");
		
		//boolean matchingStatus = Pattern.matches("Arun", "My name is Arun Motoori,");
		
		//boolean matchingStatus = Pattern.matches("java", "Java");
		//boolean matchingStatus = Pattern.matches("[Jj]ava", "Java");
		
		//boolean matchingStatus = Pattern.matches("ye[sp]", "yes");
		//boolean matchingStatus = Pattern.matches("ye[sp]", "yep");
		
		//boolean matchingStatus = Pattern.matches("[sft]it", "sit");
		//boolean matchingStatus = Pattern.matches("[sft]it", "sit");
				
		
		//boolean matchingStatus = Pattern.matches(".ava", "lava");
		//boolean matchingStatus = Pattern.matches(".ava", "99ava");
		
		//boolean matchingStatus = Pattern.matches("[0-9]am", "9am");
		//boolean matchingStatus = Pattern.matches("[0-9]am", "sam ");

//		boolean matchingStatus = Pattern.matches("[a-z]et", "set");
//		boolean matchingStatus = Pattern.matches("[a-z]et", "Set");

		//boolean matchingStatus = Pattern.matches("[A-Z]et", "set");
		//boolean matchingStatus = Pattern.matches("[a-zA-Z0-9]et", "0et");
		
		
		//[^0-9]  ^ means not numeric value
		boolean matchingStatus = Pattern.matches("[^0-9]et", "aet");
		
		
		
		if(matchingStatus){
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
	}

}

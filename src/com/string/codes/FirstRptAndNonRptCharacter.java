package com.string.codes;

public class FirstRptAndNonRptCharacter {
	    
	public static void main(String[] args)  {
		FirstRptAndNonRptCharacter frc = new FirstRptAndNonRptCharacter();
		frc.mainLoop();
		frc.mainLoop1();
	}
    void mainLoop() {
  
        String str = "tamilan";
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int firstIndex = str.indexOf(character);
            int lastIndex = str.lastIndexOf(character);
            if(firstIndex != lastIndex) {
                System.out.println("The character '"+character+"' is repeated");
                break; 
            }
        }
    }
    void mainLoop1() {
    	  
        String str = "tamilan";
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int firstIndex = str.indexOf(character);
            int lastIndex = str.lastIndexOf(character);
            if(firstIndex == lastIndex) {
                System.out.println("The character '"+character+"' is not repeated");
                break; 
            }
        }
    }
}

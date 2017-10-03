package com.string.codes;

public class RepetitionsInString{
    public static void main(String[] args) {
   
        String str="india";
        int count=0;
        String temp="";
        for(int i=0;i < str.length();i++){
            char c1=str.charAt(i);
            for(int j=i;j < str.length();j++){
				char c2=str.charAt(j);  
                if(c1==c2 && temp.indexOf(c1)==-1){
                    count=count+1;
                }
            }
			if(temp.indexOf(c1)==-1){
				temp=temp+c1;
				System.out.println("The Character   " + c1 + "   has occurred   " + count + "    times");
			}  
		count=0;
        }
    }
}

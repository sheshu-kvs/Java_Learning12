package com.sheshu;

public class ReverseString {
	static void usingreverse(String str) {
		int i=str.length()-1;
		String t="";
		while(i>=0) {
			char ch=str.charAt(i);
			System.out.println(ch);
			t=t+ch;
			i--;
		}
		if(t.equals(str)) {
			System.out.println("Palin");
		}
		else {
			System.out.println("Not Palin");
		}
		
	}
	
	
	 static void usingdowhile(String str) {
		 int i=str.length()-1;
		 String t="";
		 do	{
			 char ch=str.charAt(i);
			 t=t+ch;
			 i--;
		 }
		 while(i>=0);
		 if(t.equals(str)) {
			 System.out.println("Entered String is the Palin");
		 }
		 else {
			 System.out.println("Entered String was not Palin");
		 }
     }
	 
	 static void pracdowhile() {
		 int num=11;
		 do {
			 System.out.println("Entered number was greater than 11");
			 num--;
		 }while(num>5);
	 }
	public static void main(String[] args) {
		String str="mam";
		usingreverse(str);
		usingdowhile(str);
		pracdowhile();
	}
	

}

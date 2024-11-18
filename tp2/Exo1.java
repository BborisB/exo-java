package tp2;

import java.util.*;

public class Exo1 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var myStr = scanner.next();
		System.out.println("nombre de lettre : " + letterCount(myStr));
	}
	
	private static int letterCount(String myStr) {
		var c = 0;
		for(int i=0;i<myStr.length();i++)
			if(Character.isLetter(myStr.charAt(i)))
				c++;
		return c;
	}
	
	private static int strLength(String str, int c) {
		try {
			
			return strLength(str,c);
		}
		catch(Exception e) {
			return c;
		}
	}
}

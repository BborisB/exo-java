package tp2;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var myStr = scanner.next();
		var strBuilder = new StringBuilder(myStr);
		for(int i=0;i<myStr.length();i++) {
			if(i%2==0) {
				strBuilder.setCharAt(i, '*');
			}
		}
		System.out.println("Nouvelle chaine : " + strBuilder);
	}

}

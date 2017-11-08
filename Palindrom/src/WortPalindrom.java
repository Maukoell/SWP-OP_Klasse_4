// import java.util.Scanner;

public class WortPalindrom {
	public static boolean pruefenCaseInsensetive(String wort) {
		wort = wort.toLowerCase();
		char[] wortChar = wort.toCharArray();
		
		 int i1 = 0;
		    int i2 = wortChar.length - 1;
		    while (i2 > i1) {
		        if (wortChar[i1] != wortChar[i2]) {
		            return false;
		        }
		        ++i1;
		        --i2;
		    }
		    return true;
	}
	
	public static boolean pruefenCaseSensetive(String wort) {
		char[] wortChar = wort.toCharArray();
		
		 int i1 = 0;
		    int i2 = wortChar.length - 1;
		    while (i2 > i1) {
		        if (wortChar[i1] != wortChar[i2]) {
		            return false;
		        }
		        ++i1;
		        --i2;
		    }
		    return true;
	}

	
	public static void main(String[] args) {
//		System.out.println("Welches Wort wollen Sie überprüfen?");
//		Scanner s = new Scanner(System.in);
//		String wort = s.toString();
		String wort = "Hannah";
		if(pruefenCaseInsensetive(wort)) {
		System.out.println(wort + " ist ein Palindrom.");	
		}
	}
}

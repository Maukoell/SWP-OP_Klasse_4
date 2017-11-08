
public class Datumspalindrom {

	
	
	private static boolean palindromEinfach(String datum) {
		StringBuilder sb = new StringBuilder(datum);
		char punkt = '.';
		
		for (int i = 0; i < sb.length(); i++) {
			if( sb.charAt(i) == punkt) {
				sb.deleteCharAt(i);
			}
		}
		
		
		char c[] = sb.toString().toCharArray();
		int i1 = 0;
	    int i2 = c.length - 1;
	    while (i2 > i1) {
	        if (c[i1] != c[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
	
	
	
	public static void main(String[] args) {
		String datum1 = "21.02.2012";
		if(palindromEinfach(datum1)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Kein Palindrom");
		}
	}
}

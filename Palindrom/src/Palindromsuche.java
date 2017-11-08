
public class Palindromsuche {
	static int day = 0;
	static int month = 0;

	public static boolean check(String s) {
		String reversed = new String();

		for (int j = s.length() - 1; j >= 0; j--) {
			reversed += s.charAt(j);
		}
		if (s.equals(reversed)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void checkThrough(int startYear, int endYear){
		String date;
		int counter = 0;
		month = 1;
		while (startYear < endYear){
			day++;
			if ((day == 31 && (month == 9 || month == 11)) || (day == 32 && (month == 10 || month == 12)) || (day == 32 && month % 2 == 1 && month != 9 && month != 11 ) || (day == 31 && month % 2 == 0 && month != 8 && month != 10 && month != 12) || (day == 32 && month == 8) || (day == 29 && month == 2 && startYear % 4 != 0) || (day == 30 && month == 2 && startYear % 4 == 0) ){
				month++;
				day = 1 ;
			}
			if (month > 12){
				startYear ++;
				month = 1;
			}
			date = Integer.toString(startYear) + Integer.toString(month) + Integer.toString(day);
			if (check(date) == true){
				counter++;
				System.out.println("Folgendes Datum ist ein Palindrom: " + startYear + "/" + month + "/" + day + " - " + date);
			}
			
		}
		System.out.println();
		System.out.println("Anzahl der gefundenen Datumspalindrome: " + counter);
	}

	public static void main(String[] args) {
		checkThrough(1900, 2100);  
	}
}

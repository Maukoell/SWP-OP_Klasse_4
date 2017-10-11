import java.util.Scanner;

public class Binaersuche {

	public static void listeFuellen(int[] liste) {
		
		for (int i = 0; i < liste.length; i++) {
			liste[i] = i + 1;
		}
	}

	public double minAnzahl(double a) {
		return Math.ceil(Math.log(a) / Math.log(2));
	}
	
	public void suche(int[] list, int min, int max, int suchZahl) {

		int temp = (min + max) /2;
		int suche = 1;

		while (list[temp - 1] != suchZahl) {
			suche++;
			temp = (min + max) / 2;
			System.out.println("Stelle: " + temp);
			if (list[temp - 1] < suchZahl) {
				min = temp + 1;
			} else {
				max = temp - 1;
			}

		} 

		System.out.println();
		System.out.println("Die minimale Suchanzahl beträgt " + minAnzahl(list.length) );
		System.out.println("Die gesuchte Zahl " + suchZahl + " wurde gefunden.");
		System.out.println("Es wurden " + suche + " Durchläufe benötigt.");

	}

	public static void main(String[] args) {
		Binaersuche b = new Binaersuche();
		Scanner s = new Scanner(System.in);

		System.out.println("Größe der Liste: ");
		int groesse = s.nextInt();
		int[] list = new int[groesse];
		System.out.println("Gesuchte Zahl: ");
		int suchZahl = s.nextInt();
		
		b.listeFuellen(list);
		b.suche(list, 1, list.length, suchZahl);
		s.close();

	}
}

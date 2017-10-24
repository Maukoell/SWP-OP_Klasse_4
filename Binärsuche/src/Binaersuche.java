import java.util.Scanner;

public class Binaersuche {

	private int suchDurchlaeufe = 0;
	
	public void listeFuellen(int[] liste) {
		
		for (int i = 0; i < liste.length; i++) {
			liste[i] = i + 1;
		}
	}

	public double maxAnzahl(double a) {
		return Math.ceil(Math.log(a + 1) / Math.log(2));
	}
	
	public void sucheRekursiv(int[] list, int min, int max, int suchZahl) {
		int temp = (min + max) / 2;
		suchDurchlaeufe++;
		if (list[temp - 1] == suchZahl) {
			System.out.println("Die maximale Suchanzahl betr�gt " + maxAnzahl(list.length) );
			System.out.println("Die gesuchte Zahl " + suchZahl + " wurde gefunden.");
			System.out.println("Es wurden " + suchDurchlaeufe + " Durchl�ufe ben�tigt.");
		}
		if (list[temp - 1] < suchZahl) {
			sucheRekursiv(list, temp + 1, max, suchZahl);
		}
		if (list[temp - 1] > suchZahl) {
			sucheRekursiv(list, min, temp - 1, suchZahl);
		}
		if (list[temp - 1] < min) {
			System.out.println("Die Zahl wurde nicht gefunden.");
		}
		
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
		System.out.println("Die maximale Suchanzahl betr�gt " + maxAnzahl(list.length));
		System.out.println("Die gesuchte Zahl " + suchZahl + " wurde gefunden.");
		System.out.println("Es wurden " + suche + " Durchl�ufe ben�tigt.");

	}

	public static void main(String[] args) {
		Binaersuche b = new Binaersuche();
		Scanner s = new Scanner(System.in);

		System.out.println("Gr��e der Liste: ");
		int groesse = s.nextInt();
		int[] list = new int[groesse];
		System.out.println("Gesuchte Zahl: ");
		int suchZahl = s.nextInt();
		
		b.listeFuellen(list);
		b.sucheRekursiv(list, 1, list.length, suchZahl);
//		b.suche(list, 1, list.length, suchZahl);
		s.close();

	}
}

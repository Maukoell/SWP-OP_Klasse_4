import java.util.Scanner;

public class Liste {
	ListElement startElem = new ListElement(1);

	public Liste() {
	}

	public void addLast(Object o) {
		ListElement newElem = new ListElement(o);
		ListElement lastElem = getLastElem();
		lastElem.setNextElem(newElem);
	}

	public void insertAfter(Object prevItem, Object newItem) {
		ListElement newElem, nextElem, pointerElem;
		pointerElem = startElem.getNextElem();
		while (pointerElem != null && !pointerElem.getObj().equals(prevItem)) {
			pointerElem = pointerElem.getNextElem();
		}
		newElem = new ListElement(newItem);
		nextElem = pointerElem.getNextElem();
		pointerElem.setNextElem(newElem);
		newElem.setNextElem(nextElem);
	}

	public void delete(Object o) {
		ListElement le = startElem;
		while (le.getNextElem() != null && !le.getObj().equals(o)) {
			if (le.getNextElem().getObj().equals(o)) {
				if (le.getNextElem().getNextElem() != null)
					le.setNextElem(le.getNextElem().getNextElem());
				else {
					le.setNextElem(null);
					break;
				}
			}
			le = le.getNextElem();
		}
	}

	public boolean find(Object o) {
		ListElement le = startElem;
		while (le != null) {
			if (le.getObj().equals(o))
				return true;
			le = le.nextElem;
		}
		return false;
	}

	public ListElement getFirstElem() {
		return startElem;
	}

	public ListElement getLastElem() {
		ListElement le = startElem;
		while (le.getNextElem() != null) {
			le = le.getNextElem();
		}
		return le;
	}

	public void writeList() {
		ListElement le = startElem;
		while (le != null) {
			System.out.print(le.getObj() + " -- ");
			le = le.getNextElem();
		}
		System.out.println();
	}

	public ListElement getElementBefore(ListElement le) {
		ListElement before = startElem;

		while (!before.getNextElem().equals(le) && le.nextElem != null) {
			before = before.nextElem;
		}

		return before;
	}

	public void bubbleSortInt() {

		for (int i = 0; i < this.getLength(); i++) {
			ListElement le = startElem;
			for (int j = 0; j < this.getLength(); j++) {
				if (le.getNextElem() != null && (int) le.getObj() > (int) le.getNextElem().getObj()) {
					int temp = (int) le.getObj();
					le.setObj(le.getNextElem().getObj());
					le.getNextElem().setObj(temp);
				}else if(le.getNextElem() != null) {
					le = le.getNextElem();
				}
			}

		}

	}

	public int getLength() {
		ListElement le = startElem;
		int counter = 1;

		while (le.getNextElem() != null) {
			counter++;
			le = le.nextElem;
		}

		return counter;

	}

	public void insertNumbers() {
		System.out.println("Wie groﬂ soll die Liste sein?");

		int numbers = 0;
		Scanner s = new Scanner(System.in);
		numbers = s.nextInt();

		for (int i = 0; i < numbers; i++) {
			int zahl = (int) (Math.random() * 10) + 1;
			this.addLast(zahl);
		}
		s.close();

	}

	public static void main(String[] args) {
		Liste list = new Liste();
		// list.addLast(4);
		// list.addLast(3);
		// list.addLast(10);
		// list.addLast(7);
		// list.addLast(5);
		list.insertNumbers();
		System.out.println("Unsorted list:");
		list.writeList();
		System.out.println();
		// System.out.println("erstes Element: " + list.getFirstElem().getObj());
		// System.out.println("letztes Element: " + list.getLastElem().getObj());
		list.bubbleSortInt(); 
		System.out.println("Sorted list:");
		list.writeList();
	}
}

package milosbogdanovic;

import java.util.Hashtable;

public class MainHashTable {
	public static void main(String[] args) {

		Hashtable<String, Integer> komponente = new Hashtable<>();

		// Dodavanje elemenata u tablicu
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("1. Dodavanje elemenata: ugrađena metoda .put");
		System.out.println("--------------------------------------------------------------------------------------");
		komponente.put("Procesor", 20000);
		komponente.put("Matična ploča", 10000);
		komponente.put("RAM memorija", 5000);
		komponente.put("Hard disk", 8000);
		komponente.put("Grafička kartica", 15000);

		// Ispis elemenata
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("2. Štampanje elemenata");
		System.out.println("--------------------------------------------------------------------------------");
		for (String s : komponente.keySet()) {
			System.out.println(s + ": " + komponente.get(s));
		}

		// Ispisivanje velićine tablice
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("3. Ispisivanje veličine tablice: ugrađena metoda .size");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Veličina tablice: " + komponente.size());

		// Provera da li tablica sadrži određeni ključ
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("4. Provera da li tablica sadrži određeni ključ: ugrađena metoda .containsKey");
		System.out.println("--------------------------------------------------------------------------------------");
		boolean sadrziKljuc = komponente.containsKey("Procesor");
		if (sadrziKljuc) {
			System.out.println("Tablica sadrži ključ");
		} else
			System.out.println("Tablica ne sadrži ključ");

		// Provera da li tablica sadrži određenu vrednost
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("5. Provera da li tablica sadrži određenu vrednost: ugrađena metoda .containsValue");
		System.out.println("--------------------------------------------------------------------------------------");
		boolean sadrziVrednost = komponente.containsValue(10000);
		if (sadrziVrednost) {
			System.out.println("Tablica sadrži vrednost");
		} else {
			System.out.println("Tablica ne sadrži zadatu vrednost");
		}

		// Pristupanje vrednosti sačuvanom pod određenim ključem
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("6. Pristupanje vrednosti sačuvanom pod određenim ključem: ugrađena metoda .get");
		System.out.println("--------------------------------------------------------------------------------------");
		int cenaProcesora = komponente.get("Procesor");
		System.out.println("Cena procesora: " + cenaProcesora);

		// Uklanjanje elementa iz tablice
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("7. Uklanjanje elementa iz tablice: ugrađena metoda .remove");
		System.out.println("--------------------------------------------------------------------------------------");
		komponente.remove("RAM memorija");
		System.out.println("Nakon uklanjanja RAM memorije: ");
		for (String s : komponente.keySet()) {
			System.out.println(s + ": " + komponente.get(s));
		}

	}

}
package holidays;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner dodajKierunek = new Scanner(System.in);
		System.out.println("Podaj ilosc hoteli ktore chcesz dodac: ");

		while (!dodajKierunek.hasNextInt()) {
			System.out.println("Podaj liczbe calkowita!");
			dodajKierunek.next();
		}
		
		Wakacje[] array = null;
		int count = dodajKierunek.nextInt();	
		try {
			array = new Wakacje[count];
		}

		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < count; i++) {
			Wakacje noweWakacje = new Wakacje();
			
			System.out.println("Podaj kraj: ");
			noweWakacje.kraj = dodajKierunek.next();
			
			System.out.println("Podaj miejscowosc: ");
			noweWakacje.miejscowosc = dodajKierunek.next();
			
			System.out.println("Podaj nazwe hotel: ");
			noweWakacje.hotel = dodajKierunek.next();
			
			System.out.println("Podaj termin: ");
			noweWakacje.termin = dodajKierunek.next();
			
			System.out.println("Podaj wyzywienie: ");
			noweWakacje.wyzywienie = dodajKierunek.next();
		
			System.out.println("Podaj cena: ");
		    noweWakacje.cena = dodajKierunek.next();
			
	     	array[i] = noweWakacje;
			
		}
		
		File plik = new File("wakacje.txt");
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(plik));
		} 
		catch (IOException e) {
			System.out.print(e.getMessage());
		}
		
		System.out.println("Dodane wpisy...");

		for (int i = 0; i < count; i++)
		{
			System.out.println(array[i].wyswietl());

			try 
			{
				writer.write(array[i].wyswietl());
				writer.write("\r\n");
			} 
			catch (IOException e) 
			{
				System.out.println(e.getMessage());
			}

		}
		dodajKierunek.close();

		try 
		{
			writer.close();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

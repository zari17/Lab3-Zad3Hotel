package holidays;

public class Wakacje {
	String kraj;
	String miejscowosc;
	String hotel;
	String pokoj;
	String termin;
	String wyzywienie;
	String cena;
	
	public Wakacje(){}
	public Wakacje(String Kraj, String Miejscowosc, String Hotel, String Pokoj, String Termin, String Wyzywienie, String Cena){
		this.kraj = Kraj;
		this.miejscowosc = Miejscowosc;
		this.hotel = Hotel;
		this.pokoj = Pokoj;
		this.termin = Termin;
		this.wyzywienie = Wyzywienie;
		this.cena = Cena;
	}
	
	public String getPrice() 
	{
		return this.cena;
	}
	
	public String wyswietl()
	{
		 String s = "";
		    s += "Kraj: "  + kraj + "\r\n";
		    s += "Miasto: "  + miejscowosc + "\r\n";
		    s += "Hotel: "  + hotel + "\r\n";
		    s += "Pokoj: "  + pokoj + "\r\n";
		    s += "Termin: "  + termin + "\r\n";
		    s += "Wyzywienie: "  + wyzywienie + "\r\n";
		    s += "Cena: "  + cena + "\r\n";
		    return s;
	}
}
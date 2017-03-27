package model;

public class DataTable {

	public String raum;
	public String beschreibung;
	public int groesse;
	public int luxusScala;
	public int preis;
	
public DataTable(String raum, String beschreibung, int groesse, int luxusScala, int preis) {
	this.raum = raum;
	this.beschreibung = beschreibung;
	this.groesse = groesse;
	this.luxusScala = luxusScala;
	this.preis = preis;
}
	
	public String getRaum() {
		return raum;
	}
	public void setRaum(String raum) {
		this.raum = raum;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getLuxusScala() {
		return luxusScala;
	}
	public void setLuxusScala(int luxusScala) {
		this.luxusScala = luxusScala;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
}

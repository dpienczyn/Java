//Utwórz klasê Human reprezentuj¹c¹ cz³owieka, musi posiadaæ atrybuty takie jak wiek, 
//waga, wzrost, imiê i p³eæ. 
//Klasa powinna tak¿e zawieraæ metody getAge, getWeight, getHeight, getName, isMale.
public class Human {
	private int wiek;
	private double waga;
	private double wzrost;
	private String imie;
	private boolean plec;
	
	public Human (int wiek, double waga, double wzrost, String imie, boolean plec) {
		this.wiek = wiek;
		this.waga = waga;
		this.wzrost = wzrost;
		this.imie = imie;
		this.plec = plec;
	}
	
	public int wiek(){
		return wiek;
}
	public double waga(){
		return waga;
	}
	public double wzrost(){
		return wzrost;
	}
	public String imie(){
		return imie;
	}
	public boolean plec(){
		return plec;
	}

}

//Napisz metod�, kt�ra jako argument przyjmie trzy liczby. 
//Metoda powinna zwr�ci� true je�li z odcink�w 
//o d�ugo�ci przekazanych w 
//argumentach mo�na zbudowa� tr�jk�t prostok�tny.
public class Trojkat {

	public static void main(String[] args) {
	int AB = 3;
	int BC = 3;
	int CA = 91;
	int trojkat = (AB*AB)+(BC*BC);
	boolean troj = trojkat == Math.sqrt(CA);
	System.out.println(troj);

	}

}

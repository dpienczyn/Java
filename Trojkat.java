//Napisz metodê, która jako argument przyjmie trzy liczby. 
//Metoda powinna zwróciæ true jeœli z odcinków 
//o d³ugoœci przekazanych w 
//argumentach mo¿na zbudowaæ trójk¹t prostok¹tny.
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

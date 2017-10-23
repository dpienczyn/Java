import java.util.Scanner;
//Utwórz metodê pobieraj¹c¹ dodatni¹ liczbê ca³kowit¹ X, 
//która wyœwietli na ekranie liczby od zera do X,
//Jeœli w zadaniu 1. u¿y³eœ pêtli for przerób t¹ metodê na while (lub odwrotnie),
public class Petla1 {

	public static void main(String[] args) {
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();
		int i=0;
		while(i<liczba){
			System.out.printf("Twoje liczby to: %d\n", i);
			i++;
		}
		odczyt.close();
}
}
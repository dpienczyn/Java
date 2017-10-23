import java.util.Scanner;
//Utwórz metodê pobieraj¹c¹ dodatni¹ liczbê ca³kowit¹ X, 
//która wyœwietli na ekranie liczby od zera do X,
public class Petla {

	public static void main(String[] args) {
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();
		for(int i=0; i<liczba; i++){
			System.out.printf("Twoje liczby to: %d\n", i);
		}
		odczyt.close();

	}

}

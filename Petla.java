import java.util.Scanner;
//Utw�rz metod� pobieraj�c� dodatni� liczb� ca�kowit� X, 
//kt�ra wy�wietli na ekranie liczby od zera do X,
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

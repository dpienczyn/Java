import java.util.Scanner;
//Utw�rz metod� pobieraj�c� dodatni� liczb� ca�kowit� X, 
//kt�ra wy�wietli na ekranie liczby od zera do X,
//Je�li w zadaniu 1. u�y�e� p�tli for przer�b t� metod� na while (lub odwrotnie),
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
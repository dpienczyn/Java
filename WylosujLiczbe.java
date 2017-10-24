//Napisz program, w którym u¿ytkownik zgaduje losow¹ liczbê
//z przedzia³u od 0 do 9 generowan¹ przez komputer.
import java.io.*;
import java.util.*;

public class WylosujLiczbe {
	
	public static void main(String[] args){
		Scanner losuj = new Scanner(System.in);
		System.out.println("Wprowadz liczbe od 0 do 10...\n Powodzenia!");
		int liczba = losuj.nextInt();
		
		Random rand = new Random();
		int liczba3 = rand.nextInt(10);
		System.out.printf("Szukana liczba to: %d\n", liczba3);
		
		if(liczba == liczba3){
			System.out.println("Hurra uda³o Ci siê odgadnaæ liczbe!");
		}
		else{
			System.out.println("Niestety nie uda³o siê! Spróbuj jeszcze raz..");
		}
	}

}

//Napisz program, w kt�rym u�ytkownik zgaduje losow� liczb�
//z przedzia�u od 0 do 9 generowan� przez komputer.
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
			System.out.println("Hurra uda�o Ci si� odgadna� liczbe!");
		}
		else{
			System.out.println("Niestety nie uda�o si�! Spr�buj jeszcze raz..");
		}
	}

}

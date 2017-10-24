//Napisz program, który oblicza wartoœæ x z równania ax+b = c.
//Wartoœci a, b i c nale¿¹ do zbioru liczb rzeczywistych i s¹
//wprowadzane z klawiatury. Dodatkowo nale¿y zabezpieczyæ
//program na wypadek sytuacji, kiedy wprowadzona wartoœæ a
//bêdzie równa zero. Dla zmiennych a, b, c oraz x nale¿y przyj¹æ
//format wyœwietlania ich na ekranie z dok³adnoœci¹ do
//dwóch miejsc po przecinku.
import java.io.*;
import java.util.Scanner;

public class RownanieX {

	public static void main(String[] args){
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Wprowadz a: ");
		double a = odczyt.nextDouble();
		if(a==0){
			System.out.println("Wprowadzona wartoœæ a nie spelnia wymagan");
		}
		else{
		System.out.println("Wprowadz b: ");
		double b = odczyt.nextDouble();
		System.out.println("Wprowadz wartosc c: ");
		double c = odczyt.nextDouble();
		double x = (c-b)/a;
		System.out.printf("Wartosc a: %4.2f  ", a);
		System.out.printf("Wartosc b: %4.2f  ", b);
		System.out.printf("Wartosc c: %4.2f  ", c);
		System.out.printf("Wartosc x: %4.2f ", x);
		
	}
}}

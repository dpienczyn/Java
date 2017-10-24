//Napisz program, który oblicza pierwiastki równania kwadratowego
//ax2+bx+c = 0 z wykorzystaniem instrukcji warunkowej
//if, gdzie zmienne a, b i c to liczby rzeczywiste wprowadzane
//z klawiatury. Dla zmiennych a, b, c, x1 oraz x2 nale¿y przyj¹æ
//format wyœwietlania ich na ekranie z dok³adnoœci¹ do dwóch
//miejsc po przecinku.
import java.io.*;
import java.util.Scanner;
public class Rownaniekawadratowe {

	public static void main(String[] args){
		System.out.println("PRogram oblicza pierwiastki równiania kwadratowego");
		System.out.println("Podaj a: ");
		Scanner odczyt = new Scanner(System.in);
		double a = odczyt.nextDouble();
		if(a == 0){
			System.out.println("Niedozwolona wartoœæ wspó³czynnika a");
		}
		System.out.println("Podaj b: ");
		double b = odczyt.nextDouble();
		System.out.println("Podaj c: ");
		double c = odczyt.nextDouble();
		
		double delta = b*b-4*a*c;
		if(delta>0){
		delta = Math.sqrt(delta);
			double x1 = (-b-delta/(2*a));
			double x2 = (-b+delta)/(2*a);
			System.out.printf("A= %4.2f  ", a);
			System.out.printf("B= %4.2f  ", b);
			System.out.printf("C= %4.2f  ", c);
			System.out.printf("Delta= %4.2f  ", delta);
			System.out.printf("X1= %4.2f  ", x1);
			System.out.printf("X2= %4.2f", x2);
}
		if(delta==0){
			double x0 = -b/2*a;
			System.out.println("Xo= " + x0);
		}
		if(delta<0){
			System.out.println("Rownanie nie posiada pierwiastkow");
		}
	}
}
import java.lang.Math;
//Utw�rz klas� o nazwie MyNumber, kt�rej jedyny konstruktor przyjmuje liczb�. 
//Klasa powinna mie� nast�puj�ce metody
//MyNumber isOdd() - true je�li atrybut jest nieparzysty,
//MyNumber isEven() - true je�li atrybut jest parzysty,
//MyNumber sqrt() - pierwiastek z atrybutu,
//MyNumber pow(MyNumber x) - atrybut podniesiony do pot�gi x 
//(przydatnej metody poszukaj w javadoc do klasy Math),
//MyNumber add(MyNumber x) - zwraca sum� atrybutu i x opakowan� w klas� MyNumber,
//MyNumber subtract(MyNumber x) - zwraca r�nic� atrybutu i x 
//opakowan� w klas� MyNumber.
public class MyNumber {
private double liczba = 8;

public MyNumber(double liczba){
	this.liczba = liczba;
}
public boolean isOdd(){
	return liczba%2==1;
}
public boolean isEven(){
	return liczba%2==0;
}
public double sqrt(){
	return Math.sqrt(liczba);
}
public MyNumber potega(MyNumber potega){
	return new MyNumber(Math.pow(liczba, potega.liczba));
}
public MyNumber add(MyNumber add){
	return new MyNumber(liczba+add.liczba);
}
public MyNumber substract(MyNumber substract){
	return new MyNumber(liczba-substract.liczba);
}
@Override
public String toString() {
    return String.valueOf(liczba);
}
}

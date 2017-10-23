import java.lang.Math;
//Utwórz klasê o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbê. 
//Klasa powinna mieæ nastêpuj¹ce metody
//MyNumber isOdd() - true jeœli atrybut jest nieparzysty,
//MyNumber isEven() - true jeœli atrybut jest parzysty,
//MyNumber sqrt() - pierwiastek z atrybutu,
//MyNumber pow(MyNumber x) - atrybut podniesiony do potêgi x 
//(przydatnej metody poszukaj w javadoc do klasy Math),
//MyNumber add(MyNumber x) - zwraca sumê atrybutu i x opakowan¹ w klasê MyNumber,
//MyNumber subtract(MyNumber x) - zwraca ró¿nicê atrybutu i x 
//opakowan¹ w klasê MyNumber.
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

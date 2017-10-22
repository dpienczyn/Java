import java.lang.Math;
//Utw�rz klas� reprezentuj�c� prostok�t, musi posiada� atrybuty d�ugo�� i szeroko��. 
//Klasa powinna posiada� metody obliczaj�ce pole, obw�d i d�ugo�� przek�tnej.
public class Prostakat {
private int a = 3;
private int b = 7;

	public Prostakat(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int a(){
		return a;
	}
	
	public int b(){
		return b;
	}
	
	public int pole(){
	return a * b;
	}
	
	public int obwod(){
	return 2*a + 2*b;
	}
	
	public double przekatna(){
	return Math.sqrt(a*a+b*b);
	}
	}
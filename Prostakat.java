import java.lang.Math;
//Utwórz klasê reprezentuj¹c¹ prostok¹t, musi posiadaæ atrybuty d³ugoœæ i szerokoœæ. 
//Klasa powinna posiadaæ metody obliczaj¹ce pole, obwód i d³ugoœæ przek¹tnej.
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
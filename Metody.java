package pl.javastart.pakiety;

public class Metody {

	public static void main(String[] args) {
		
		int plustemp = 10;
		int minustemp = -10;
		istemppositive(plustemp);
		istemppositive(minustemp);
	}	
		private static boolean istemppositive(double temp) {
			boolean isPlus = temp > 0;
			
			if(isPlus){
				System.out.println("Jest plusowa " + temp);
			}
			else{
				System.out.println("Jest minusowa" + temp);
			}
		return isPlus;

}
}
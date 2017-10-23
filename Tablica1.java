//Napisz metodê pobieraj¹c¹ trójelementow¹ tablicê liczb, 
//która zwróci tablicê zawieraj¹c¹ te same 
//elementy w odwróconej kolejnoœci
public class Tablica1 {

	public static void main(String[] args) {
		int[][] tablica = new int[3][3];
		tablica[0][0] = 8;
		tablica[0][1] = 9;
		tablica[0][2] = 3;
		
		tablica[1][0] = 8;
		tablica[1][1] = 9;
		tablica[1][2] = 3;
		
		tablica[2][0] = 8;
		tablica[2][1] = 9;
		tablica[2][2] = 3;
		
		for(int i =0; i<tablica.length; i++){
			for(int j=0; j <tablica[i].length; j++){
			System.out.printf("tab[%d][%d]=%d\n", i, j, tablica[i][j]);
		}
			System.out.println("");
	}}

}

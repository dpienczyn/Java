//Napisz metod� pobieraj�c� tr�jelementow� tablic� liczb, 
//kt�ra zwr�ci tablic� zawieraj�c� te same 
//elementy w odwr�conej kolejno�ci
public class Tablicaodwrocona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}
		System.out.println("Elementy tablicy wy�wietlane w odwrotnej kolejno�ci.\n");
	for(int i =tablica.length-1; i>=0; i--){
		for(int j=tablica.length-1; j>=0; j--){
			System.out.printf("tab[%d][%d]=%d\n", i, j, tablica[i][j]);
		}
		System.out.println("");
	}
	}


}

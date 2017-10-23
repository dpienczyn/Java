//Napisz klas� ArrayFactory, kt�ra w konstruktorze 
//pobierze liczb� ca�kowit� X wi�ksz� od zera. Klasa powinna mie� 2 metody:
//int[] oneDimension - zwr�ci instancj� tablicy jednowymiarowej o d�ugo�ci X,
//int[][] twoDimension - zwr�ci instacj� tablicy 
//dwuwymiarowej gdzie liczba wierszy i liczba kolumn r�wna si� X,

public class Array {
private int size;

public Array(int size){
	this.size = size;
}
public int[] tablica1(){
	return new int[size];
}
public int[][] tablica2(){
	int[][] array = new int[size][];
	for(int i=0; i<size; i++){
		array[i] = new int[size];
	}
	return array;
}
public int[][] tablica3() {
    int[][] matrix = tablica2();
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (i == j) {
                matrix[i][j] = 1;
            }
            else {
                matrix[i][j] = 0;
            }
        }
    }
    return matrix;
}
}
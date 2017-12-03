package ass;

import java.util.Random;
import java.util.Scanner;

public class Puzzle {

	public static final int N = 4;
	public static final int NUMBER_OF_ROTATIONS = 5;

	public static void main(String[] args) {
		int[][] puzzle = new int[N][N];
		reset(puzzle);
		test(puzzle);
		reset(puzzle);
		scramble(puzzle);
		System.out.println("### Testing puzzle game play\n");
		play(puzzle);
	}

	public static void print(int[][] puzzle) {
		for (int[] row : puzzle) {
			for (int elem : row) {
				System.out.printf("%4d", elem);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void test(int[][] puzzle) {
		System.out.println("### Testing reset method\n");
		print(puzzle);
		System.out.println("### Testing rotate methods\n");
		print(puzzle);
		for (int i = 0; i < N; i++) {
			System.out.println("### rotateColumn(" + i + ")\n");
			rotateColumn(puzzle, i);
			print(puzzle);
			System.out.println("### rotateRow(" + i + ")\n");
			rotateRow(puzzle, i);
			print(puzzle);
		}
		reset(puzzle); 
		System.out.println("### Testing random rotations\n");
		print(puzzle); 
		for (int i = 0; i < 5; i++){
			randomRotation(puzzle);
			print(puzzle); 
		}
	}

	public static void reset(int[][] puzzle) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				puzzle[i][j] = i * N + j;
		}
	}

	public static void scramble(int[][] puzzle) {
		for (int i = 0; i < NUMBER_OF_ROTATIONS; i++) {
			randomRotation(puzzle);
		}
	}


	// TODO: Implement method as specified in assignment brief 
	//takes in inputs, makes duplicate 
	public static void rotateRow(int[][] arr, int row) {
	int [][] store = new int[arr.length][];
	for (int x = 0; x < arr.length; x++)
		store[x] = arr[x].clone();
	
		for (int j = 0; j < N; j++){
			if(j -1 < 0){
				arr[row][j] = store[row][N-1];
			} 
			else{
				arr[row][j] = store[row][j - 1];
			}
		}
	
	}


	// TODO: Implement method as specified in assignment brief 
	
	public static void rotateColumn(int[][] arr, int column) {
	int [][] store = new int[arr.length][];
	for(int e = 0; e < arr.length; e++)
		store[e] = arr[e].clone();
		for (int k = 0; k < N; k++){
			if (k-1 < 0){
				arr[k][column] = store[N-1][column];
			}
			else {
				arr[k][column] = store[k-1][column];
			}
		}
	
	
	
	}


	// TODO: Implement method as specified in assignment brief 
	
	public static void randomRotation(int[][] puzzle) {
	Random unknown = new Random();
	int randomstore = unknown.nextInt(3 -1) +1;
	
	Random unknown2 = new Random();
	int randomstore2 = unknown2.nextInt(4 - 0) +0;
	
	if (randomstore ==1){
		rotateRow(puzzle, randomstore2);
	}
	else{
		rotateColumn(puzzle, randomstore2);
	}
	}

	// TODO: Implement method as specified in assignment brief 
	
	static void play(int[][] puzzle) {
		//gets new puzzle and scrambles it
		reset(puzzle);
		int[][] store = new int[puzzle.length][];
		for(int o = 0; o < puzzle.length; o++)
			store[o] = puzzle[o].clone();
		scramble(store);
		print(store);
		//asking for the value
		boolean decider = false;
		while(decider == false){
			System.out.println("Enter rotation command: ");
			Scanner input = new Scanner(System.in);
			String rotationvalue = input.next();
			int numbervalue = input.nextInt();
			while(!(rotationvalue.equals("row") || rotationvalue.equals("column"))){ 
				System.out.println("Invalid input");
				System.out.println("Enter rotation command: ");
				input = new Scanner(System.in);
				rotationvalue = input.next();
				numbervalue = input.nextInt();
			}
			while((numbervalue < 0 || numbervalue > 3)){
				System.out.println("Invalid input");
				System.out.println("Enter rotation command: ");
				input = new Scanner(System.in);
				rotationvalue = input.next();
				numbervalue = input.nextInt();
				
			}
			//inputting in the value to rotate accordingly
			System.out.println(rotationvalue + " "+ numbervalue);
			if (rotationvalue.equals("column")){
				rotateColumn(store, numbervalue);
			}
			if (rotationvalue.equals("row")){
				rotateRow(store, numbervalue);
			}
			int collector = 0;
			for(int q = 0; q <N; q++){
				for(int k = 0; k < N; k++){
					if(store[q][k] == puzzle[q][k]){
					collector= collector +1;	
					}
					else{
						decider = false;
					}
				}
				if (q == 3){
					if (collector == 16){
						decider = true;
					}
					else{
						decider = false;
						collector = 0;
					}
				}
			}
			print(store);
			
		} System.out.println("You solved the puzzle");
	}

}

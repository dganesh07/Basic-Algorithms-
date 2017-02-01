import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class primsAlgo {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		primExecute();

	}

	public static void primExecute() throws IOException, Exception {
		int matrix[][] = getMatrix();
		int mLeng = matrix[0].length;

		System.out.println("your input graph is as follows");
		displayMatrix(matrix);
		System.out.println("\n");
		
		for(int a=0;a<mLeng;a++){
			for(int b=0;b<mLeng;b++){
				if(matrix[a][b]==0 || matrix[a][b]==-1){
					matrix[a][b] = 999;
				}
			}
		}
		
		System.out.println("after changing");
		displayMatrix(matrix);
		System.out.println("\n");

		int[] Visited = new int[mLeng];
		for (int v = 0; v < mLeng; v++) {
			Visited[v] = 0;
		}
		Visited[0] = 1;
		int min;
		int u = 0, v = 0;
		int count = 0;
		int total = 0;
		// while loop is for the no of edges in the spanning tree which will be
		// always one less than the actual graph
		while (count < mLeng - 1) {
			min = 999;
			for (int i = 0; i < mLeng; i++) {
				//check for the minimum edge from all the visited nodes!
				if (Visited[i] == 1) {
					for (int j = 0; j < mLeng; j++) {
						//will not create a cycle
						if (Visited[j] != 1) {
							if (min > matrix[i][j]) {
								min = matrix[i][j];
								u = i;
								// u already set as visited! as u is the vertex
								v = j;

							}
						}
					}
				}
			}
			Visited[v] = 1;
			total += min;
			System.out.println("edge" + " " + u + "->" + v + ":weight=" + " " + min);
			System.out.println("\n");
			count++;
		}
		System.out.println("total=" + " " + total);

	}

	public static int[][] getMatrix() throws IOException, Exception {

		int row = 0;
		int column = 0;
		String curLine[] = null;
		BufferedReader br = null;

		// Enter the file name that is in the directory!!
		System.out.println("Enter file name: ");
		Scanner sc = new Scanner(System.in);
		String file = sc.next();

		try {

			br = new BufferedReader(new FileReader(file));
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				row++;
				curLine = currentLine.split("\\s");
				column = curLine.length;

			}
			int matrix[][] = new int[row][column];
			br.close();
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("File was not found!Please Enter the correct file name!!");
			main(null);
			System.out.println();
		} catch (IOException ioe) {
			System.out.println("Some thing wrong!!!!.");
			main(null);
			System.out.println();
		}

		return storeMatrix(file, row, column);
	}

	// to store the matrix that has been read by the file
	public static int[][] storeMatrix(String txtFile, int row, int column) throws IOException {

		int tempRow = 0;
		String newCurrentLine;
		BufferedReader br1 = null;
		int matrix[][] = new int[row][column];

		br1 = new BufferedReader(new FileReader(txtFile));

		while ((newCurrentLine = br1.readLine()) != null) {
			String newLine[] = newCurrentLine.split("\\s");

			for (int i = 0; i < column; i++) {
				// converting string in file to integer!!!!
				matrix[tempRow][i] = Integer.parseInt(newLine[i]);
			}
			tempRow++;
		}

		br1.close();

		return matrix;

	}

	// to display the matrix : will be called in case1 : choice 1
	public static void displayMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}

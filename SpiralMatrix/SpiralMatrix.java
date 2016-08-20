import java.util.Scanner;
import java.util.StringTokenizer;
class SpiralMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = Integer.parseInt(sc.nextLine());
		int coloumns = Integer.parseInt(sc.nextLine());
		int matrix[][] = new int[rows][coloumns];
		for(int i = 0; i<rows; i++){
			int count=0;
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens()){
				matrix[i][count++] = Integer.parseInt(st.nextToken());
			}
		}
		int d_row = rows,d_col = coloumns;
		int x = 0, y = 0;
		while(d_col>0 && d_row> 0){
			if(d_row == 1){
				for (int i = 0; i<d_col; i++) {
					System.out.println(matrix[x][y++]);
				}
				break;
			}
				if(d_col == 1){
				for (int i = 0; i<d_row; i++) {
					System.out.println(matrix[x++][y]);
				}
				break;
			}
			for(int i = 0; i<d_row-1; i++){
				System.out.println(matrix[x][y++]);
			}
			for(int i =0; i<d_col-1; i++){
				System.out.println(matrix[x++][y]);
			}
			for(int i = 0; i < d_row-1; i++){
				System.out.println(matrix[x][y--]);
			}
			for(int i = 0; i< d_col-1; i++){
				System.out.println(matrix[x--][y]);
			}
			x++; y++;
			d_row -= 2;
			d_col -= 2;
		} 
	}
}

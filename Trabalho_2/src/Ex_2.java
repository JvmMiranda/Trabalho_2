import java.util.Random;

public class Ex_2 {

	public static void main(String[] args) {
		
		int h=4;
		
		int[][] x = gerar(h);
		
		inverter(x, h);
		
		
	}
	public static int[][] gerar(int h){
		
		int[][] x = new int[4][4];
		
		Random gen = new Random();
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				x[i][j] = gen.nextInt(10);
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		return x;
	}
	public static void inverter(int x[][], int h) {
		int aux;
		for(int i = 0; i < 4 ; i++) {
			for(int j = 0; j < 4; j++) {
				if(i>j) {
					aux = x[i][j];
					x[i][j] = x[j][i];
					x[j][i] = aux;
					System.out.print(x[i][j]+"\t");
				}else {
					System.out.print(x[j][i]+"\t");
				}
			}
			System.out.println();
		}
	}
}

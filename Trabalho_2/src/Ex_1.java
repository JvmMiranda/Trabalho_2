import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		
//		Escreva um programa em Java que leia inicialmente as dimens�es da matriz (n�mero 
//		de linhas e n�mero de colunas) e, em seguida, fa�a o preenchimento da matriz com valores inteiros 
//		fornecidos pelo usu�rio. Ap�s o preenchimento da matriz dever� ser lido via teclado um valor X e 
//		o seu programa dever� fazer a busca desse valor na matriz. Se o valor for encontrado dever� ser 
//		impresso no v�deo a sua localiza��o (n�mero da linha e n�mero da coluna). Caso o valor n�o esteja 
//		na matriz dever� ser impresso no v�deo a mensagem: �X n�o se encontra na matriz�. 
		
		Scanner tec = new Scanner(System.in);
		int a, b, e;
		System.out.print("Informe o numero de linhas: ");
		a = tec.nextInt();
		System.out.print("Informe o numero de Colunas: ");
		b = tec.nextInt();
		
		
		int[][] x = preencher(a, b);
		printar(x, a, b);

		System.out.println();
		System.out.print("Informe um valor a ser encontrado: ");
		e = tec.nextInt();
		
		achar(x, a, b, e);
	}
	public static int[][] preencher(int a, int b){
		
		Scanner tec = new Scanner(System.in);
		int[][] x = new int[a][b];
		
		System.out.println("Agora informe os valores para cada coordenada da matriz");
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print("Valor posi��o "+ i + "/" + j +": ");
				x[i][j] = tec.nextInt();			
				}			
		}
		return x;
	}
	public static void printar(int x[][], int a, int b) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(x[i][j]+"\t");			
				}	
			System.out.println();
		}
	}
	public static void achar(int x[][], int a, int b, int e) {
		int c=0;
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(e == x[i][j]) {
					System.out.println("Valor localizado: Linha -> "+i+"\tColuna -> "+j);
					c++;
					
				}
			}	
		}
		if(c == 0) {
			System.out.println("O numero n�o esta na matriz");
		}
	}
}

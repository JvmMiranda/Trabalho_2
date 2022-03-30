import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		
//		Escreva um programa em Java que leia inicialmente as dimensões da matriz (número 
//		de linhas e número de colunas) e, em seguida, faça o preenchimento da matriz com valores inteiros 
//		fornecidos pelo usuário. Após o preenchimento da matriz deverá ser lido via teclado um valor X e 
//		o seu programa deverá fazer a busca desse valor na matriz. Se o valor for encontrado deverá ser 
//		impresso no vídeo a sua localização (número da linha e número da coluna). Caso o valor não esteja 
//		na matriz deverá ser impresso no vídeo a mensagem: “X não se encontra na matriz”. 
		
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
				System.out.print("Valor posição "+ i + "/" + j +": ");
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
			System.out.println("O numero não esta na matriz");
		}
	}
}

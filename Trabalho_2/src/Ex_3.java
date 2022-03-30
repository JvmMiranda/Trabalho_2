import java.util.*;
public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int alunos;
		System.out.println("Informe o número de estudantes:");
		alunos = tec.nextInt();
		
		String[] gabarito = Ggabarito();
		
		int[]notas = correcao(gabarito, alunos);
		
		Notas(notas, alunos);
	}
	public static String[] Ggabarito(){
		Scanner tec = new Scanner(System.in);
		String[] gabarito = new String[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe a resposta da questão "+(i+1)+": ");
			gabarito[i] = tec.next();
		}
		return gabarito;
	}
	public static int[] correcao(String[] gabarito, int alunos) {
		
		Random gen = new Random();
		String [] respostas = new String [10];
		int[]notas = new int[alunos];
		int aux=0, nota=0;
		
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tQ5\tQ6\tQ7\tQ8\tQ9\tQ10");
		for(int w = 0; w < alunos; w++) {
			System.out.print("Aluno: "+ (w+1) + "\t");
			for(int i = 0; i < 10; i++) {
				aux = gen.nextInt(5);
				switch(aux) {
					case 0:
						respostas[i] = "a";
						break;
					case 1:
						respostas[i] = "b";
						break;
					case 2:
						respostas[i] = "c";
						break;
					case 3:
						respostas[i] = "d";
						break;
					case 4:
						respostas[i] = "e";
						break;}
				System.out.print(respostas[i]+"\t");

			}
			for(int h = 0; h < 10; h++) {
				if(respostas[h].equals(gabarito[h])) {
					nota++;
					}
		}
			notas[w] = nota;
			System.out.println();
			nota = 0;
		}
		
		System.out.println();
		return notas;
	}
	public static void Notas(int[]notas, int alunos) {
		
		for(int i = 0; i < alunos; i++) {
			if(notas[i] >= 7) {
				System.out.println("Aluno: "+(i+1)+" / Nota: "+ notas[i]+" / Status: APROVADO ;)");
			}else {
				System.out.println("Aluno: "+(i+1)+" / Nota: "+ notas[i]+" / Status: Reprovado :(");
			}
		}
		
	}
}

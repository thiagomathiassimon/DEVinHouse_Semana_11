package exercicio_15;

import java.util.Scanner;

public class MediaRefatorada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int NUMERO_DE_NOTAS_DO_SEMESTRE = 3;

		double notas[] = new double[NUMERO_DE_NOTAS_DO_SEMESTRE];

		for (int i = 0; i < NUMERO_DE_NOTAS_DO_SEMESTRE; i++) {
			System.out.println("Informe a nota do semstre: ");
			notas[i] = Double.parseDouble(scanner.nextLine());
		}

		double media = calcularMedia(notas);

		System.out.format("Média: %.2f", media);

		scanner.close();

	}

	public static double calcularMedia(double[] notas) {
		int quantidadeDeNotas = notas.length;
		double media = 0.0;
		double somaDasNotas = 0.0;
		for (double nota : notas) {
			somaDasNotas += nota;
		}
		media = somaDasNotas / quantidadeDeNotas;
		return media;
	}

}

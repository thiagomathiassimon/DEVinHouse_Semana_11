package exercicio_14;

import java.util.Scanner;

public class CalculadoraRefatorada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = Double.parseDouble(scanner.nextLine());
		System.out.println("Informe o segundo número: ");
		double segundoNumero = Double.parseDouble(scanner.nextLine());
		System.out.println("Informe a operação: ");
		String operacao = scanner.nextLine();

		double resultado = calcular(primeiroNumero, segundoNumero, operacao);

		System.out.println("Resultado: " + resultado);

		scanner.close();
	}

	public static double calcular(double primeiroNumero, double segundoNumero, String operacao) {
		double resultado = 0.0;
		switch (operacao) {
		case "+", "soma", "Soma":
			resultado = primeiroNumero + segundoNumero;
			break;
		case "-", "subtração", "Subtração":
			resultado = primeiroNumero - segundoNumero;
			break;
		case "*", "multiplicação", "Multiplicação":
			resultado = primeiroNumero * segundoNumero;
			break;
		case "/", "divisão", "Divisão":
			resultado = primeiroNumero / segundoNumero;
			break;
		}
		return resultado;
	}

}

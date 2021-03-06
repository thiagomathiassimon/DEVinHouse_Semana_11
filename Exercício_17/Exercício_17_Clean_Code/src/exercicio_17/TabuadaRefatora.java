package exercicio_17;

public class TabuadaRefatora {

	public static void main(String[] args) {

		System.out.println(escreverTabuada());

	}

	public static String escreverTabuada() {
		String tabuada = "";
		for (int i = 0; i < 10; i++) {
			tabuada += "\nTabuada do " + i + ": " + calcularTabuada(i);
		}
		return tabuada;
	}

	public static String calcularTabuada(int numero) {
		String tabuada = "";
		for (int i = 0; i <= 10; i++) {
			if (i != 10) {
				tabuada += numero * i + ", ";
			} else {
				tabuada += numero * i;
			}
		}
		return tabuada;
	}

}

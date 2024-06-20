package desafioControle;

public class Contador {

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}

		Integer cont = parametroDois - parametroUm;
		Integer contagemTotal = null;

		for (int i = 1; i <= cont; i++) {

			System.out.println("O Número Impresso foi: " + i);
			contagemTotal = i;
		}

		System.out.println("Contagem Totalizadas: " + contagemTotal);
	}
}

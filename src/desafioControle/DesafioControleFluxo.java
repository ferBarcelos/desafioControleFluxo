package desafioControle;

import java.util.Scanner;

public class DesafioControleFluxo {

	public static void main(String[] args) throws Exception {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			
			Contador.contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {

			e.printStackTrace();

		}

		terminal.close();
		
		System.out.println("Terminal Encerrado!");
	}
}

package controleDeFluxo;

import java.util.Iterator;
import java.util.Scanner;
import Exception.ParametrosInvalidosException;



public class Contador {
	public static void main(String[] args) {
		Scanner Terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmentro");
		int parametroUm = Terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro dois deve ser maior que o primeiro");
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int contagem;
		if (parametroUm > parametroDois) {
			
			throw new ParametrosInvalidosException();
		}else {
			contagem = parametroUm + parametroDois;
		}
		
		for (int x = 0; x == contagem; x++) {
			System.out.println("Imprimindo o número " + x);
		}
	}
}

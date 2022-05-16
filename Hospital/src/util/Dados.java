package util;

import java.util.Scanner;
// metodo dados responsavel por receber dados do usuario
public class Dados {
	Scanner pergunta = new Scanner(System.in);
	
	// metodo inteiros serve para retornar valores do tipo inteiro, recebendo como parametro uma string x que vai ser printada para o usuario
	public int inteiros(String x) {
		// printa
		System.out.print(x);
		// recebe 
		int y = pergunta.nextInt();
		// retorna 
		return y;
		
	}
	// metodo texto serva para retornar textos que o usuario digitar, recebendo como parametro uma string x que vai ser printada para o usuario
	public String texto(String x) {
		// printa 
		System.out.print(x);
		// recebe 
		String y = pergunta.nextLine();
		// retorna 
		return y;
	}
	// metodo Double serve para retornar valores double que o usuario digitar, recebendo como parametro uma string x que vai ser printada para o usuario
	public double Double(String x) {
		// printa
		System.out.print(x);
		// recebe
		double y = pergunta.nextDouble();
		// retorna 
		return y;
	}
	
	
	
}
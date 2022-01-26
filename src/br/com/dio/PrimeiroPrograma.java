package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Livros Livros = new Livros();
		Gato gato = new Gato();
		
		
		System.out.println(gato);
		System.out.println(Livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/

	}

}

class Livros {
	private String nome;
	private String npag;
}
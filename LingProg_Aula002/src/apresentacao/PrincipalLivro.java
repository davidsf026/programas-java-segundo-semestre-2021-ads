package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class PrincipalLivro {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Livro objLivro = new Livro();
		
		//ENTRADA DE DADOS
		try {
			System.out.print("Digite o t�tulo do livro: ");
			objLivro.setTitulo(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		try {
			System.out.print("Digite o g�nero do livro: ");
			objLivro.setGenero(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		try {
			System.out.print("Digite o nome do autor: ");
			objLivro.setObjAutor(new Autor(leitor.readLine()));
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//SA�DA DE DADOS
		System.out.println("O t�tulo do livro �: " + objLivro.getTitulo());
		
		System.out.println("O g�nero do livro �: " + objLivro.getGenero());
		
		System.out.println("O autor do livro �: " + objLivro.getObjAutor().getNome());
	}
}

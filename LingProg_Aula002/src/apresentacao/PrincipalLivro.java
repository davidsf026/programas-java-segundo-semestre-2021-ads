package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class PrincipalLivro {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Livro objLivro = new Livro();
		
		//ENTRADA DE DADOS
		try {
			System.out.print("Digite o título do livro: ");
			objLivro.setTitulo(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		try {
			System.out.print("Digite o gênero do livro: ");
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
		
		//SAÍDA DE DADOS
		System.out.println("O título do livro é: " + objLivro.getTitulo());
		
		System.out.println("O gênero do livro é: " + objLivro.getGenero());
		
		System.out.println("O autor do livro é: " + objLivro.getObjAutor().getNome());
	}
}

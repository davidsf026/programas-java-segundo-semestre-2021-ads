package negocio;

public class Aluno {
	//PROPRIEDADES DA CLASSE
	private int matricula = 0;
	private String nome = "";
	
	//M�TODO CONSTRUTOR
	public Aluno() {
		
	}
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	//M�TODO GET/SET
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
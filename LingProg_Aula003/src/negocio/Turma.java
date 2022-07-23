package negocio;

public class Turma {
	//PROPRIEDADES DA CLASSE
	private Cadeira objCadeira = null;
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecao = new Aluno[5];
	
	private int qtdAlunos = 0;
	
	//MÉTODO CONSTRUTOR
	public Turma() {
		super();
	}
	
	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
	}
	
	//MÉTODO GET/SET
	public Cadeira getObjCadeira() {
		return objCadeira;
	}
	
	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	
	public Professor getObjProfessor() {
		return objProfessor;
	}
	
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public Aluno[] getColecao() {
		return colecao;
	}
	
	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	
	//MÉTODOS ADICIONAIS DA CLASSE
	public boolean adicionarAluno(Aluno objAluno) {
		boolean retorno = false;
		
		if (qtdAlunos >= colecao.length) {
			retorno = false;
		} else {
			colecao[qtdAlunos] = objAluno;
			qtdAlunos++;
			retorno = true;
		}
		
		return retorno;
	}
	
	public String listarAlunos() {
		String retorno = "";
		
		for (int i = 0 ; i < qtdAlunos ; i++) {
			retorno += ("\tNome do Aluno: " + colecao[i].getNome() + 
						"\n\tMatrícula do Aluno: " + colecao[i].getMatricula() +
						"\n" + "\n");
		}
		
		return retorno;
	}
}

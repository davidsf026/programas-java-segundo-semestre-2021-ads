package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class PrincipalEscola {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Cadeira objCadeira = new Cadeira();
		Professor objProfessor =  new Professor();
		Aluno objAluno =  new Aluno();
		Turma objTurma = new Turma();
		
		//ENTRADA DE DADOS
		try {
			System.out.print("Informe o nome da cadeira: ");
			objCadeira.setNome(leitor.readLine());
			
			objTurma.setObjCadeira(objCadeira);
			
			System.out.print("Informe o nome do professor: ");
			objProfessor.setNome(leitor.readLine());
			
			System.out.print("Informe o título do professor: ");
			objProfessor.setTitulo(leitor.readLine());
			
			System.out.print("Informe o salário do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));
			
			objTurma.setObjProfessor(objProfessor);

			do {
				objAluno = new Aluno();
				
				System.out.print("Informe a matrícula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Informe o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				
				if(! objTurma.adicionarAluno(objAluno)) {
					System.out.println("Erro, a turma já está cheia!");
				}
				
				System.out.print("Digite <S> se quiser adcionar um aluno ou qualquer tecla para sair: ");
			} while (leitor.readLine().equalsIgnoreCase("S"));
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//SAÍDA DE DADOS
		System.out.println("");
		System.out.println("• O nome da cadeira é: " + objTurma.getObjCadeira().getNome());
		System.out.println("• O nome do professor é: " + objTurma.getObjProfessor().getNome());
		System.out.println("• O título do professor é: " + objTurma.getObjProfessor().getTitulo());
		System.out.println("• O salário do professor é: " + objTurma.getObjProfessor().getSalario());
		System.out.println("• Lista de alunos:\n" + objTurma.listarAlunos());
	}

}

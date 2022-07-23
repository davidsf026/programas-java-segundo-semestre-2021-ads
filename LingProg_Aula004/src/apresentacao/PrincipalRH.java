package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class PrincipalRH {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Gerente objGerente = new Gerente();
		Colaborador objColaborador =  new Colaborador();
		Colaborador objPolimorfo =  new Gerente(); //D� S� UMA OLHADA NISSO!! ESSE TIPO DE INSTAN�NCIA FAZ COM QUE EU POSSA COVERTER O objPolimorfo (QUE � DO TIPO Colaborador) PARA O TIPO Gerente, BASTA FAZER O COMANDO MOSTRADO LOGO A FRENTE.
		
		//ENTRADA DE DADOS
		try {
			//TIPO COLABORADOR
			System.out.print("Informe a matr�cula do colaborador: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Informe o nome do colaborador: ");
			objColaborador.setNome(leitor.readLine());
			
			System.out.print("Informe o sal�rio do colaborador: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			
			
			System.out.println("");
			
			//TIPO GERENTE
			System.out.print("Informe a matr�cula do gerente: ");
			objGerente.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Informe o nome do gerente: ");
			objGerente.setNome(leitor.readLine());
			
			System.out.print("Informe o sal�rio do gerente: ");
			objGerente.setSalario(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Informe o b�nus do gerente: ");
			objGerente.setBonus(Double.parseDouble(leitor.readLine()));
			
			
			System.out.println("");
			
			//TIPO COLABORADOR, OU SE EU QUISER, TIPO GERENTE (POLIMORFO)
			System.out.print("Informe a matr�cula do polimorfo: ");
			objPolimorfo.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Informe o nome do polimorfo: ");
			objPolimorfo.setNome(leitor.readLine());
			
			System.out.print("Informe o sal�rio do polimorfo: ");
			objPolimorfo.setSalario(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Informe o b�nus do polimorfo: ");
			((Gerente) objPolimorfo).setBonus(Double.parseDouble(leitor.readLine())); //ESTOU CONVERTENDO O objPolimorfo (QUE � DO TIPO Colaborador) PARA O TIPO Gerente, LOGO, POSSO ADICIONAR B�NUS
			
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//SA�DA DE DADOS
			System.out.println("");
			System.out.println("Matr�cula do colaborador: " + objColaborador.getMatricula());
			System.out.println("Nome do colaborador: " + objColaborador.getNome());
			System.out.println("Sal�rio do colaborador: " + objColaborador.getSalario());
			System.out.println("");
			System.out.println("Matr�cula do gerente: " + objGerente.getMatricula());
			System.out.println("Nome do gerente: " + objGerente.getNome());
			System.out.println("Sal�rio do gerente: " + objGerente.getSalario());
			System.out.println("");
			System.out.println("Matr�cula do polimorfo: " + objPolimorfo.getMatricula());
			System.out.println("Nome do polimorfo: " + objPolimorfo.getNome());
			System.out.println("Sal�rio do polimorfo: " + objPolimorfo.getSalario());
	}
}

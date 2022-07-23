package apresentacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Ave;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class PrincipalZoo {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Animal objAnimal = null;
		int tipoAnimal = 0;
		
		//ENTRADA DE DADOS
		do {
			System.out.print("Informe a espécie do animal, <1> para cachorro, <2> para leopardo ou <3> para águia: ");
			try {
				tipoAnimal = Integer.parseInt(leitor.readLine());
			} catch (IOException erro) {
				System.out.println(erro);
			}			
		} while (!(tipoAnimal <= 3 && tipoAnimal >= 1));
		
		switch (tipoAnimal) {
		case 1:
			objAnimal = new Cachorro();
			break;
		case 2:
			objAnimal = new Leopardo();
			break;
		case 3:
			objAnimal = new Aguia();
			break;
		}
		
		try {
			System.out.println("");
			System.out.print("Informe o peso do animal: ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Informe o nome do animal: ");
			objAnimal.setNome(leitor.readLine());;
			
			System.out.print("Informe a altura do animal em metros: ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			
			switch (tipoAnimal) {
			case 1:
				System.out.print("Informe a quantidade de litros de leite do animal: ");
				((Mamifero) objAnimal).setLitrosDeLeite(Double.parseDouble(leitor.readLine())); //TRANSFORMEI PARA MAMÍFERO, MAS TAMBÉM PODIA SER CACHORRO
				
				System.out.print("Informe a força da mordida do animal: ");
				((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));	//TRANSFORMEI PARA CACHORRO
				break;
			case 2:
				System.out.print("Informe a quantidade de litros de leite do animal: ");
				((Mamifero)objAnimal).setLitrosDeLeite(Double.parseDouble(leitor.readLine()));
				
				System.out.print("Informe a velocidade do animal: ");
				((Leopardo)objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
				break;
			case 3:
				System.out.print("Informe a quantidade de ovos do animal: ");
				((Ave)objAnimal).setQuantidadeDeOvos(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Informe as horas de autonomia de voo do animal: ");
				((Aguia)objAnimal).setHorasDeAutonomia(Integer.parseInt(leitor.readLine()));
				break;
			}
			
		} catch (Exception erro) {
			System.out.println(erro);		
		}
		
		//SAÍDA DE DADOS
		System.out.println("");
		System.out.println("Peso do animal: " + objAnimal.getPeso());
		System.out.println("Nome do animal: " + objAnimal.getAltura());
		System.out.println("Altura do animal em metros: " + objAnimal.getNome());
		
		System.out.println("IMC do animal: " + objAnimal.calcularIMC());
		
		switch (tipoAnimal) {
		case 1:
			System.out.println("Litros de leite do animal: " + ((Mamifero)objAnimal).getLitrosDeLeite());
			System.out.println("Força da mordida do animal: " + ((Cachorro)objAnimal).getForcaMordida());
			System.out.println(((Cachorro)objAnimal).morder());
			break;
		case 2:
			System.out.println("Litros de leite do animal: " + ((Mamifero)objAnimal).getLitrosDeLeite());			
			System.out.println("Velocidade do animal: " + ((Leopardo)objAnimal).getVelocidade());
			System.out.println(((Leopardo)objAnimal).correr());
			break;
		case 3:
			System.out.println("Litros de leite do animal: " + ((Ave)objAnimal).getQuantidadeDeOvos());
			System.out.println("Horas de autonomia de voo do animal: " + ((Aguia)objAnimal).getHorasDeAutonomia());
			System.out.println(((Aguia)objAnimal).voar());
			break;
		}
		
	}
}
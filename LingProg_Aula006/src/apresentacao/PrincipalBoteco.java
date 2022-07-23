package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartini;
import negocio.Mixer;
import negocio.MoscowMule;
import negocio.OldFashion;

public class PrincipalBoteco {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Mixer objMixer = null;
		
		int opcao = 0;
		
		//ENTRADA DE DADOS
		try {
			System.out.print("Digite <1> para Caipirinha, <2> para Dry Martini,  <3> para Old Fashion,  <4> para Moscow Mule: ");
			opcao = Integer.parseInt(leitor.readLine());
			
			System.out.println("");
			
			switch (opcao) {
			case 1:
				objMixer = new Caipirinha();
				break;

			case 2:
				objMixer = new DryMartini();
				break;
				
			case 3:
				objMixer = new OldFashion();
				break;
				
			case 4:
				objMixer = new MoscowMule();
				break;

			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//PROCESSAMENTO
		objMixer.misturar();
		
		//SAÍDA DE DADOS
		((Drink) objMixer).beber();
	}
}

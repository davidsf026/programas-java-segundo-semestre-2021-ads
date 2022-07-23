package negocio;

public class BubbleSort implements Ordenacao{
	public void ordenar (int[] vetor) {
		boolean troquei = true;
		int temp = 0;
		
		while (troquei) {
			troquei = false;
			
			for (int i = 0 ; i < (vetor.length - 1) ; i++) {
				if (vetor[i] > vetor[i+1]) {
					temp = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = temp;
					
					troquei = true;
				}
			}
		}
	}
}

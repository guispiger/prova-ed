package prova.ed.q6;

import java.util.ArrayList;
import java.util.Collections;

public class Navio {
	private ArrayList<Bagagem> compartimentoBagagens = new ArrayList<Bagagem>();
		
	public void armazenarBagagens(ArrayList<Bagagem> bagagens) {
		Collections.sort(bagagens, Collections.reverseOrder());
			
		Bagagem[] comp = new Bagagem[bagagens.size()];
			
		int posicaoFim = bagagens.size()-1;
		int posicaoInicio = 0;
		for (int i = 0; i < bagagens.size(); i++) {
			if(i % 2 != 0) {
				comp[posicaoFim] = bagagens.get(i);
				posicaoFim--;
			} else {
				comp[posicaoInicio] = bagagens.get(i);
				posicaoInicio++;
			}
		}
		
		for (Bagagem bagagem : comp) {
			this.compartimentoBagagens.add(bagagem);
		}
		
	}

	public ArrayList<Bagagem> getCompartimentoBagagens() {
		return compartimentoBagagens;
	}

	public void setCompartimentoBagagens(ArrayList<Bagagem> compartimentoBagagens) {
		this.compartimentoBagagens = compartimentoBagagens;
	}
}

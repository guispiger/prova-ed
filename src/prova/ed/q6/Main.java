package prova.ed.q6;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		LeitorCSV leitor = new LeitorCSV();	
		
		ArrayList<Bagagem> bagagens = leitor.lerArquivo();
		
		Navio navio = new Navio();
		
		navio.armazenarBagagens(bagagens);
		
		ArrayList<Bagagem> compartimentoBagagensNavio = navio.getCompartimentoBagagens();
		
		for (Bagagem bagagem : compartimentoBagagensNavio) {
			System.out.println(bagagem);
		}
	}
}
 
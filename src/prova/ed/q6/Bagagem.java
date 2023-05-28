package prova.ed.q6;

import java.math.BigDecimal;

public class Bagagem implements Comparable<Bagagem> {
	private String id;
	private String proprietario;
	private BigDecimal peso;

	public Bagagem(String id, String proprietario, BigDecimal peso) {
		super();
		this.id = id;
		this.proprietario = proprietario;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "ID:" + id + " Proprietario:" + proprietario + " Peso:" + peso + " Kg";
	}
	
	@Override
	public int compareTo(Bagagem o) {
		return this.peso.compareTo(o.getPeso());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

}

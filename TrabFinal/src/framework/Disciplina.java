package framework;

public abstract class Disciplina implements IDisciplina {

	private int ID, credito;
	private String nome, ementa;

	public Disciplina(int ID, int credito, String nome, String ementa) {
		this.ID = ID;
		this.credito = credito;
		this.nome = nome;
		this.ementa = ementa;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	@Override
	public String toString() {
		return "ID: " + this.getID() + " || " + this.getNome() + ", " + this.getCredito() + " créditos";
	}

}

package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Professor {

	private int ID;
	private String nome, email, areaFormacao;
	private List<Turma> turmas = new ArrayList<>();

	public Professor(int ID, String nome, String email, String areaFormacao) {
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.areaFormacao = areaFormacao;
	}

	public List<Turma> getTurmas() {
		return this.turmas;
	}

	public void addTurma(Turma turma) {
		this.turmas.add(turma);
	}

	public void removeTurma(Turma turma) {
		this.turmas.remove(turma);
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAreaFormacao() {
		return areaFormacao;
	}

	public void setAreaFormacao(String areaFormacao) {
		this.areaFormacao = areaFormacao;
	}

}

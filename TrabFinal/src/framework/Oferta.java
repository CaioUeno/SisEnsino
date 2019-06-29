package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Oferta {
	private int ID;
	private List<Turma> turmas = new ArrayList<>();

	public Oferta(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void addTurma(Turma turma) {
		this.turmas.add(turma);
	}

	public void removeTurma(Turma turma) {
		this.turmas.remove(turma);
	}
}

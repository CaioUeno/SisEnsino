package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Aluno implements IAluno {

	private int ID;
	private String nome, email;
	protected Grade grade;
	private List<Turma> turmas = new ArrayList<>();
	protected List<NotaDisciplina> notasDisciplinas = new ArrayList<>();

	public Aluno(int ID, String nome, String email, Grade grade) {
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.grade = grade;
	}

	public Turma getTurma(int ID) {
		Turma t = null;
		for (Turma r : turmas) {
			if (r.getID() == ID) {
				t = r;
			}
		}
		return t;
	}

	public void addTurma(Turma turma, NotaDisciplina notaT) {
		this.turmas.add(turma);
		this.addNotasDisciplinas(notaT);
	}

	public void removeTurma(int ID) {
		Turma turma = getTurma(ID);
		if (turma == null) {
			System.out.println("Aluno não faz parte dessa turma.");
			return;
		}
		this.turmas.remove(turma);
		NotaDisciplina nt = getnotaT(turma);
		this.removeNotasDisciplinas(nt);
	}

	public NotaDisciplina getnotaT(Turma turma) {
		NotaDisciplina nt = null;
		for (NotaDisciplina n : notasDisciplinas) {
			if (n.getDisciplina() == turma.getDisciplina()) {
				nt = n;
			}
		}
		return nt;
	}

	public void addNotasDisciplinas(NotaDisciplina notaturma) {
		this.notasDisciplinas.add(notaturma);
	}

	public void removeNotasDisciplinas(NotaDisciplina notaturma) {
		this.notasDisciplinas.remove(notaturma);
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

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public List<NotaDisciplina> getNotasTurmas() {
		return notasDisciplinas;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public abstract double getNotaDisciplina(int ID);

	public abstract void updateGrade();
}

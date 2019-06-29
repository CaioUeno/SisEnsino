package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Grade implements IGrade {

	protected List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private Curso curso;

	public Grade(Curso curso) {
		this.curso = curso;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void listarDisciplinas() {
		for(Disciplina d : disciplinas) {
			System.out.println(d);
		}
	}
	
	public abstract void addDisciplina(Disciplina disciplina);

	public abstract void removeDisciplina(Disciplina disciplina);

	public abstract void gerarHistorico();

	public abstract void changeStatusDisciplina(Disciplina disciplina, double nota);

}

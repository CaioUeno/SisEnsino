package framework;

public abstract class NotaDisciplina {

	private Aluno aluno;
	private Disciplina disciplina;
	private double nota;

	public NotaDisciplina(Aluno aluno, Disciplina disciplina, double nota) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
		this.getAluno().getGrade().changeStatusDisciplina(this.disciplina, nota);
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}

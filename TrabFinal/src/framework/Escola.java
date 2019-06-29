package framework;

import java.util.ArrayList;
import java.util.List;


public class Escola {
	
	private String nome;
	private List<Turma> turmas = new ArrayList<>();
	private List<Aluno> alunos = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();
	private static Escola instancia;

	public Escola(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Escola EscolaC(String nome) {
		if (instancia == null) {
			instancia = new Escola(nome);
		}
		return instancia;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void addProfessor(Professor professor) {
		this.professores.add(professor);
	}

	public void removeProfessor(Professor professor) {
		this.professores.remove(professor);
	}

	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void removeAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}

	public void addTurma(Turma turma) {
		this.turmas.add(turma);
	}

	public void removeTurma(Turma turma) {
		this.turmas.remove(turma);
	}

	public Turma getTurmaID(int ID) {
		for (int i = 0; i < this.turmas.size(); i++) {
			if (this.turmas.get(i).getID() == ID) {
				return this.turmas.get(i);
			}
		}
		return null;
	}

	public Aluno getAlunoID(int ID) {
		for (int i = 0; i < this.alunos.size(); i++) {
			if (this.alunos.get(i).getID() == ID) {
				return this.alunos.get(i);
			}
		}
		return null;
	}

	public Professor getProfessorID(int ID) {
		for (int i = 0; i < this.professores.size(); i++) {
			if (this.professores.get(i).getID() == ID) {
				return this.professores.get(i);
			}
		}
		return null;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
}

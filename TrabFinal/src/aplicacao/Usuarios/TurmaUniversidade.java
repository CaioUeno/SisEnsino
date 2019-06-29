package aplicacao.Usuarios;

import java.util.ArrayList;
import java.util.List;

import framework.Disciplina;
import framework.Professor;
import framework.Turma;

public class TurmaUniversidade extends Turma {

	private List<Professor> professores = new ArrayList<>();

	public TurmaUniversidade(int iD, Disciplina disciplina, String dataInicio, String dataFim) {
		super(iD, disciplina, dataInicio, dataFim);
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public void addProfessor(Professor professor) {
		this.professores.add(professor);
	}

	public void removeProfessor(Professor professor) {
		this.professores.remove(professor);
	}
	
	public int getQtdeProfessores() {
		return professores.size();
	}

}

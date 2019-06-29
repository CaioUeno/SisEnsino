package framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Turma {

	private int ID;
	private Disciplina disciplina;
	private String dataInicio, dataFim;
	private List<Aluno> alunos = new ArrayList<>();
	private List<SalaHorario> salaHorarios = new ArrayList<>();

	public Turma(int iD, Disciplina disciplina, String dataInicio, String dataFim) {
		super();
		ID = iD;
		this.disciplina = disciplina;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public int getQuantidadeAlunos() {
		return alunos.size();
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Aluno getAluno(int ID) {
		Aluno a = null;
		for (Aluno al : alunos) {
			if (al.getID() == ID) {
				a = al;
				break;
			}
		}
		return a;
	}

	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void removeAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}

	public void addSalaHorario(SalaHorario salahorario) {
		this.salaHorarios.add(salahorario);
	}

	public void removeSalaHorario(SalaHorario salahorario) {
		this.salaHorarios.remove(salahorario);
	}

	public List<SalaHorario> getSalaHorarios() {
		return salaHorarios;
	}
	
	public void listarSalaHorarios() {
		for(SalaHorario sh : salaHorarios) {
			System.out.println(sh);
		}
	}

	public void setSalaHorarios(List<SalaHorario> salaHorarios) {
		this.salaHorarios = salaHorarios;
	}

	public int getCreditos() {
		return this.disciplina.getCredito();
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
}
